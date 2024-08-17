package com.elastic_search.project.repository;

import com.elastic_search.project.model.Musteri;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface MusteriRepository extends ElasticsearchRepository<Musteri, Long>{

    Iterable<Musteri> findAllByNameLike(String name);

    List<Musteri> findAllByNameAndSurname(String name, String surname);

    @Query("select m from musteri m")
    Stream<Musteri> findAllStream();

    Page<Musteri> findAllByNameLike(String name, Pageable pageable);

    @Async
    Future<Musteri> findAllByName(String name);
}
