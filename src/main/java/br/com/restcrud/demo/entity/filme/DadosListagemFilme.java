package br.com.restcrud.demo.entity.filme;

public record DadosListagemFilme(
        String titulo,
        String atorPrincipal,
        String duracao,
        Genero genero,
        String direcao
) {
    public DadosListagemFilme(Filme filme) {
        this(
                filme.getTitulo(),
                filme.getAtor_principal(),
                filme.getDuracao(),
                filme.getGenero(),
                filme.getFicha_tecnica().getDirecao()
        );
    }
}
