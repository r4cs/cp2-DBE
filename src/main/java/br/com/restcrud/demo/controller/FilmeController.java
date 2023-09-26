package br.com.restcrud.demo.controller;

import br.com.restcrud.demo.entity.filme.DadosCadastroFilme;
import br.com.restcrud.demo.entity.filme.DadosListagemFilme;
import br.com.restcrud.demo.entity.filme.Filme;
import br.com.restcrud.demo.entity.filme.FilmeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroFilme dados) {
        System.out.println(dados);
        repository.save(new Filme(dados));
    }

//    @GetMapping
//    public Page<DadosListagemFilme> listar (
//            @PageableDefault(size=5, sort={"titulo"}) Pageable paginacao) {
//        return repository.findAll(paginacao).map(DadosListagemFilme::new);
//    }
}
