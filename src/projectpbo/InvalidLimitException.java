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
public class InvalidLimitException extends Exception{
    
    public InvalidLimitException(){
        super("sudah melebihi limit transfer");
    }
    
}
