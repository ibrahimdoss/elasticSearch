package com.elastic_search.project.model;


import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "musteri")
@TypeAlias("musteriClass") // Bu annotation ile veritabanında hangi class'ın hangi collection'a karşılık geldiğini belirtebiliriz.
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Musteri {

    @Id
    private String id;

    private String name;

    private String surname;

    @Transient
    private String fullName;

    private Long age;

    private Boolean isActive;

}
