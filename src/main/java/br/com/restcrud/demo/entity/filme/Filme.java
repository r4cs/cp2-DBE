package br.com.restcrud.demo.entity.filme;

import br.com.restcrud.demo.fichaTecnica.FichaTecnica;
import jakarta.persistence.*;

@Table(name="FILMES")
@Entity(name="Filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme_id_seq")
//    @SequenceGenerator(name="filme_id_seq", sequenceName = "filme_id_seq")
    private Long id;

    private String titulo;
    private String ator_principal;
    private String  duracao;
    private String ano_de_lancamento;
    private String pais_de_origem;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private FichaTecnica ficha_tecnica;

    public Filme(DadosCadastroFilme dados) {
        this.titulo = dados.titulo();
        this.ator_principal = dados.ator_principal();
        this.duracao = dados.duracao();
        this.ano_de_lancamento = dados.ano_de_lancamento();
        this.pais_de_origem = dados.pais_de_origem();
        this.genero = dados.genero();
        this.ficha_tecnica = new FichaTecnica(dados.ficha_tecnica());
    }

    public Filme() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAtor_principal() {
        return ator_principal;
    }

    public void setAtor_principal(String ator_principal) {
        this.ator_principal = ator_principal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAno_de_lancamento() {
        return ano_de_lancamento;
    }

    public void setAno_de_lancamento(String ano_de_lancamento) {
        this.ano_de_lancamento = ano_de_lancamento;
    }

    public String getPais_de_origem() {
        return pais_de_origem;
    }

    public void setPais_de_origem(String pais_de_origem) {
        this.pais_de_origem = pais_de_origem;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public FichaTecnica getFicha_tecnica() {
        return ficha_tecnica;
    }

    public void setFicha_tecnica(FichaTecnica ficha_tecnica) {
        this.ficha_tecnica = ficha_tecnica;
    }

    public void atualizarInformacoes(DadosAtualizacaoFilme dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.ator_principal() != null) {
            this.ator_principal = dados.ator_principal();
        }
        if (dados.duracao() != null) {
            this.duracao = dados.duracao();
        }
        if (dados.ano_de_lancamento() != null) {
            this.ano_de_lancamento = dados.ano_de_lancamento();
        }
        if (dados.pais_de_origem() != null) {
            this.pais_de_origem = dados.pais_de_origem();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }
        if (dados.ficha_tecnica() != null) {
            this.ficha_tecnica.atualizarInformacoes(dados.ficha_tecnica());
        }

    }
}
