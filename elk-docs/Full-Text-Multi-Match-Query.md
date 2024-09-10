multi match query ise birden fazla alanı aynı anda aramak için kullanılır. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "multi_match": {
      "query": "Yuri",
      "fields": ["customer_first_name","customer_last_name"]
    }
  }
} -> burada birden fazla alanı aynı anda arıyoruz.  yani yuri kelimesi hem customer_first_name hemde customer_last_name alanlarında aranıyor.
```

```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "multi_match": {
      "query": "ri",
      "fields": ["customer_first_name","customer_last_name"],
      "fuzziness": 2
    }
  }
} -> burada ise yuri kelimesinin içindeki harflerden 2 tanesi yanlış olabilir. 
```