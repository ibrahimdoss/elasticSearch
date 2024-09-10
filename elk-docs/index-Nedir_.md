![elk-18](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-18.png)

elastic search de index nedir ?

Index : ElasticSearch'de verilerin saklandığı yerdir. Bir index, bir veya daha fazla shard'dan oluşur. Bir shard, bir index'in bölümlerinden biridir. Bir index'in primary shard ve replica shard'lardan oluşur. Primary shard, index'e yazılan verilerin ilk olarak yazıldığı yerdir. Replica shard, primary shard'dan gelen verilerin yedeklenmesi için kullanılır. Replica shard'lar, primary shard'dan gelen verileri alır ve saklarlar. Replica shard sayısı, index oluşturulurken belirlenir ve daha sonra değiştirilebilir.

kapsam kaymaması olması için dataları gruplamak lazım. bu gruplamaya index denir

veritabanın da table ne ise elastic search de index odur.

indexlerin içinde belirli bir yapıda veriler tutulur. bu yapıya mapping denir.
