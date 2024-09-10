![elk-17](https://github.com/ibrahimdoss/elasticSearch/blob/main/images/elk-17.png)

bu kavramları tek tek açıkla.

ya da görseli chatgptye atıp açıklama yapmasını iste.

- cluster: birden fazla node'un bir araya gelerek oluşturduğu yapıdır. cluster içerisindeki node'lar birbirleriyle haberleşir ve verileri paylaşırlar. cluster içerisindeki node'lar arasında master node, data node, client node gibi roller olabilir.

- node: cluster içerisindeki her bir fiziksel veya sanal makineye node denir. node'lar cluster içerisindeki verileri saklarlar ve işlerler. node'lar arasında master node, data node, client node gibi roller olabilir.

- primary shard: bir index'in bölümlerinden biridir. bir index, primary shard ve replica shard'lardan oluşur. primary shard, index'e yazılan verilerin ilk olarak yazıldığı yerdir. bir index'in primary shard sayısı belirlenirken index oluşturulurken belirlenir ve daha sonra değiştirilemez.

- replica shard: bir index'in bölümlerinden biridir. bir index, primary shard ve replica shard'lardan oluşur. replica shard, primary shard'dan gelen verilerin yedeklenmesi için kullanılır. replica shard'lar, primary shard'dan gelen verileri alır ve saklarlar. replica shard sayısı, index oluşturulurken belirlenir ve daha sonra değiştirilebilir.
