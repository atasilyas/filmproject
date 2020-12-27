package com.pounds.io.assignment.filmproject.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class FilmDto {

    private String name;

    private String directorName;

    private Date releaseDate;

    private String url;

    private Long filmId;
}
