// DUPLA:
// RAQUEL CALMON (RM97373)
// MARIO ITO (RM96950)

package br.com.restcrud.demo.entity.filme;

public record DadosListagemFilme(
        Long id,
        String titulo,
        String atorPrincipal,
        String duracao,
        Genero genero,
        String direcao
) {
    public DadosListagemFilme(Filme filme) {
        this(
                filme.getId(),
                filme.getTitulo(),
                filme.getAtor_principal(),
                filme.getDuracao(),
                filme.getGenero(),
                filme.getFicha_tecnica().getDirecao()
        );
    }
}
