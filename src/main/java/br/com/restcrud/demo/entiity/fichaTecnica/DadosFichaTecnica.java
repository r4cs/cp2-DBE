// DUPLA:
// RAQUEL CALMON (RM97373)
// MARIO ITO (RM96950)

package br.com.restcrud.demo.entiity.fichaTecnica;

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
