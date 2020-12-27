package com.pounds.io.assignment.filmproject.mapper;

import com.pounds.io.assignment.filmproject.dto.FilmCommentDto;
import com.pounds.io.assignment.filmproject.dto.FilmDto;
import com.pounds.io.assignment.filmproject.model.Film;
import com.pounds.io.assignment.filmproject.model.FilmComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FilmCommentMapper {

    private final FilmMapper filmMapper;

    public FilmComment dto2Entity(FilmCommentDto filmCommentDto) {
        FilmComment filmComment = null;
        if (filmCommentDto != null) {
            filmComment = new FilmComment();
            filmComment.setFilm(this.filmMapper.dto2Entity(filmCommentDto.getFilmDto()));
            filmComment.setCommentTime(filmCommentDto.getCommentTime());
            filmComment.setDescription(filmCommentDto.getDescription());
            filmComment.setId(filmCommentDto.getId());
            filmComment.setCommentOwnerName(filmCommentDto.getCommentOwnerName());
            filmComment.setDescription(filmCommentDto.getDescription());
        }
        return filmComment;
    }

    public FilmCommentDto entity2Dto(FilmComment filmComment) {
        FilmCommentDto filmCommentDto = null;
        if (filmComment != null) {
            filmCommentDto = new FilmCommentDto();
            filmCommentDto.setFilmDto(this.filmMapper.entity2Dto(filmComment.getFilm()));
            filmCommentDto.setCommentTime(filmComment.getCommentTime());
            filmCommentDto.setDescription(filmComment.getDescription());
            filmCommentDto.setId(filmComment.getId());
            filmCommentDto.setCommentOwnerName(filmComment.getCommentOwnerName());
            filmCommentDto.setDescription(filmComment.getDescription());
        }
        return filmCommentDto;
    }
}
