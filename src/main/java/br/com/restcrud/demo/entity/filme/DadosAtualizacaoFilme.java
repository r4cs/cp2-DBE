package br.com.restcrud.demo.entity.filme;

import br.com.restcrud.demo.fichaTecnica.DadosFichaTecnica;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoFilme (
        @NotNull
        Long id,
        String titulo,

        String ator_principal,

        String duracao,

        String ano_de_lancamento,

        String pais_de_origem,

        Genero genero,

        DadosFichaTecnica ficha_tecnica


) { }
