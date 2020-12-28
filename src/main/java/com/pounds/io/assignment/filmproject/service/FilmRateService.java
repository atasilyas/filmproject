package com.pounds.io.assignment.filmproject.service;

import com.pounds.io.assignment.filmproject.dto.FilmRateDto;

import java.util.List;

public interface FilmRateService {

    void createFilmRate(FilmRateDto filmRateDto);

    List<FilmRateDto> getAllFilm(Long filmId);
}
