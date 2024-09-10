Sorting ise sorgu sonucunda dönen verileri belirli bir sıraya göre sıralamak için kullanılır. 

kullanım açısından term query de kullanmak iyi olabilir sebebi ise term query de sadece bir değer döner. 

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
  },
  "sort": [
    {
      "products.base_price": {
        "order": "desc"
      }
    }
  ]
} -> burada sortin içinde products.base_price alanına göre desc yani büyükten küçüğe sıralama yapılacaktır. 
```