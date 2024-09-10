Bucket aggregation Elasticsearch'te, belirli bir kritere göre belgeleri gruplara (veya "bucket"lara) ayıran bir tür arama sorgulama yöntemidir. Bu yöntem, büyük veri setlerindeki belgeleri kategorilere ayırarak, bu kategorilere göre analiz yapmayı ve özet bilgiler elde etmeyi kolaylaştırır. Her bir bucket, belirli bir kritere uyan belgeleri içerir ve bu bucketlar üzerinde çeşitli metrik ve istatistik hesaplamaları yapılabilir.

Örneğin, bir e-ticaret sitesindeki ürünlerin kategorilere göre satış istatistiklerini analiz etmek istiyorsanız, "terms" bucket aggregation kullanarak ürünlerin hangi kategorilere ait olduğunu gruplayabilir ve her bir kategori için satış sayılarını hesaplayabilirsiniz. Bu, hangi kategorilerin daha popüler olduğunu veya hangi kategorilerin daha fazla satış getirdiğini anlamanıza yardımcı olur.

```json
GET kibana_sample_data_ecommerce/_search
{
  "_source": false, 
  "aggs": {
    "bucket_gruplama": {
      "terms": {
        "field": "category.keyword"
      }
    }
  }
} -> burada kategorilere göre gruplama yapıyoruz.
```

output:

```json

"aggregations": {
    "bucket_gruplama": {
      "doc_count_error_upper_bound": 0,
      "sum_other_doc_count": 0,
      "buckets": [
        {
          "key": "Men's Clothing",
          "doc_count": 2024
        },
        {
          "key": "Women's Clothing",
          "doc_count": 1903
        },
        {
          "key": "Women's Shoes",
          "doc_count": 1136
        },
        {
          "key": "Men's Shoes",
          "doc_count": 944
        },
        {
          "key": "Women's Accessories",
          "doc_count": 830
        },
        {
          "key": "Men's Accessories",
          "doc_count": 572
        }
      ]
    }
  }
```