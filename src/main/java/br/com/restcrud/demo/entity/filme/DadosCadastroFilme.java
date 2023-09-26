package br.com.restcrud.demo.entity.filme;

import br.com.restcrud.demo.fichaTecnica.DadosFichaTecnica;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroFilme(

//        Long id,

        @NotBlank
        String titulo,

        @NotBlank
        String ator_principal,

//        @NotBlank
        @Pattern(regexp = "\\d{2,3}")
        String duracao,

//        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String ano_de_lancamento,

        @NotBlank
        String pais_de_origem,

        @NotNull
        Genero genero,

        @NotNull
        @Valid
        DadosFichaTecnica ficha_tecnica

) {

}
