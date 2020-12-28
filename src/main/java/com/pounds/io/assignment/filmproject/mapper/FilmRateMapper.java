package com.pounds.io.assignment.filmproject.mapper;

import com.pounds.io.assignment.filmproject.dto.FilmRateDto;
import com.pounds.io.assignment.filmproject.model.FilmRate;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface FilmRateMapper {

    FilmRate dto2Entity(FilmRateDto dto);
    FilmRateDto entity2Dto(FilmRate filmId);
}

