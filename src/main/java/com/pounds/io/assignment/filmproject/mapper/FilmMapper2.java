package com.pounds.io.assignment.filmproject.mapper;

import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.dto.FilmRateDto;
import com.pounds.io.assignment.filmproject.model.Film;
import com.pounds.io.assignment.filmproject.model.FilmRate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilmMapper2 {
    Film dto2Entity(FilmDto dto);
    FilmDto entity2Dto(Film filmId);
}
