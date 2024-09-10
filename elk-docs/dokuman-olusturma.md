![doc-create](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/doc-create.png)

----------------------------------------

![doc-get](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/doc-get.png)

doc-get görsel de ise olusturduğumuzu listeledik. görselin sağında üst tarafı indexe ait bilgiler. _source'dan itibaren ise bizim create ettiğimiz index.


-----------------------------------------
![doc-get-2](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/doc-get-2.png)

doc-get-2 de ise _source ile get isteği atarak direkt olusturduğumuz dokumanı görebiliriz.


# Notlar

- olmayan bir dokumanı olusturduğumuz zaman otomatik bir mapping islemi de gerceklesir.

- dokuman da güncelleme yaparken 5 properties var. ama update kısmında biz sadece 2 tanesini yazıp update yaparsak, diğer alanlara dokunmaz.

- dokuman da her islem sonrasında _version otomatik olarak artar.


```java
PUT urun/_doc/12

{
  "id":454,
  "barkod":32423423,
  "urunAd":"macbook pro",
  "fiyat":55543.99,
  "uretimTarihi":"2024/05/23"
}-> burada ürün indexi olusturup icerisine dokuman ekleyecek.

```
------------------------------------------
![mapping](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/mapping.png)


otomatik mapping islemini mapping görselinde gösterildi. tek tek eklediğimiz alanların propertieslerini kendisi otomatik eşleştirmiş.

--------------------------------------------

![mapping-3](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/mapping-3.png)


burada biz mappingi kendimiz olusturunca bizim propertieslere göre mapler. Ama biz kendimiz elle mapping de propertiesleri ayarlamazsak kendisi otomatik mapler.
örnek olarak: satıs dokumanında biz long,text vs verdik ve propertiesleri ona göre olusturdu. ama satis1 diyip yeni bir dokuman olusturduk ve bu sefer mappingini kendimiz yapmadık. Bu sefer tüm alanlar long geldi çünkü değer ne ise otomatik o tipe cevirdi.



-----------

elk-30 görseli ile elk-30-1 görseli aslında tek görsel. elk-30-1, elk-30 görselin devamı.

elk-31-1,elk-31-2, elk-31-3 bu üç görsel elk-31 görseli gibi olacak şekilde düzenlenecek.