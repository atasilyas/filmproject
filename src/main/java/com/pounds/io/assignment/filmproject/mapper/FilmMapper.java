package com.pounds.io.assignment.filmproject.mapper;

import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.model.Film;
import org.springframework.stereotype.Component;

@Component
public class FilmMapper {

    public Film dto2Entity(FilmDto filmDto) {
        Film film = null;
        if (filmDto != null) {
            film = new Film();
            film.setName(filmDto.getName());
            film.setDirectorName(filmDto.getDirectorName());
            film.setReleaseDate(filmDto.getReleaseDate());
            film.setUrl(filmDto.getUrl());
            film.setId(filmDto.getFilmId());
        }
        return film;
    }

    public FilmDto entity2Dto(Film film) {
        FilmDto filmDto = null;
        if (film != null) {
            filmDto = new FilmDto();
            filmDto.setName(film.getName());
            filmDto.setDirectorName(film.getDirectorName());
            filmDto.setReleaseDate(film.getReleaseDate());
            filmDto.setUrl(film.getUrl());
            filmDto.setFilmId(film.getId());
        }
        return filmDto;
    }
}
