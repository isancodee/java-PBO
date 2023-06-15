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
public class datasetBarang {
    private ArrayList<String> nomor;
    private ArrayList<String> kodeBarang;
    private ArrayList<String> jenis;
    private ArrayList<String> satuan;
    private ArrayList<Integer> hargaBeli;
    private ArrayList<Integer> hargaJual;
    private ArrayList<Integer> stok;
    private ArrayList<String> tanggal;
    private ArrayList<String> username;
    
    //construktor
    public datasetBarang(){
        nomor = new ArrayList<String>();
        kodeBarang = new ArrayList<String>();
        jenis = new ArrayList<String>();
        satuan = new ArrayList<String>();
        hargaBeli = new ArrayList<Integer>();
        hargaJual = new ArrayList<Integer>();
        stok = new ArrayList<Integer>();
        tanggal = new ArrayList<String>();
        username = new ArrayList<String>();
    }
    
    public void insertNomor(String isi){
        this.nomor.add(isi);
    }
    public ArrayList<String> getRecordNomor(){
        return this.nomor;
    }
    
    public void insertKodeBarang(String isi){
        this.kodeBarang.add(isi);
    }
    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
    public void insertJenis(String isi){
        this.jenis.add(isi);
    }
    public ArrayList<String> getRecordJenis(){
        return this.jenis;
    }
    
    public void insertSatuan(String isi){
        this.satuan.add(isi);
    }
    public ArrayList<String> getRecordSatuan(){
        return this.satuan;
    }
    
     public void insertHargaBeli(Integer isi){
        this.hargaBeli.add(isi);
    }
    public ArrayList<Integer> getRecordHargaBeli(){
        return this.hargaBeli;
    }
    
    public void insertHargaJual(Integer isi){
        this.hargaJual.add(isi);
    }
    public ArrayList<Integer> getRecordHargaJual(){
        return this.hargaJual;
    }
    
    public void insertStok(Integer isi){
        this.stok.add(isi);
    }
    public ArrayList<Integer> getRecordStok(){
        return this.stok;
    }
     public void insertTanggal(String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordTanggal(){
        return this.tanggal;
    }

    public void insertUsername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
}
