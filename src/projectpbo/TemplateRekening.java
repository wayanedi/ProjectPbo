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
public interface TemplateRekening {
    
    public void penarikan(double saldo) throws InvalidBalanceExeption, InvalidSaldoException;
    public void penyetoran(double saldo) throws InvalidSaldoException;
    public void transfer(double saldo, Rekening rekening) throws InvalidBalanceExeption, InvalidSaldoException;
    public void transfer(double saldo, String rekTujuan)throws InvalidBalanceExeption, InvalidSaldoException;
    
}
