/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesFactory;

import DAO.DAOFactory;
import DAO.PlanoDAO;
import Model.Plano;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Maria Ines Medeiros
 */
public class PlanoServicos {

    public ResultSet carregaPlano() throws SQLException {// Inicio CAR
        PlanoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.getPlanoBOX();
        return pDAO.getPlanoBOX();
    }

    public void cadPlano(Plano pVO) {
        PlanoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.cadastrarPlanoDAO(pVO);
    }

    public void deletarPlano(String cpf) {
        PlanoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.deletarPlanoDAO(cpf);
    }
    
  
    
    
}
