package com.pounds.io.assignment.filmproject.dto;

import com.pounds.io.assignment.filmproject.model.Film;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
public class FilmCommentDto {

    private String commentOwnerName;

    private String description;

    private Date commentTime;

    private Long id;

    private FilmDto filmDto;
}
