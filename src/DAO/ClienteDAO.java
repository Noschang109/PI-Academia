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
            sql = "insert into cliente values (null,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEndereco());
            pst.setString(3, cVO.getDataNascimento());
            pst.setFloat(4, cVO.getAltura());
            pst.setFloat(5, cVO.getPeso());
            pst.setString(6, cVO.getUltimoAcesso());
            pst.setString(7, cVO.getCpf());

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
                c.setEndereco(rs.getString("endereco"));
                c.setDataNascimento(rs.getString("dataNascimento"));
                c.setAltura(rs.getFloat("altura"));
                c.setPeso(rs.getFloat("peso"));
                c.setImc(rs.getString("imc"));
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
                c.setPeso(rs.getFloat("peso"));
                c.setImc(rs.getString("imc"));
                c.setUltimoAcesso(rs.getString("ultimoAcesso"));
                c.setCpf(rs.getString("cpf"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setDataNascimento(rs.getString("dataNascimento"));
                c.setAltura(rs.getFloat("altura"));
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
            String sql = "update cliente set peso = ? , imc = ? , ultimoAcesso = ? , cpf = ? , nome = ? , endereco = ? , dataNascimento = ? ,altura = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, caVO.getNome());
            pst.setString(2, caVO.getImc());
            pst.setString(3, caVO.getUltimoAcesso());
            pst.setString(4, caVO.getCpf());
            pst.setString(5, caVO.getNome());
            pst.setString(6, caVO.getEndereco());
            pst.setString(6, caVO.getDataNascimento());
            pst.setFloat(7, caVO.getAltura());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Cliente!\n"
                    + ex.getMessage());
        }
    }
}//fimDAO
