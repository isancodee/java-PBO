/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasetBarcode;
import java.util.ArrayList;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class datasetJual {
    private ArrayList<String> fakturPembelian;
    private ArrayList<String> kodeBarang;
    private ArrayList<Integer> hargaBeli;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> totalHarga;
    
    
    //construktor
    public datasetJual(){
        fakturPembelian = new ArrayList<String>();
        kodeBarang = new ArrayList<String>();
        jumlah = new ArrayList<Integer>();
        totalHarga = new ArrayList<Integer>();
    }
    
    public void insertFakturPembelian(String isi){
        this.fakturPembelian.add(isi);
    }
    public ArrayList<String> getRecordFakturPembelian(){
        return this.fakturPembelian;
    }
    
    public void insertKodeBarang(String isi){
        this.kodeBarang.add(isi);
    }
    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
     public void insertHargaBeli(Integer isi){
        this.hargaBeli.add(isi);
    }
    public ArrayList<Integer> getRecordHargaBeli(){
        return this.hargaBeli;
    }
    
    public void insertJumlah(Integer isi){
        this.jumlah.add(isi);
    }
    public ArrayList<Integer> getRecordJumlah(){
        return this.jumlah;
    }
    
     public void insertTotalHarga(Integer isi){
        this.totalHarga.add(isi);
    }
    public ArrayList<Integer> getRecordTotalHarga(){
        return this.totalHarga;
    }
}
