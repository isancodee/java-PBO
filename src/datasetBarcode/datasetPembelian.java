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
public class datasetPembelian {
    
    private ArrayList<String> fakturPembelian;
    private ArrayList<String> tanggal;
    private ArrayList<String> kodePemasok;
    private ArrayList<String> totalBarang;
    private ArrayList<String> totalHarga;
    private ArrayList<String> username;
    //construktor
    public datasetPembelian(){
        fakturPembelian = new ArrayList<String>();
        tanggal = new ArrayList<String>();
        kodePemasok = new ArrayList<String>();
        totalBarang = new ArrayList<String>();
        totalHarga = new ArrayList<String>();
        username = new ArrayList<String>();
    }
    
    public void insertFakturPembelian(String isi){
        this.fakturPembelian.add(isi);
    }
    public ArrayList<String> getRecordFakturPembelian(){
        return this.fakturPembelian;
    }
    
    public void insertTanggal(String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordTanggal(){
        return this.tanggal;
    }

     public void insertKodePemasok(String isi){
        this.kodePemasok.add(isi);
    }
    public ArrayList<String> getRecordKodePemasok(){
        return this.kodePemasok;
    }  
    
    public void insertTotalBarang(String isi){
        this.totalBarang.add(isi);
    }
    public ArrayList<String> getRecordTotalBarang(){
        return this.totalBarang;
    }
    
     public void insertTotalHarga(String isi){
        this.totalHarga.add(isi);
    }
    public ArrayList<String> getRecordTotalHarga(){
        return this.totalHarga;
    }

     public void insertUsername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
}
