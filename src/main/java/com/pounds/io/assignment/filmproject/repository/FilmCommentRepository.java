package com.pounds.io.assignment.filmproject.repository;

import com.pounds.io.assignment.filmproject.model.Film;
import com.pounds.io.assignment.filmproject.model.FilmComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmCommentRepository extends JpaRepository<FilmComment,Long> {

    List<FilmComment> findAllByFilmId(Long filmId);
 }
