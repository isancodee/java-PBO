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
public class datasetPetugas {
    private ArrayList<String> username;
    private ArrayList<String> pass;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> rt;
    private ArrayList<String> rw;
    private ArrayList<String> kecamatan;
    private ArrayList<String> kabupaten;
    private ArrayList<String> provinsi;
    private ArrayList<String> pos;
    private ArrayList<String> kontak;
    private ArrayList<String> status;

    //construktor
    public datasetPetugas(){
        username = new ArrayList<String>();
        pass = new ArrayList<String>();
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        rt = new ArrayList<String>();
        rw = new ArrayList<String>();
        kecamatan = new ArrayList<String>();
        kabupaten = new ArrayList<String>();
        provinsi = new ArrayList<String>();
        pos= new ArrayList<String>();
        kontak= new ArrayList<String>();
        status= new ArrayList<String>();
    }
    
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
    public void insertPass(String isi){
        this.pass.add(isi);
    }
    public ArrayList<String> getRecordPass(){
        return this.pass;
    }
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.nama;
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

    public void insertKontak(String isi){
        this.kontak.add(isi);
    }
    public ArrayList<String> getRecordKontak(){
        return this.kontak;
    }

     public void insertStatus(String isi){
        this.status.add(isi);
    }
    public ArrayList<String> getRecordStatus(){
        return this.status;
    }
    
}
