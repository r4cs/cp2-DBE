package br.com.restcrud.demo.controller;

import br.com.restcrud.demo.entity.filme.*;
import jakarta.transaction.Transactional;
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
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFilme dados) {
        System.out.println(dados);
        repository.save(new Filme(dados));
    }

    @GetMapping
    public Page<DadosListagemFilme> listar ( @PageableDefault(size=5, sort={"titulo"})
            Pageable paginacao
    ) {
//        return repository.findAll(paginacao).map(DadosListagemFilme::new);
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemFilme::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoFilme dados) {
        Filme filme = new Filme();
        filme = repository.getReferenceById(dados.id());
        filme.atualizarInformacoes(dados);
    }

//    @DeleteMapping("/{id}")
//    @Transactional
//    public void excluir(@PathVariable Long id) {
//        repository.deleteById(id);
//    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        Filme filme = new Filme();
        filme = repository.getReferenceById(id);
        filme.excluir();
    }


}
