package com.livros.controller;

import com.livros.model.Livros;
import com.livros.service.LivrosService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Controller("/livros")
@RequiredArgsConstructor
public class LivrosController {

    private final LivrosService livrosService;

    @Get
    List<Livros> listAll () {
        return livrosService.listAll();
    }

    @Get("/{codigo}")
    Optional<Livros> findByCodigo (String codigo) {
        return livrosService.findByCodigo(codigo);
    }
}
