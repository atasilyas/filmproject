package com.pounds.io.assignment.filmproject.controller;


import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:9090/")
@RestController
@RequestMapping("filmApi")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @PostMapping("/createFilm")
    public ResponseEntity<?> createFilm(@Valid @RequestBody FilmDto filmDto) {
        filmService.createFilm(filmDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAllFilm")
    public ResponseEntity<?> getAllFilm() {
        return new ResponseEntity<List<FilmDto>>(filmService.getAllFilm(), HttpStatus.OK);
    }

    @GetMapping("/findById/{filmId}")
    public ResponseEntity<?> getFilmById(@PathVariable("filmId") Long filmId) {
        return new ResponseEntity<FilmDto>(filmService.findById(filmId), HttpStatus.OK);
    }

}
