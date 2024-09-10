# ELASTICSEARCH

## BAĞLANTI TÜRLERİ VE KONFİGURASYONLARI

###  1- SingleNode Elasticsearch Bağlantı yöntemleri

singlenode üzerinde ssl pasif edildiği ve username, şifre girilmediği için bağlantı konusunda çok sorun yaşanmamaktadır.
bir spring projesini elasticsearch'e bağlamak istiyorsak ek bir ayar yapmadan direkt bağlanmak mümkündür. Spring starter genellikle uygulamaların default yapılandırmalarını kullanarak initialize eder. Ancak eğer farklı bir adres, port, güvenlik ayarları barındırıyorsa elle bu ayarları yapmamız gerekmektedir.

### YML Dosyası ile Bağlantı

```yml

spring:
  elasticsearch:
      uris: http://localhost:9200
      username: elastic
      password: changeme

```

### Springboot configuration bean ile bağlantı

```java

@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .usingSsl()
                .build();
    }
}

```


## 2- MultiNode & Cloude Bağlantı Yöntemleri

Burada dikkat edilmesi gereken hususlar şunlardır, multi node bağlantıların bir birleri arasında iletişmi için sertifika kullanılmaktadır. Bu nedenle doğru konfigure edilmiş SSL yapılandırmasını kullanarak bağlantı yapabilirsiniz. Bunu local de yaparsanız bazı SSL ayarlarını doğru yapılandırmanız gereklidir. Çoğu kullanıcı bunu tercih etmeyecektir. Bu nedenle bir cloud sistem üzerinde elastic servislerini kullanmak daha doğru olacaktır.

SSL yapılandırması olan bir elasticsearch node'na bağlanabilmek için configurasyon yapılandırmasını yapmanız gereklidir. Bunu yapabilmek için ;

ilk olarak elasticsearch bağlantısını nasıl yapacağınıza karar vermeliyiz genellikle basic auth tercih edilmez ama eğer yapacaksanız username ve password bilgisine ihtiyaç duyacağım.

Diğer bir seçenek ve tercih edilen seçenek ise, ApiKey ile bağlantı kurmaktır. Bunun için size bazı bilgilerin verilmiş olması gereklidir. ApiKey bilgilerini Elasticsearch'ü kullandığınız bulut sunucu üzerinden elde edebileceğiniz gibi, local de kullanıyorsanız kendinize yeni bir apiKey oluşturabiliriz. Önek bir ApiKey oluşturma kodu;

```json

POST /_security/api_key
{
  "name":"elastic-api-key",
  "expiration": "1d",
  "role_descriptors": {
    "role-a":{
      "cluster":["all"],
      "indices":[
        {
          "names":["index-a*"],
          "privileges":["read"]
        }
      ]
    },
    "role-b":{
      "cluster":["all"],
      "indices":[
        {
          "names":["index-b*"],
          "privileges":["read"]
        }
      ]
    }
  },
  "metadata":{
    "application":"my-application1",
    "environment":{
      "level":1,
      "trusted":true,
      "tags":["dev","staging"]
    }
  }
}

```


### Elasticsearch Object Mapping and MetaModel

Elasticsearch ile java sınıflarının eşleşmesini sağlamak için MetaModel tabanlı bir yaklaşım uygulanır. Böylece sınıf, değişken gibi kavramlar eşleştirilebilir.

En sık kullandığımız annotationlar şunlardır;

@Document : Elasticsearch'de bir index'i temsil eder. indexName, type, shards, replicas gibi parametreler alabilir.
@Transient : Elasticsearch'de bir field'ın indexlenmesini istemiyorsak bu annotation kullanılır. yani db'ye kayıt edilmeyeceğini bildirir.
@ReadOnlyProperty : Elasticsearch'de bir field'ın sadece okunabilir olduğunu belirtir.
@Field : Elasticsearch'de bir field'ın indexlenme şeklini belirtir. type, format, analyzer gibi parametreler alabilir.
analzyer, normalizer: alanın hangi özel analizörler ve normalizörlerle indexleneceğini belirtir.