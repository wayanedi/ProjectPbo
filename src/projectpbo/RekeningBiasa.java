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
public class RekeningBiasa extends Rekening {
    
    public static final double pajak = 7500;
    public static final double limitTransfer = 50000000;
    
    public RekeningBiasa(DatabaseNasabah nasabah, DataPekerja dataPekerja, double saldo, String norek){
        
        super(nasabah, dataPekerja, saldo, norek); 
    }
    
    @Override
    public void transfer(double saldo, String rekTujian) throws InvalidBalanceExeption, InvalidSaldoException{
        super.transfer(saldo+pajak, rekTujian);
    }
    
}
