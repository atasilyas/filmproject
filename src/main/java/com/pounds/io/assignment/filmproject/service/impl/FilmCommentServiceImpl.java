package com.pounds.io.assignment.filmproject.service.impl;

import com.pounds.io.assignment.filmproject.dto.FilmCommentDto;
import com.pounds.io.assignment.filmproject.mapper.FilmCommentMapper;
import com.pounds.io.assignment.filmproject.model.Film;
import com.pounds.io.assignment.filmproject.model.FilmComment;
import com.pounds.io.assignment.filmproject.repository.FilmCommentRepository;
import com.pounds.io.assignment.filmproject.repository.FilmRepository;
import com.pounds.io.assignment.filmproject.service.FilmCommentService;
import com.pounds.io.assignment.filmproject.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmCommentServiceImpl implements FilmCommentService {

    private final FilmCommentRepository filmCommentRepository;
    private final FilmCommentMapper mapper;
    private final FilmRepository filmRepository;

    @Override
    @SneakyThrows
    public void createFilmComment(FilmCommentDto filmCommentDto) {
        FilmComment filmComment = mapper.dto2Entity(filmCommentDto);
        Film film = filmRepository.findById(filmComment.getFilm().getId()).orElseThrow();
        filmComment.setFilm(film);
        filmCommentRepository.save(filmComment);
    }

    @Override
    public List<FilmCommentDto> getFilmComments(Long filmId) {
        List<FilmCommentDto> filmCommentDtos = new ArrayList<>();
        for (FilmComment filmComment : filmCommentRepository.findAllByFilmId(filmId)) {
            filmCommentDtos.add(this.mapper.entity2Dto(filmComment));
        }
        return filmCommentDtos;
    }
}
