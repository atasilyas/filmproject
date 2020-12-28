package com.pounds.io.assignment.filmproject.service.impl;

import com.pounds.io.assignment.filmproject.dto.FilmRateDto;
import com.pounds.io.assignment.filmproject.mapper.FilmRateMapper;
import com.pounds.io.assignment.filmproject.model.FilmRate;
import com.pounds.io.assignment.filmproject.repository.FilmRateRepository;
import com.pounds.io.assignment.filmproject.service.FilmRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmRateServiceImpl implements FilmRateService {

    private final FilmRateRepository filmRateRepository;

    private final FilmRateMapper mapper;

    @Override
    public void createFilmRate(FilmRateDto filmRateDto) {
        this.filmRateRepository.save(mapper.dto2Entity(filmRateDto));
    }

    @Override
    public List<FilmRateDto> getAllFilm(Long filmId) {
        List<FilmRateDto> filmRateDtos =  new ArrayList<>();
        for (FilmRate filmRate : filmRateRepository.findAllByFilmId(filmId))
        {
            filmRateDtos.add(this.mapper.entity2Dto(filmRate));
        }
        return filmRateDtos;
    }

}
