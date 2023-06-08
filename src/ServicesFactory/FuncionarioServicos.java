/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesFactory;

import DAO.DAOFactory;
import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author MMMM
 */
public class FuncionarioServicos {

    public void cadastrarFuncionarioDAO(Funcionario eVO) {
        FuncionarioDAO eDAO = DAOFactory.getFuncionarioDAO();
        eDAO.cadastrarFuncionarioDAO(eVO);
    }
 public void atualizaFuncionarioByDoc(Funcionario eVO){
        FuncionarioDAO eDAO = DAOFactory.getFuncionarioDAO();
        eDAO.atualizaFuncionarioByDoc(eVO);
    }
  public void deletarFuncionarioDAO(String cpf){
        FuncionarioDAO eDAO = DAOFactory.getFuncionarioDAO();
        eDAO.deletarFuncionarioDAO(cpf);
    }
   public Funcionario getFuncionarioByDoc(String cpf){
        FuncionarioDAO eDAO = DAOFactory.getFuncionarioDAO();
        return eDAO.getFuncionarioByDoc(cpf);
    }
   public ArrayList<Funcionario> getFuncionarios() {
        FuncionarioDAO eDAO = DAOFactory.getFuncionarioDAO();
        return eDAO.getListFuncionarios();
    }
}
