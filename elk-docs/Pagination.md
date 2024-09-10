pagination ise sorgu sonucunda çok fazla veri döndüğünde bu verileri sayfalar halinde göstermeye yarar. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "size":2,
  "from": 50, 
  "query": {
    "fuzzy": {
      "customer_first_name.keyword": {
        "value": "ane",
        "fuzziness": 2
      }
    }

  }
} -> burada size 2 olduğu için 2 veri dönecektir. from 50 olduğu için 50. veriden başlayarak 2 veri dönecektir. 
```
