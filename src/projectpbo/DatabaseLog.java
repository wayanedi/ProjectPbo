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
    private String debit;
    private String kredit;
    
    public DatabaseLog(String tanggal, String keterangan, String debit, String kredit){
        this.tanggal = tanggal;
        this.keterangan = keterangan;
        this.debit = debit;
        this.kredit = kredit;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
    
    public String getDebit(){
        return this.debit;
    }
    
    public String getKredit(){
        return this.kredit;
    }
}
