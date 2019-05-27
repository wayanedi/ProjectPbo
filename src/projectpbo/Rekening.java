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
public class Rekening implements TemplateRekening{
    
    private DatabaseNasabah nasabah;
    private DataPekerja dataPekerja;
    private double saldo;
    private String norek;

    
    public Rekening(DatabaseNasabah nasabah, DataPekerja dataPekerja, double saldo, String norek){
        
        this.nasabah = nasabah;
        this.dataPekerja = dataPekerja;
        this.saldo = saldo;
        this.norek = norek;  
    }
    
    @Override
    public void penarikan(double saldo) throws InvalidBalanceExeption, InvalidSaldoException{
        
        if(saldo>0){
            if(this.saldo-saldo >0){
            this.saldo -=saldo;
            }
            else{
                throw new InvalidBalanceExeption();
            }
        }
        else{
            throw new InvalidSaldoException();
        }
    }
    
    @Override
    public void penyetoran(double saldo) throws InvalidSaldoException{
        
        if(saldo>0){
            this.saldo +=saldo;
        }
        else{
            throw new InvalidSaldoException();
        }
        
    }
    
    @Override
    public void transfer(double saldo, Rekening rekening) throws InvalidBalanceExeption, InvalidSaldoException{
        
        this.penarikan(saldo);
        rekening.penyetoran(saldo);
    }
    
    @Override
    public void transfer(double saldo, String rekTujuan) throws InvalidBalanceExeption, InvalidSaldoException{
        
        this.penarikan(saldo);
    }
    
    
    public void pembayaranDanPembelian(double saldo) throws InvalidBalanceExeption, InvalidSaldoException{
        this.penarikan(saldo);
    }
    
    public DatabaseNasabah getNasabah(){
        return this.nasabah;
    }
    
    public DataPekerja getDataPekerja(){
        return this.dataPekerja;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getNorek(){
        return this.norek;
    }
    
    public void setNasabah(DatabaseNasabah nasabah){
        this.nasabah = nasabah;
    }
    
    public void setDataPekerja(DataPekerja dataPekerja){
        this.dataPekerja = dataPekerja;
    }
    
    public void setNorek(String norek){
        this.norek = norek;
    }
    
}
