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
public class DatabaseNasabah {
    private String namaNasabah;
    private String noRek;
    private double saldo;
    

    public DatabaseNasabah(String namaNasabah, String noRek, Double saldo) {
        this.namaNasabah = namaNasabah;
        this.noRek = noRek;
        this.saldo = saldo;
    }
    
    public String getNamaNasabah(){
        return this.namaNasabah;
    }
    
    public String getNoRek(){
        return this.noRek;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
}
