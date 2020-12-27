package com.pounds.io.assignment.filmproject.service;

import com.pounds.io.assignment.filmproject.dto.FilmCommentDto;

import java.util.List;

public interface FilmCommentService {

    void  createFilmComment(FilmCommentDto filmCommentDto);

    List<FilmCommentDto> getFilmComments(Long filmId);
}
