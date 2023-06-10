package Model;

import java.sql.Date;

public class Cliente {

    private int IdCliente;
    private String nome;
    private String endereco;
    private String dataNascimento;
    private String altura;
    private String peso;
    private String imc;
    private String ultimoAcesso;
    private String cpf;
    private Plano plano;

    public Cliente() {
    }

    public Cliente(int IdCliente, String nome, String endereco, String dataNascimento, String altura, String peso, String imc, String ultimoAcesso, String cpf, Plano plano) {
        this.IdCliente = IdCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.ultimoAcesso = ultimoAcesso;
        this.cpf = cpf;
        this.plano = plano;
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", altura=" + altura + ", peso=" + peso + ", imc=" + imc + ", ultimoAcesso=" + ultimoAcesso + ", cpf=" + cpf + ", plano=" + plano + '}';
    }

    

}
