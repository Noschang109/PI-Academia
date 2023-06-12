/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MMMM
 */
public class Planodetreino {
    private int idPlano;
    private String nomePlano;
    private String series;
    private int repeticoes;
    
    
    public Planodetreino() {
    }

    public Planodetreino(int idPlano, String nomePlano, String series, int repeticoes) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    @Override
    public String toString() {
        return "Planodetreino{" + "idPlano=" + idPlano + ", nomePlano=" + nomePlano + ", series=" + series + ", repeticoes=" + repeticoes + '}';
    }

    
}
