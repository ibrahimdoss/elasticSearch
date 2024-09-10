windcard ise belirli bir pattern'e uyan değerleri getirmek için kullanılır. bu sql de like operatörüne benzer. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "wildcard": {
      "customer_first_name.keyword": {
        "value": "Tari?"
      }
    }

  }
} -> burada customer_first_name alanı Tari ile başlayan ve sonrasında 1 karakter daha olan değerleri getirir. ? ile bir karakteri temsil eder.

```

```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "wildcard": {
      "customer_first_name.keyword": {
        "value": "*te"
      }
    }

  }
} -> burada customer_first_name alanı herhangi bir değer ile başlayan ve sonrasında te olan değerleri getirir. * ile bir veya birden fazla karakteri temsil eder.

```
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "wildcard": {
      "customer_first_name.keyword": {
        "value": "*te*"
      }
    }

  }
} -> burada customer_first_name alanı herhangi bir değer ile başlayan ve sonrasında te olan ve sonrasında herhangi bir değer olan değerleri getirir. * ile bir veya birden fazla karakteri temsil eder.

```