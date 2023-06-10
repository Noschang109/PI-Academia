/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 181910174
 */
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    private static FuncionarioDAO fDAO = new FuncionarioDAO();
    private static PlanoDAO pDAO = new PlanoDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static FuncionarioDAO getFuncionarioDAO() {
        return fDAO;
    }

    public static PlanoDAO getPlanoDAO() {
        return pDAO;
    }
}
