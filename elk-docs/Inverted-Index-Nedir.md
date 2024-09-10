
![elk-25](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-25.png)


![elk-26](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-26.png)

# Nasıl Çalışır?

- Doküman Ekleme: Doküman veri tabanına eklendiğinde, Inverted Index her kelimeyi (terimi) indeksler ve bu kelimenin hangi dokümanda geçtiğini kaydeder.

Örnek: Diyelim ki iki dokümanınız var:

"Elasticsearch is a search engine."
"Inverted index is used in search engines."

Inverted Index şu şekilde olacaktır:

```java
"Elasticsearch" -> [Doc1]
"is"           -> [Doc1, Doc2]
"a"            -> [Doc1]
"search"       -> [Doc1, Doc2]
"engine"       -> [Doc1]
"Inverted"     -> [Doc2]
"index"        -> [Doc2]
"used"         -> [Doc2]
"engines"      -> [Doc2]
```
- Arama Yapma: Kullanıcı bir sorgu gönderdiğinde (örneğin "search engine"), Inverted Index bu sorguda yer alan kelimeleri alır ve hangi dokümanlarda bu kelimelerin geçtiğini hızlıca bulur. Ardından ilgili dokümanları sıralayarak sonuç döner.

