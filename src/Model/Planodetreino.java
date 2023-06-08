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
    private int idPlanodeTreino;
    private String series;
    private float carga;
    private int repeticoes;
    
    
    public Planodetreino() {
    }

    public Planodetreino(int idPlanodeTreino, String series, float carga, int repeticoes) {
        this.idPlanodeTreino = idPlanodeTreino;
        this.series = series;
        this.carga = carga;
        this.repeticoes = repeticoes;
    }

    public int getIdPlanodeTreino() {
        return idPlanodeTreino;
    }

    public void setIdPlanodeTreino(int idPlanodeTreino) {
        this.idPlanodeTreino = idPlanodeTreino;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    @Override
    public String toString() {
        return "Planodetreino{" + "idPlanodeTreino=" + idPlanodeTreino + ", series=" + series + ", carga=" + carga + ", repeticoes=" + repeticoes + '}';
    }
    
    
}
