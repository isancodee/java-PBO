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
public class datasetPemasok {
    private ArrayList<String> kodePemasok;
    private ArrayList<String> nomorIzin;
    private ArrayList<String> namaPerusahaan;
    private ArrayList<String> alamatKantor;
    private ArrayList<String> rt;
    private ArrayList<String> rw;
    private ArrayList<String> kecamatan;
    private ArrayList<String> kabupaten;
    private ArrayList<String> provinsi;
    private ArrayList<String> pos;
    private ArrayList<String> direktur;
    private ArrayList<String> keterangan;

    //construktor
    public datasetPemasok(){
        kodePemasok = new ArrayList<String>();
        nomorIzin = new ArrayList<String>();
        namaPerusahaan = new ArrayList<String>();
        alamatKantor = new ArrayList<String>();
        rt = new ArrayList<String>();
        rw = new ArrayList<String>();
        kecamatan = new ArrayList<String>();
        kabupaten = new ArrayList<String>();
        provinsi = new ArrayList<String>();
        pos= new ArrayList<String>();
        direktur= new ArrayList<String>();
        keterangan= new ArrayList<String>();
    }
    
    public void insertKodePemasok(String isi){
        this.kodePemasok.add(isi);
    }
    public ArrayList<String> getRecordKodePemasok(){
        return this.kodePemasok;
    }
    
    public void insertNomorIzin(String isi){
        this.nomorIzin.add(isi);
    }
    public ArrayList<String> getRecordNomorIzin(){
        return this.nomorIzin;
    }
    
    public void insertNamaPerusahaan(String isi){
        this.namaPerusahaan.add(isi);
    }
    public ArrayList<String> getRecordNamaPerusahaan(){
        return this.namaPerusahaan;
    }

     public void insertAlamatKantor(String isi){
        this.alamatKantor.add(isi);
    }
    public ArrayList<String> getRecordAlamatKantor(){
        return this.alamatKantor;
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

    public void insertDirektur(String isi){
        this.direktur.add(isi);
    }
    public ArrayList<String> getRecordDirektur(){
        return this.direktur;
    }

     public void insertKeterangan(String isi){
        this.keterangan.add(isi);
    }
    public ArrayList<String> getRecordKeterangan(){
        return this.keterangan;
    }
    
}
