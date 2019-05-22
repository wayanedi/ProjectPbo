/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import static projectpbo.RekeningBiasa.pajak;

/**
 *
 * @author anonymous
 */
public class RekeningBisnis extends Rekening {
    
    public static final double pajak = 5000;
    public static final double limitTransfer = 150000000;
    public static final double limitPenarikan = 10000000;
    
    public RekeningBisnis(DatabaseNasabah nasabah, DataPekerja dataPekerja, double saldo, String norek){
        
        super(nasabah, dataPekerja, saldo, norek);
    }
    
    @Override
    public void transfer(double saldo, String rekTujian) throws InvalidBalanceExeption, InvalidSaldoException{
        super.transfer(saldo+pajak, rekTujian);
    }
}
