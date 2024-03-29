// DUPLA:
// RAQUEL CALMON (RM97373)
// MARIO ITO (RM96950)

package br.com.restcrud.demo.entiity.fichaTecnica;

import jakarta.persistence.Embeddable;

@Embeddable
public class FichaTecnica {

    private String direcao;
    private String elenco;
    private String roteiro;
    private String classificacao_indicativa;
    private String producao;

    public FichaTecnica(DadosFichaTecnica dados) {
        this.direcao = dados.direcao();
        this.elenco = dados.elenco();
        this.roteiro = dados.roteiro();
        this.classificacao_indicativa = dados.classificacao_indicativa();
        this.producao = dados.producao();
    }

    public FichaTecnica() {

    }


    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public String getClassificacao_indicativa() {
        return classificacao_indicativa;
    }

    public void setClassificacao_indicativa(String classificacaoIndicativa) {
        this.classificacao_indicativa = classificacao_indicativa;
    }

    public String getProducao() {
        return producao;
    }

    public void setProducao(String producao) {
        this.producao = producao;
    }

    public void atualizarInformacoes(DadosFichaTecnica dados) {
        if (dados.direcao() != null) {
            this.direcao = dados.direcao();
        }
        if (dados.elenco() != null) {
            this.elenco = dados.elenco();
        }
        if (dados.roteiro() != null) {
            this.roteiro = dados.roteiro();
        }
        if (dados.classificacao_indicativa() != null) {
            this.classificacao_indicativa = dados.classificacao_indicativa();
        }
        if (dados.producao() != null) {
            this.producao = dados.producao();
        }

    }
}
