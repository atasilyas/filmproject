package com.pounds.io.assignment.filmproject.service;

import com.pounds.io.assignment.filmproject.dto.FilmDto;

import java.util.List;

public interface FilmService {

    void createFilm(FilmDto filmDto);

    List<FilmDto> getAllFilm();

    FilmDto findById(Long filmId);
}
