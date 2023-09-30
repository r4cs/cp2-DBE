// DUPLA:
// RAQUEL CALMON (RM97373)
// MARIO ITO (RM96950)

package br.com.restcrud.demo.entity.filme;

import br.com.restcrud.demo.entiity.fichaTecnica.DadosFichaTecnica;
import jakarta.validation.constraints.NotNull;

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
