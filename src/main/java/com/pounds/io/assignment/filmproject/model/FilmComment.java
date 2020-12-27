package com.pounds.io.assignment.filmproject.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name = "film_comment")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(callSuper = true)
@ToString()
public class FilmComment extends BaseEntity {

    @NotNull(message = "Name cannot be null")
    @Length(min = 3, max = 20)
    private String commentOwnerName;

    @NotNull(message = "Name cannot be null")
    @Length(min = 3, max = 256)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date commentTime;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private Film film;
}
