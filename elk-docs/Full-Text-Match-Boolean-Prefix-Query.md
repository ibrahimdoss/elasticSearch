match boolean prefix query ise birden fazla kelimenin bir arada olmasını istediğimizde kullanılır.  yani birden fazla kelimenin bir arada olmasını istiyorsak kullanırız. 
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match_bool_prefix":{
      "customer_full_name":{
        "query":"De"
      }
    }
  }
} -> burada customer_full_name alanında De ile başlayanları getirir.
```
```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match_bool_prefix":{
      "customer_full_name":{
        "query":"Elektr"
      }
    }
  }
} -> burada customer_full_name alanında Elektr ile başlayanları getirir. yani burada elektroknik, elektrik gibi kelimeleri getirir.
```

bunun wildcard ve prefixden farkı ise birden fazla kelimenin bir arada olmasını istememizdir. yani birden fazla kelimenin bir arada olmasını istediğimizde kullanırız. 

## ayrıca wildcarddan daha performanslıdır. wildcardda tüm veriyi tarar. fakat match_bool_prefix sadece verilen kelime ile başlayanları getirir.