![elk-19](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-19.png)

![elk-20](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-20.png)

![elk-21](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-21.png)


data stream -> verilerin akışı yani sürekli akan verileri organize  eder.

Elasticsearch'te Data Stream, sürekli olarak gelen zaman serisi verilerini depolamak ve yönetmek için kullanılan bir yapılandırmadır. Genellikle loglar, izleme verileri, metrikler ve diğer zaman serisi verileri gibi sürekli akışlar için idealdir. Data Stream, zamanla gelen verilerin indekslenmesini ve yönetilmesini kolaylaştırır ve arka planda bir dizi "backing index" kullanarak çalışır.

# Data Stream'in temel özellikleri:
- Zaman Serisi Verisi: Data Stream'ler genellikle zaman damgası içeren verileri işler. Veriler zaman damgasına göre sıralanır ve indekslenir.

- Arka Planda Çalışan Backing Index'ler: Bir Data Stream, birden fazla indeksle ilişkilidir. Yeni veriler, aktif indeks olarak adlandırılan en güncel indekse eklenir. Eski indeksler "silinemez" ya da değiştirilmez, bu da veri bütünlüğünü sağlar.

- Sürekli Veri Yazımı: Data Stream'e sürekli olarak veri yazılabilir ve bu yazım işlemi otomatik olarak yeni indekslere bölünür. Elasticsearch, yeni indeks oluşturma işlemlerini zaman damgasına göre otomatik olarak yönetir.

- Rollover Mekanizması: Belirli bir indeks boyutuna ya da zamana ulaşıldığında, Elasticsearch eski indeksin kapatılmasını ve yeni bir indeksin oluşturulmasını sağlar. Bu işlem rollover olarak bilinir.

# Data Stream'in Kullanım Amacı:
- Log Yönetimi: Örneğin, sistem logları, uygulama logları ya da erişim logları gibi sürekli olarak akış halinde olan verileri toplamak için kullanılır.
- Metrik İzleme: Sunucu, uygulama ya da altyapı metriklerinin düzenli olarak depolanması için uygundur.
- Güvenlik İzleme: Ağ veya güvenlik verilerini analiz etmek için kullanılan zaman serisi verilerinin yönetiminde tercih edilir.


# Data Stream oluşturma: Data Stream oluştururken, önce ilgili bir indeks şablonu (index template) oluşturulur ve ardından Data Stream yapılandırılır.

```java

PUT _index_template/my-template
{
  "index_patterns": ["mystream*"],
  "data_stream": {}
}


```

## Data Stream'e veri ekleme:

```java

POST /mystream/_doc/
{
  "@timestamp": "2023-01-01T12:00:00Z",
  "message": "Log kaydı"
}


```


## Data Stream'i görüntüleme:
GET /_data_stream/mystream

