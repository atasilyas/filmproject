package com.pounds.io.assignment.filmproject.repository;

import com.pounds.io.assignment.filmproject.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmRepository extends JpaRepository<Film,Long> {
}
