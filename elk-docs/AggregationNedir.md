aggregation, verileri gruplandırma, filtreleme, sıralama ve özetleme işlemlerini yapmak için kullanılan bir Elasticsearch özelliğidir. Aggregation, SQL'deki GROUP BY ve COUNT gibi işlemleri yapmamıza olanak sağlar.

```json
GET kibana_sample_data_ecommerce/_search
{
  "aggs": {
    "ahmet_amca_nasilsin": {
      "stats": {
        "field": "total_quantity"
      }
    }
  }
} -> burada total_quantity alanı için istatistiksel bilgileri alıyoruz. ahmet_amca_nasilsin isimli bir aggregation oluşturduk.
```