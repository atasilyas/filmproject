package com.pounds.io.assignment.filmproject.service.impl;

import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.mapper.FilmMapper;
import com.pounds.io.assignment.filmproject.model.Film;
import com.pounds.io.assignment.filmproject.repository.FilmRepository;
import com.pounds.io.assignment.filmproject.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;
    private final FilmMapper mapper;

    @Override
    public void createFilm(FilmDto filmDto) {
        Film film = this.mapper.dto2Entity(filmDto);
        filmRepository.save(film);
    }

    @Override
    public List<FilmDto> getAllFilm() {
        List<FilmDto> filmDtos = new ArrayList<>();
        for (Film film : filmRepository.findAll()) {
            filmDtos.add(this.mapper.entity2Dto(film));
        }
        return filmDtos;
    }

    @Override
    public FilmDto findById(Long filmId) {
        return this.mapper.entity2Dto(filmRepository.findById(filmId).orElse(null));
    }


}
