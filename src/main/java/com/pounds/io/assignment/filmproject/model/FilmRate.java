package com.pounds.io.assignment.filmproject.model;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name = "film_rate")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString()
public class FilmRate extends  BaseEntity{

    @Size(min = 0, max = 5)
    private Integer rate;
    private String ratedBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date retedDate;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

}
