/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

/**
 *
 * @author anonymous
 */
public class InvalidBalanceExeption extends Exception{
    
    public InvalidBalanceExeption(){
        super("balance tidak cukup");
    }
    
}
