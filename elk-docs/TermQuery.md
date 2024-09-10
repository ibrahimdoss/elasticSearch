```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "term": {
      "customer_first_name.keyword": {
        "value": "Elyssa"
      }
    }
  }
} -> bu bir terim sorgusu yapar. Elyssa olanları getirir. full text search yapmaz. 

```

```json
POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "term": {
      "customer_first_name.keyword": {
        "value": "Elyssa",
        "case_insensitive":true
      }
    }
  }
} -> case sensitive aktif edilirse Elyssa ve elyssa aynı sonucu verir.

```

```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "terms": {
      "customer_first_name.keyword": [
        "Tariq", "Yuri"
        ]
    }
  }
} -> burada birden fazla terim sorgusu yapar. Tariq ve Yuri olanları getirir. in sorgusu gibi düşünebiliriz.

```