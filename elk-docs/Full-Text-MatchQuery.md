```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match": {
      "customer_full_name": "Diane"
    }
  }
} -> burada Diane isimli müşteriye ait tüm verileri getirir. bu sorgu sonucunda _score puanlaması yapılır ve en yüksek skor alan veri en üstte listelenir. en yüksek skor ise Diane kelimesinin kaç kez geçtiğine ve kaç kez geçtiğine bağlıdır. 
```



```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match": {
      "customer_full_name": "Diane ALvarez"
    }
  }
} -> burada diana ayrı alvarez ayrı aranır ve bu iki kelimenin bir arada geçtiği veriler getirilir. 
```

```json

POST kibana_sample_data_ecommerce/_search
{
  "query": {
    "match": {
      "customer_full_name":{
        "query": "Diane Alvarez",
        "operator": "and"
      }
    }
  }
} -> burada diana ve alvarez aynı anda geçen veriler getirilir. bunu sağlayan operator and operatörüdür. 
```
