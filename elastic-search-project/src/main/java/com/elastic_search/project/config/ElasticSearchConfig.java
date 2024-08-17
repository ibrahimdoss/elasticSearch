package com.elastic_search.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;


@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {

    //elastic search Connection type 1

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
    }


    //TODO: Aşağıdaki taraf multi node için. SSL ayarlarının da yapılması gerekiyor.
    // Single node için yukarıdaki gibi yapılabilir.
/*    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .usingSsl()
                .withDefaultHeaders(createHeaders())
                .build();
    }

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "ApiKey QlZMeXRwQUJFLVlNQ2szWUpBYlM6aVhFa19iQzVTVG1jazlvcGpsMHo1dw==");
        return headers;
    }*/
}
