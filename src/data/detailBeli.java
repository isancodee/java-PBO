/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class detailBeli {
    
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

        public void setJumlahDetailBeli(int jml){
        this.jumlah=jml;
    }
    
    public int getJumlahDetailBeli(){
        return this.jumlah;
    }

        public void setTotalHarga(int totHarga){
        this.totalHarga=totHarga;
    }
    
    public int getTotalHarga(){
        return this.totalHarga;
    }
    
    public detailBeli(){}
    
    public detailBeli(String fakPembelian){
        setFakturPembelian(fakPembelian);
    }
    
    public detailBeli(String fakPembelian, String kodBarang){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
    }
    
    public detailBeli(String fakPembelian, String kodBarang, int hargaBel){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
    }
    
    public detailBeli(String fakPembelian, String kodBarang, int hargaBel, int jml){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahDetailBeli(jml);
    }
    
    public detailBeli(String fakPembelian, String kodBarang, int hargaBel, int jml, int totHarga){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahDetailBeli(jml);
        setTotalHarga(totHarga);
        
    }
    
    //method overload
        public String dataDetailBeli(){
        return getFakturPembelian()+getKodeBarang()+getHargaBeli()+getJumlahDetailBeli()+getTotalHarga();
    }
    
    public String dataDetailBeli(String fakPembelian, String kodBarang, int hargaBel, int jml, int totHarga){
        setFakturPembelian(fakPembelian);
        setKodeBarang(kodBarang);
        setHargaBeli(hargaBel);
        setJumlahDetailBeli(jml);
        setTotalHarga(totHarga);
        return getFakturPembelian()+getKodeBarang()+getHargaBeli()+getJumlahDetailBeli()+getTotalHarga();
    }
}
