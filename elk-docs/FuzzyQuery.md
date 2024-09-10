fuzzy ise benzer değerleri getirmek için kullanılır. yazdığım kelimeye benzer olan değerleri getirir. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "fuzzy": {
      "customer_first_name.keyword": {
        "value": "iane"
      }
    }

  }
} -> bu sorgu iane kelimesine benzer değerleri getirecektir. 
```
```json
POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "fuzzy": {
      "customer_first_name.keyword": {
        "value": "iane",
        "fuzziness": 0.5
      }
    }

  }
} -> bu sorgu iane kelimesine benzer değerleri getirecektir. Fuzziness değeri 0.5 olduğu için 1 karakterlik farklılıkları da getirecektir. 
bu değeri arttırırsam daha fazla farklılık getirir. örnekte 1.0 yaparsam 2 karakterlik farklılıkları da getirecektir. 
```