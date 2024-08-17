package com.elastic_search.project.service;

import com.elastic_search.project.dto.MusteriSaveRequestDto;
import com.elastic_search.project.model.Musteri;
import com.elastic_search.project.repository.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {

    private final MusteriRepository musteriRepository;


    public Musteri save(MusteriSaveRequestDto musteriSaveRequestDto) {
        return musteriRepository.save(Musteri.builder()
                .name(musteriSaveRequestDto.getName())
                .surname(musteriSaveRequestDto.getSurname())
                .age(musteriSaveRequestDto.getAge())
                .fullName(musteriSaveRequestDto.getName() + " " + musteriSaveRequestDto.getSurname())
                .isActive(true)
                .build());
    }

    public Iterable<Musteri> getAll() {
        return musteriRepository.findAll();
    }
}
