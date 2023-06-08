
package Model;


public class Plano {
    private int id;
    private String nome;
    private float valor;
    private int vencimento;
   

    public Plano() {
    }

    public Plano(int id, String nome, float valor, int vencimento) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Plano{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + ", vencimento=" + vencimento + '}';
    }

    
}
