package Model;

public class Funcionario {
    private int IdFuncionario;
    private String rg;
    private String cpf;
    private String nome;
    private String sexo;
    private String dtNasc;
    private String celular;
    private String email;
    private String endereco;
    private int cep;
    private int cartao;
    private String dtAdmissao;
    private int senha;
    
 public Funcionario() {
    }

    public Funcionario(int IdFuncionario, String rg, String cpf, String nome, String sexo, String dtNasc, String celular, String email, String endereco, int cep, int cartao, String dtAdmissao, int senha) {
        this.IdFuncionario = IdFuncionario;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.cartao = cartao;
        this.dtAdmissao = dtAdmissao;
        this.senha = senha;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "IdFuncionario=" + IdFuncionario + ", rg=" + rg + ", cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + ", celular=" + celular + ", email=" + email + ", endereco=" + endereco + ", cep=" + cep + ", cartao=" + cartao + ", dtAdmissao=" + dtAdmissao + ", senha=" + senha + '}';
    }

   
    
 
}
