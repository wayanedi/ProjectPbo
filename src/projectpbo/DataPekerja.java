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
public class DataPekerja {
    
    String jenisPekerjaan;
    String namaKantor;
    String jabatan;
    String alamatKantor;
    String pendapatan;
    
    public DataPekerja(String jenisPekerjaan, String namaKantor, String jabatan, String alamatKantor, String pendapatan){
        this.jenisPekerjaan = jenisPekerjaan;
        this.namaKantor = namaKantor;
        this.jabatan = jabatan;
        this.alamatKantor = alamatKantor;
        this.pendapatan = pendapatan;
        
    }
    
    public String getJenisPekerjaan(){
        return this.jenisPekerjaan;
    }
    
    public String getNamaKantor(){
        return this.namaKantor;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public String getAlamatKantor(){
        return this.alamatKantor;
    }
    
    public String getPendapatan(){
        return this.pendapatan;
    }
    
    public void SetJenisPekerjaan(String jenisPekerjaan){
        this.jenisPekerjaan = jenisPekerjaan;
    }
    
    public void setNamaKantor(String namaKantor){
        this.namaKantor = namaKantor;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public void setAlamatKantor(String alamatKantor){
        this.alamatKantor = alamatKantor;
    }
    
    public void setPendapatan(String pendapatan){
        this.pendapatan = pendapatan;
    }
}
