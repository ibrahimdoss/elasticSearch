package com.elastic_search.project.controller;

import com.elastic_search.project.dto.MusteriSaveRequestDto;
import com.elastic_search.project.model.Musteri;
import com.elastic_search.project.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/musteri")
public class MusteriController {
    private final MusteriService musteriService;

    @PostMapping("/save")
    public ResponseEntity<Musteri> save(@RequestBody MusteriSaveRequestDto musteriSaveRequestDto) {
        Musteri musteri = musteriService.save(musteriSaveRequestDto);
        return ResponseEntity.ok(musteri);
    }

    @GetMapping("/get-all")
    public ResponseEntity<Iterable<Musteri>> getAll() {
        return ResponseEntity.ok(musteriService.getAll());
    }
}
