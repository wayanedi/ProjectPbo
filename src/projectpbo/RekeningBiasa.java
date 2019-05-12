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
    
    private double pajak;
    private double limitTransfer;
    private double limitPenarikan;
    
    public RekeningBiasa(DatabaseNasabah nasabah, DataPekerja dataPekerja, double saldo, String norek){
        
        super(nasabah, dataPekerja, saldo, norek); 
    }
    
    @Override
    public void transfer(double saldo, Rekening rekening){
        super.transfer(saldo, rekening);
    }
    
}
