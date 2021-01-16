package com.pounds.io.assignment.filmproject.controller;


import com.pounds.io.assignment.filmproject.service.FilmTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:9090/")
@RestController
@RequestMapping("filmTypeApi")
@RequiredArgsConstructor
public class FilmTypeController {

    private  final FilmTypeService filmTypeService;

    @GetMapping("/{id}")
    public String getTypeById(@PathVariable("id") String id){

        return filmTypeService.getTypeById(id);
    }

}
