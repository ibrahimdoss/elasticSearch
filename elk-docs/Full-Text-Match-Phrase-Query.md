phrase query ise birden fazla kelimenin bir arada olmasını istediğimizde kullanılır. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match": {
      "products.category": "Women's Clothing"
    }
}
} -> burada product category alanında women clothing olanları getirir.
```

birebir aratmak istiyorsak match_phrase kullanırız. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match_phrase": {
      "products.category": "Women's Clothing"
    }
}
}
```

```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match_phrase": {
      "products.category": {
        "query": "Women's Clothing",
        "slop": 2
      }
    }
}
} -> burada slop ile aradığımız kelimenin kaç kelime uzaklıkta olabileceğini belirtebiliriz. yani 2 kelime uzaklıkta olabilir.
```
