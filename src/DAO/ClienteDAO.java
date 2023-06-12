package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Cliente;

public class ClienteDAO {

    public void cadClienteDAO(Cliente cVO) {
        Connection con = Conexao.getConexao();
        try {
            String sql;
            sql = "insert into cliente values (null,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getCpf());
            pst.setString(3, cVO.getIdade());
            pst.setString(4, cVO.getEndereco());
            pst.setString(5, cVO.getPeso());
            pst.setString(6, cVO.getAltura());
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Cliente!\n"
                    + ex.getMessage());
        }

    }

    public ArrayList<Cliente> getClientesDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from cliente";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("IDCliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setIdade(rs.getString("idade"));
                c.setEndereco(rs.getString("endereco"));
                c.setPeso(rs.getString("peso"));
                c.setAltura(rs.getString("altura"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Erro ao Listar!\n\n"
                    + ex.getMessage());
        }
        return clientes;
    }//fimListar

    public Cliente atuClienteByDoc(String cpf) {
        Cliente c = new Cliente();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from cliente where cpf = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //lado do java |x| (lado do banco)
                c.setIdCliente(rs.getInt("IdCliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setIdade(rs.getString("idade"));
                c.setEndereco(rs.getString("endereco"));
                c.setPeso(rs.getString("peso"));
                c.setAltura(rs.getString("altura"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CPF!\n"
                    + ex.getMessage());
        }
        return c;
    }

    public void deletarClienteDAO(String cpf) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from cliente where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar CPF!\n"
                    + ex.getMessage());
        }
    }

    public void atualizaClienteByDoc(Cliente caVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update cliente set   nome = ? , cpf  = ? , idade     = ? , endereco = ? ,peso  = ? , altura = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, caVO.getNome());

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Cliente!\n"
                    + ex.getMessage());
        }
    }
}//fimDAO
