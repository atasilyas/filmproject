package com.pounds.io.assignment.filmproject.controller;


import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.dto.FilmRateDto;
import com.pounds.io.assignment.filmproject.service.FilmRateService;
import com.pounds.io.assignment.filmproject.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:9090/")
@RestController
@RequestMapping("filmRateApi")
@RequiredArgsConstructor
public class FilmRateController {


    private final FilmRateService filmRateService;

    @PostMapping("/createFilmRate")
    public ResponseEntity<?>  createFilm(@Valid @RequestBody FilmRateDto filmRateDto) {
        filmRateService.createFilmRate(filmRateDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getFilmRateById/{filmId}")
    public ResponseEntity<?> getFilmRateById(@PathVariable("filmId") Long filmId) {
        return new ResponseEntity<List<FilmRateDto>>(filmRateService.getAllFilm(filmId), HttpStatus.OK);
    }

}
