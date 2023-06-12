/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Planodetreino;
/**
 *
 * @author MMMM
 */
public class PlanodeTreinoDAO {

    public void cadastrarPlanoDAO(Planodetreino pVO) {
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into plano values (null, ?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNomePlano());
            pst.setString(2, pVO.getSeries());
            pst.setInt(3, pVO.getRepeticoes());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Plano!\n"
                    + ex.getMessage());
        }
    }

    public void deletarPlanoDAO(int idplano) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from plano where idplano = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idplano);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Plano!\n"
                    + ex.getMessage());
        }
    }

    public void atualizaPlanoByDoc(Planodetreino cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update plano  set nomeplano = ?, serie = ? , repeticoes = ? where idplano = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNomePlano());
            pst.setString(2, cVO.getSeries());
            pst.setInt(3, cVO.getRepeticoes());
            pst.setInt(4, cVO.getIdPlano());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Plano!\n"
                    + ex.getMessage());
        }
    }

    public ResultSet getPlanoBOX() throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "SELECT nomeplano FROM plano ORDER BY nomeplano ASC;";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public Planodetreino getPlano(String Plano) {// Inicio GET
        Planodetreino p = new Planodetreino();
        Connection con = Conexao.getConexao();
        try {
            String sql = "SELECT idplano FROM plano WHERE nomeplano = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Plano);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                p.setIdPlano(rs.getInt("idplano"));                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar Planos!\n" + ex.getMessage());
        }
        return p;
    }// Fim GET
}
