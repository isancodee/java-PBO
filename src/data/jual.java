/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class jual {
    
    //variabel
    private String fakturPembelian;
    private String kodeBarang;
    private int hargaBeli;
    private int jumlah;
    private int totalHarga;
    
    // konstruktor 1
        public void setFakturPembelian(String fakPembelian){
        this.fakturPembelian=fakPembelian;
    }
    
    public String getFakturPembelian(){
        return this.fakturPembelian;
    }

        public void setKodeBarang(String kodBarang){
        this.kodeBarang=kodBarang;
    }
    
    public String getKodeBarang(){
        return this.kodeBarang;
    }

        public void setHargaBeli(int hargaBel){
        this.hargaBeli=hargaBel;
    }
    
    public int getHargaBeli(){
        return this.hargaBeli;
    }

        public void setJumlahJual(int jml){
        this.jumlah=jml;
    }
    
    public int getJumlahJual(){
        return this.jumlah;
    }

        public void setTotalHarga(int totHarga){
        this.totalHarga=totHarga;
    }
    
    public int getTotalHarga(){
        return this.totalHarga;
    }
    
    public jual(){}
    
    public jual(String fakPembelian){
        setFakturPembelian(fakPembelian);
    }
    
    public jual(String fakPembelian, String kodBarang){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
    }
    
    public jual(String fakPembelian, String kodBarang, int hargaBel){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
    }
    
    public jual(String fakPembelian, String kodBarang, int hargaBel, int jml){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahJual(jml);
    }
    
    public jual(String fakPembelian, String kodBarang, int hargaBel, int jml, int totHarga){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahJual(jml);
        setTotalHarga(totHarga);
        
    }
    
    //method overload
        public String dataJual(){
        return getFakturPembelian()+getKodeBarang()+getHargaBeli()+getJumlahJual()+getTotalHarga();
    }
    
    public String dataJual(String fakPembelian, String kodBarang, int hargaBel, int jml, int totHarga){
         setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahJual(jml);
        setTotalHarga(totHarga);
         return getFakturPembelian()+getKodeBarang()+getHargaBeli()+getJumlahJual()+getTotalHarga();
    }
}


