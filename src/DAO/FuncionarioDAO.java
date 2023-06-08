/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Funcionario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MMMM
 */
public class FuncionarioDAO {

    public void cadastrarFuncionarioDAO(Funcionario fVO) {

        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into funcionario values (null, ?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, fVO.getIdFuncionario());
            pst.setString(2, fVO.getRg());
            pst.setString(3, fVO.getNome());
            pst.setString(4, fVO.getSexo());
            pst.setString(5, fVO.getDtNasc());
            pst.setString(6, fVO.getCelular());
            pst.setString(7, fVO.getEmail());
            pst.setString(8, fVO.getEndereco());
            pst.setInt(9, fVO.getCep());
            pst.setInt(10, fVO.getCartao());
            pst.setString(11, fVO.getDtAdmissao());
            pst.setInt(12, fVO.getSenha());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }

    public ArrayList<Funcionario> getListFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from funcionario";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Funcionario f = new Funcionario();
                //lado do java |x| (lado do banco)
                f.setIdFuncionario(rs.getInt("IdFuncionario"));
                f.setRg(rs.getString("rg"));
                f.setNome(rs.getString("nome"));
                f.setSexo(rs.getString("SexoUsuario"));
                f.setDtNasc(rs.getString("dtNasc"));
                f.setCelular(rs.getString("celular"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setCep(rs.getInt("cep"));
                f.setCartao(rs.getInt("cartao"));
                f.setDtAdmissao(rs.getString("dtAdmissao"));
                f.setSenha(rs.getInt("senha"));
                funcionarios.add(f);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return funcionarios;

    }

    public Funcionario getFuncionarioByDoc(String cpf) {
        Funcionario e = new Funcionario();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from funcionario where cpf = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                e.setIdFuncionario(rs.getInt("IdFuncionario"));
                e.setRg(rs.getString("rg"));
                e.setNome(rs.getString("nome"));
                e.setSexo(rs.getString("SexoUsuario"));
                e.setDtNasc(rs.getString("dtNasc"));
                e.setCelular(rs.getString("celular"));
                e.setEmail(rs.getString("email"));
                e.setEndereco(rs.getString("endereco"));
                e.setCep(rs.getInt("cep"));
                e.setCartao(rs.getInt("cartao"));
                e.setDtAdmissao(rs.getString("dtAdmissao"));
                e.setSenha(rs.getInt("senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CPF!\n"
                    + ex.getMessage());
        }
        return e;
    }

    public void deletarFuncionarioDAO(String cpf) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from funcionario where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Funcionario!\n"
                    + ex.getMessage());
        }
    }
    
    public void atualizaFuncionarioByDoc(Funcionario eVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update funcionarios set rg = ? , nome = ? , SexoUsuario = ? , dtNasc = ? , celular = ? , email = ? , endereco = ? , cep = ? , cartao = ? ,dtAdmissao = ? , senha = ?  ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, eVO.getRg());
            pst.setString(2, eVO.getNome());
            pst.setString(3, eVO.getSexo());
            pst.setString(4, eVO.getDtNasc());
            pst.setString(5, eVO.getCelular());
            pst.setString(6, eVO.getEmail());
            pst.setString(7, eVO.getEndereco());
            pst.setInt(8, eVO.getCep());
            pst.setInt(9, eVO.getCartao());
            pst.setString(10, eVO.getDtAdmissao());
            pst.setInt(11, eVO.getSenha());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Funcionario!\n"
                    + ex.getMessage());
        }
    }

 
}//fimDao

