/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class pembelian {
    
    //variabel
    private String fakturPembelian;
    private String tanggal;
    private String kodePemasok;
    private int totalBarang;
    private int totalHarga;
    private String username;
    
    
    // konstruktor 1
        public void setFakturPembelian(String fakPembelian){
        this.fakturPembelian=fakPembelian;
    }
    
    public String getFakturPembelian(){
        return this.fakturPembelian;
    }

    public void setTanggalPembelian(String tglPembelian){
        this.tanggal=tglPembelian;
    }
    
    public String getTanggalPembelian(){
        return this.tanggal;
    }

    public void setKodePemasok(String kodPemasok){
        this.kodePemasok=kodPemasok;
    }
    
    public String getKodePemasok(){
        return this.kodePemasok;
    }

    public void setTotalBarang(int totBarang){
        this.totalBarang=totBarang;
    }
    
    public int getTotalBarang(){
        return this.totalBarang;
    }


    public void setTotalHarga(int totHarga){
        this.totalHarga=totHarga;
    }
    
    public int getTotalHarga(){
        return this.totalHarga;
    }

    public void setUsernamePembelian(String usernamePembelian){
        this.username=usernamePembelian;
    }
    
    public String getUsernamePembelian(){
        return this.username;
    }
    
    
    //Konstruktor Overload
    public pembelian(){}
    
    public pembelian(String fakPembelian){
        setFakturPembelian(fakPembelian);
    }
    
    public pembelian(String fakPembelian, String tglPembelian){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
    }
    
    public pembelian(String fakPembelian, String tglPembelian, String kodPemasok){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
        setKodePemasok(kodPemasok);
    }
    
    public pembelian(String fakPembelian, String tglPembelian, String kodPemasok, int totBarang){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
        setKodePemasok(kodPemasok);
        setTotalBarang(totBarang);
    }
    
    public pembelian(String fakPembelian, String tglPembelian, String kodPemasok, int totBarang, int totHarga){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
        setKodePemasok(kodPemasok);
        setTotalBarang(totBarang);
        setTotalHarga(totHarga);
        
    }
    
    public pembelian(String fakPembelian, String tglPembelian, String kodPemasok, int totBarang, int totHarga, String usernamePembelian){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
        setKodePemasok(kodPemasok);
        setTotalBarang(totBarang);
        setTotalHarga(totHarga);
        setUsernamePembelian(usernamePembelian);
        
    }
    
    
    //method overload
        public String dataPembelian(){
        return getFakturPembelian()+getTanggalPembelian()+getKodePemasok()+getTotalBarang()+getTotalHarga()+getUsernamePembelian();
    }
    
    public String dataPembelian(String fakPembelian, String tglPembelian, String kodPemasok, int totBarang, int totHarga, String usernamePembelian){
        setFakturPembelian(fakPembelian);
        setTanggalPembelian(tglPembelian);
        setKodePemasok(kodPemasok);
        setTotalBarang(totBarang);
        setTotalHarga(totHarga);
        setUsernamePembelian(usernamePembelian);
        
        return getFakturPembelian()+getTanggalPembelian()+getKodePemasok()+getTotalBarang()+getTotalHarga()+getUsernamePembelian();
        
    }
       
}
