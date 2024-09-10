range query ise belirli bir aralıktaki değerleri getirmek için kullanılır. 
```json
POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "range": {
      "products.base_price": {
        "gte": 10,
        "lte": 20 
      }
    }
  } -> burada base_price 10 ile 20 arasındaki değerleri getirir. 10 ve 20 dahil.
},


POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "range": {
      "products.base_price": {
        "gt": 10,
        "lt": 20 
      }
    }
  } -> burada ise base_price 10 ile 20 arasındaki değerleri getirir. 10 ve 20 hariç.
}

```