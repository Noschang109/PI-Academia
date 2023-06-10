/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesFactory;

/**
 *
 * @author Maria Ines Medeiros
 */
public class FactoryServicos {

    private static ClienteServicos cServicos = new ClienteServicos();
    private static FuncionarioServicos fServicos = new FuncionarioServicos();
    private static PlanoServicos pServicos = new PlanoServicos();

    public static ClienteServicos getClienteServicos() {//Inicio GET
        return cServicos;
    }//Fim GET

    public static FuncionarioServicos getFuncionarioServicos() {//Inicio GET
        return fServicos;
    }//Fim GET

    public static PlanoServicos getPlanoServicos() {//Inicio GET
        return pServicos;
    }//Fim GET
}
