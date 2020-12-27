package com.pounds.io.assignment.filmproject.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@DynamicUpdate
@Table(name = "film")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(callSuper = true)
@ToString()
public class Film extends BaseEntity{

    @NotNull(message = "Name cannot be null")
    @Length(min = 3, max = 20)
    private String name;

    @NotNull(message = "Director Name cannot be null")
    @Length(min = 3, max = 20)
    private String directorName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;

    private String url;

/*
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<FilmComment> filmCommentList =  new ArrayList<>();*/

}
