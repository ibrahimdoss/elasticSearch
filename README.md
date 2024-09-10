# elasticSearch
- sanal bellek alanlarının sayısının düşük olması (vm.max_map_count). Bu değeri artırmanız gerekiyor. -> ELK'yı compose ile run etmeden önce yapılması lazım.
- sudo sysctl -w vm.max_map_count=262144 -> bu geçici olarak arttırılır.

# 1- Docker Network olusturma
- docker network create elb-network
# 2-
docker run -d --name elasticsearch --net elb-network -p 9200:9200 -p 9300:9300 -e "xpack.security.enabled=false" -e "xpack.security.transport.ssl.enabled=false" -e "discovery.type=single-node" -e "ELASTIC_USERNAME=admin" -e "ELASTIC_PASSWORD=root" -e "ES_JAVA_OPTS=-Xms512m -Xmx1024m" elasticsearch:8.12.1
- ssl -> disable etmek lazım etmezsek ssl sertifikalarını ayarlamak lazım.

- elk -> apache lucence kullanıyordu bu da java da calısıyordu. -> burada elk'nin kullanacağı rami min ve max olarak belirtmek lazım yoksa elk 24 gb'a kadar rami tahsis etmeye calısır.

# 3- Kibana Kurulum
- kibana: postgresql de pgadmin veri yönetme aracı olarak vardır bir yönetim appi olarak.
kibana da buna benzer, kibana da ise elk'nin ui gibi diyebiliriz.

docker run -d --name kibana --net elb-network -p 5601:5601 kibana:8.12.1

  
