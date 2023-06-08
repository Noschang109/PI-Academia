package Model;

import java.sql.Date;

public class Cliente {

    private int IdCliente;
    private int plano;
    private String nome;
    private String endereco;
    private String dataNascimento;
    private float altura;
    private float peso;
    private String imc;
    private String ultimoAcesso;
    private String cpf;

    public Cliente() {
    }

    public Cliente(int IdCliente, int plano, String nome, String endereco, String dataNascimento, float altura, float peso, String imc, String ultimoAcesso, String cpf) {
        this.IdCliente = IdCliente;
        this.plano = plano;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.ultimoAcesso = ultimoAcesso;
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(String ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", plano=" + plano + ", nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", altura=" + altura + ", peso=" + peso + ", imc=" + imc + ", ultimoAcesso=" + ultimoAcesso + ", cpf=" + cpf + '}';
    }

    
    
    
}
