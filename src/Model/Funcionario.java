package Model;

public class Funcionario {

    private int IdFuncionario;
    private String cpf;
    private String rg;
    private String nome;
    private String celular;
    private String endereco;
    private String cep;    

    public Funcionario() {
    }

    public Funcionario(int IdFuncionario, String cpf, String rg, String nome, String celular, String endereco, String cep) {
        this.IdFuncionario = IdFuncionario;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
        this.cep = cep;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "IdFuncionario=" + IdFuncionario + ", cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", celular=" + celular + ", endereco=" + endereco + ", cep=" + cep + '}';
    }

    
}
