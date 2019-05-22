/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

/**
 *
 * @author aizaki
 */
class DatabaseLog {
    private String tanggal;
    private String keterangan;
    private double nominal;
    private String status;
    
    public DatabaseLog(String tanggal, String keterangan, double debit, String status){
        this.tanggal = tanggal;
        this.keterangan = keterangan;
        this.nominal = debit;
        this.status = status;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
    
    public double getNominal(){
        return this.nominal;
    }
    
    public String getStatus(){
        return this.status;
    }
}
