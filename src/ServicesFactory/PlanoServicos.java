/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesFactory;

import DAO.DAOFactory;
import DAO.PlanodeTreinoDAO;
import Model.Planodetreino;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Maria Ines Medeiros
 */
public class PlanoServicos {

    public ResultSet carregaPlano() throws SQLException {// Inicio CAR
        PlanodeTreinoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.getPlanoBOX();
        return pDAO.getPlanoBOX();
    }

    public void cadPlano(Planodetreino pVO) {
        PlanodeTreinoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.cadastrarPlanoDAO(pVO);
    }

    public void deletarPlano(int idplano) {
        PlanodeTreinoDAO pDAO = DAOFactory.getPlanoDAO();
        pDAO.deletarPlanoDAO(idplano);
    }

    public Planodetreino getPlano(String Plano) {
        PlanodeTreinoDAO pDAO = DAOFactory.getPlanoDAO();
        return pDAO.getPlano(Plano);
    }   
    
}
