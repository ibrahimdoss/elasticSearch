
```json
GET kibana_sample_data_ecommerce/_search
{
  "aggs": {
    "ahmet_amca_nasilsin": {
      "max": {
        "field": "products.base_price"
      }
    }
  }
} -> burada maks değer istatistiğini alıyoruz.
```

```json
GET kibana_sample_data_ecommerce/_search
{
  "aggs": {
    "ahmet_amca_nasilsin": {
      "stats": {
        "field": "taxful_total_price"
      }
    }
  }
} -> burada stats ilee istatistik alıyoruz.

output:

  "aggregations": {
    "ahmet_amca_nasilsin": {
      "count": 4675,
      "min": 6.98828125,
      "max": 2250,
      "avg": 75.05542864304813,
      "sum": 350884.12890625
    }
  }
```