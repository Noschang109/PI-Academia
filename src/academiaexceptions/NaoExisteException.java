/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaexceptions;

/**
 *
 * @author MMMM
 */
public class NaoExisteException extends Exception{
    public NaoExisteException(String mensagem){
        super(mensagem);
    }
}