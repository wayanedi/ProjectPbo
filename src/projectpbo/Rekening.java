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
public class Rekening {
    
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
    
    public void penarikan(double saldo){
        if(this.saldo-saldo >0){
            this.saldo -=saldo;
        }
    }
    
    public void penyetoran(double saldo){
        this.saldo +=saldo;
    }
    
    public void transfer(double saldo, Rekening rekening){
        
        if(this.saldo-saldo >0){
            this.saldo -=saldo;
            rekening.setSaldo(saldo);
            
        }
    }
    
    public void mutasiRekening(){
        
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
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setNorek(String norek){
        this.norek = norek;
    }
    
}
