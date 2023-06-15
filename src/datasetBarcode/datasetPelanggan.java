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
public class datasetPelanggan {
    private ArrayList<String> kodePelanggan;
    private ArrayList<String> namaPelanggan;
    private ArrayList<String> alamat;
    private ArrayList<String> rt;
    private ArrayList<String> rw;
    private ArrayList<String> kecamatan;
    private ArrayList<String> kabupaten;
    private ArrayList<String> provinsi;
    private ArrayList<String> pos;
    
    //construktor
    public datasetPelanggan(){
        kodePelanggan = new ArrayList<String>();
        namaPelanggan = new ArrayList<String>();
        alamat = new ArrayList<String>();
        rt = new ArrayList<String>();
        rw = new ArrayList<String>();
        kecamatan = new ArrayList<String>();
        kabupaten = new ArrayList<String>();
        provinsi = new ArrayList<String>();
        pos= new ArrayList<String>();
    }
    
    public void insertKodePelanggan(String isi){
        this.kodePelanggan.add(isi);
    }
    public ArrayList<String> getRecordKodePelanggan(){
        return this.kodePelanggan;
    }
    
    public void insertNamaPelanggan(String isi){
        this.namaPelanggan.add(isi);
    }
    public ArrayList<String> getRecordNamaPelanggan(){
        return this.namaPelanggan;
    }
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat(){
        return this.alamat;
    }
    
    public void insertRt(String isi){
        this.rt.add(isi);
    }
    public ArrayList<String> getRecordRt(){
        return this.rt;
    }
    
     public void insertRw(String isi){
        this.rw.add(isi);
    }
    public ArrayList<String> getRecordRw(){
        return this.rw;
    }
    
    public void insertKecamatan(String isi){
        this.kecamatan.add(isi);
    }
    public ArrayList<String> getRecordKecamatan(){
        return this.kecamatan;
    }
    
     public void insertKabupaten(String isi){
        this.kabupaten.add(isi);
    }
    public ArrayList<String> getRecordKabupaten(){
        return this.kabupaten;
    }

    public void insertProvinsi(String isi){
        this.provinsi.add(isi);
    }
    public ArrayList<String> getRecordProvinsi(){
        return this.provinsi;
    }

     public void insertPos(String isi){
        this.pos.add(isi);
    }
    public ArrayList<String> getRecordPos(){
        return this.pos;
    }
    
}
