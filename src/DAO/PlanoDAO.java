/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Model.Plano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MMMM
 */
public class PlanoDAO {

    public void cadastrarPlanoDAO(Plano pVO) {
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into plano values (null, ?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, pVO.getId());
            pst.setString(2, pVO.getNome());
            pst.setFloat(3, pVO.getValor());
            pst.setInt(4, pVO.getVencimento());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Plano!\n"
                    + ex.getMessage());
        }
    }
    public void deletarPlanoDAO(String cpf) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from plano where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Plano!\n"
                    + ex.getMessage());
        }
    }
     public void atualizaPlanoByDoc(Plano cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update plano where funcionario set nome = ?, valor = ?, vencimento = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setFloat(2, cVO.getValor());
            pst.setInt(3, cVO.getVencimento());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Plano!\n"
                    + ex.getMessage());
        }
    }
}
