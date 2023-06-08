/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaexceptions;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *
 * @author MMMM
 */
public class Log {
    private static final Logger LOGGER = Logger.getLogger("Erros LOG");
    
    public Log() {
        LogManager.getLogManager().reset();
        LOGGER.setLevel(Level.SEVERE);
        
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        LOGGER.addHandler(ch);
        
        try{
            FileHandler fh = new FileHandler("myLogger.log", true);
            fh.setLevel(Level.WARNING);
            LOGGER.addHandler(fh);
        }catch(IOException e){
            LOGGER.log(Level.SEVERE,"Arquivo de log não está funcionando.",e);
        }
    }
    
    public Logger getLogger(){
        return LOGGER;
    }
}