package com.pounds.io.assignment.filmproject.repository;

import com.pounds.io.assignment.filmproject.dto.FilmRateDto;
import com.pounds.io.assignment.filmproject.model.FilmRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRateRepository extends JpaRepository<FilmRate, Long> {

    List<FilmRate> findAllByFilmId(Long filmId);
}
