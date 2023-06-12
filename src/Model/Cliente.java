package Model;

import java.sql.Date;

public class Cliente {

    private int IdCliente;
    private String nome;
    private String cpf  ;
    private String idade  ;
    private String endereco ;
    private  String peso ;
    private String altura ;

    public Cliente() {
    }

    public Cliente(int IdCliente, String nome, String cpf, String idade, String endereco, String peso, String altura) {
        this.IdCliente = IdCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", endereco=" + endereco + ", peso=" + peso + ", altura=" + altura + '}';
    }

    
      
}
