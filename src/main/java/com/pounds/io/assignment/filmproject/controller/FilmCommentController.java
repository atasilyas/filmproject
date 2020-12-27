package com.pounds.io.assignment.filmproject.controller;


import com.pounds.io.assignment.filmproject.dto.FilmCommentDto;
import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.service.FilmCommentService;
import com.pounds.io.assignment.filmproject.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:9090/")
@RestController
@RequestMapping("filmCommentApi")
@RequiredArgsConstructor
public class FilmCommentController {

    private final FilmCommentService filmService;

    @PostMapping("/createFilmComment")
    public ResponseEntity<?> createFilm(@Valid @RequestBody FilmCommentDto filmCommentDto)
    {
        filmService.createFilmComment(filmCommentDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getFilmComments/{filmId}")
    public ResponseEntity<?> getFilmComments(@PathVariable("filmId") Long filmId)
    {
        return new ResponseEntity<List<FilmCommentDto>>(filmService.getFilmComments(filmId), HttpStatus.OK);
    }
}
