Global aggregation, Elasticsearch'te, sorgu kapsamını belirli bir kritere göre sınırlamak yerine, tüm belgeler üzerinde çalışan bir bucket aggregation türüdür. Bu, belirli bir filtre veya sorgu kriteri tarafından sınırlanmaksızın, tüm belge seti üzerinde genel bir özet veya analiz yapmak istediğinizde kullanılır.

Örneğin, belirli bir kategoriye ait ürünler üzerinde çalışan bir sorgunuz varsa ve bu ürünlerin satış istatistiklerini hesaplarken, aynı zamanda tüm ürünler arasında genel bir karşılaştırma yapmak istiyorsanız, global aggregation kullanabilirsiniz. Bu, belirli bir kategoriye odaklanan sorgunuzun kapsamını aşarak, tüm veri seti üzerinde genel bir analiz yapmanıza olanak tanır.

 ```json
GET kibana_sample_data_ecommerce/_search
{
  "query": {
    "term": {
      "products.category.keyword": {
        "value": "Men's Clothing"
      }
    }
  },
  "aggs": {
    "all_docs": {
      "global": {},
      "aggs": {
        "avg_base_price": {
          "avg": {
            "field": "products.base_price"
          }
        }
      }
    },
    "active_men_avg_price": {
      "avg": {
        "field": "products.base_price"
      }
    }
  }
} -> burada global aggregation kullanarak, tüm belgeler üzerinde ortalama baz fiyatı hesaplar ve aynı zamanda sadece erkek giyim kategorisindeki ürünlerin ortalama baz fiyatını hesaplar.


output:

  "aggregations": {
    "all_docs": {
      "doc_count": 4675,
      "avg_base_price": {
        "value": 34.88652318578368
      }
    },
    "active_men_avg_price": { -> yukarısı tüm dataset için, aşağısı sadece erkek giyim kategorisi için
      "value": 33.44366762508395
    }
  }
```
