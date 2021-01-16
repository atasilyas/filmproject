package com.pounds.io.assignment.filmproject.service.impl;

import com.pounds.io.assignment.filmproject.repository.FilmTypeRepository;
import com.pounds.io.assignment.filmproject.service.FilmTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FilmTypeServiceImpl implements FilmTypeService {

    private final FilmTypeRepository filmTypeRepository;

    @Override
    public String getTypeById(String id) {
        return filmTypeRepository.findById(Long.parseLong(id)).get().getType();
    }

}
