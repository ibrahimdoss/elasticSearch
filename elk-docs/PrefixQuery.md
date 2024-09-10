prefix query ile term query arasındaki farkı görebiliriz. Prefix query ile başlangıç harfleri aynı olanları getirirken term query ile tam eşleşenleri getirir.

```json
POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "prefix": {
      "customer_first_name.keyword": {
        "value": "Yu"
      }
    }
  }
} -> burada customer_first_name alanında başlangıç harfi Yu olanları getirir. Yur, Yuri, Yurii gibi isimler getirir.

```