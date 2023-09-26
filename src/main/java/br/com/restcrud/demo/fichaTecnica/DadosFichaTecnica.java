package br.com.restcrud.demo.fichaTecnica;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
        @NotBlank
        String direcao,
        @NotBlank
        String elenco,
        @NotBlank
        String roteiro,
        String classificacao_indicativa,
        @NotBlank
        String producao
) {
}
