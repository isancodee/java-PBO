/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010331;

import data.*;
import datasetBarcode.*;
import form.*;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        //pemanggilan konstuktor overload CLASS PETUGAS
//        System.out.println("konstuktor overload CLASS PETUGAS");
//        petugas objku= new petugas("USERNAME : aliksan123 ;","PASSWORD : 123 ;  ","NAMA : Iksan ;    ","ALAMAT : cemara ;  ","RT : 03 ;   ","RW : 01 ;  ","KECAMATAN : Pulau Sebuku ;   ","KABUPATEN : Kotabaru ;    ","PROVINSI : Kalimantan Selatan ;   ","POS : 722115 ;   ","KONTAK : 0812345678 ;  ","STATUS : Mahasiswa");
//      
//        System.out.println("DATA PETUGAS =    " +objku.dataPetugas());
//        System.out.println("");
//        //pemanggilan METHOD overload CLASS PETUGAS
//        System.out.println("METHOD overload CLASS PETUGAS");
//        petugas objku2= new petugas();
//        
//        System.out.println("DATA PETUGAS = " +objku2.dataPetugas("USERNAME : Rama11 ;","PASSWORD : 432 ;  ","NAMA : Rama ;    ","ALAMAT : Jl.semayap ;  ","RT : 02 ;   ","RW : 01 ;  ","KECAMATAN : Pulau Sebuku ;   ","KABUPATEN : Kotabaru ;    ","PROVINSI : Kalimantan Selatan ;   ","POS : 722115 ;   ","KONTAK : 0812345678 ;  ","STATUS : Mahasiswa"));
//        System.out.println("");
//        
//        
//        //pemanggilan konstuktor overload CLASS PEMASOK
//        System.out.println("KONSTRUKTOR overload CLASS PEMASOK");
//        pemasok objku3= new pemasok("KODE PEMASOK : 001 ;   ", "NO IZIN : 001 ; ","NAMA PERUSAHAAN : Abadi Jaya ;   ", "ALAMAT KANTOR : Jl.Sultan Adam ;    ", "RT : 002 ;  ", "RW : 001 ;  ", "KECAMATAN : sungai Miai ; ", "KABUPATEN : Banjarmasin Utara ;   ", "PROVINSI : Kalimantan Selatan;  ", "POS : 21234;    ", "KONTAK : 0898767654 ;   ", "DIREKTUR : Yadi Surba ; ", "KETERANGAN : MASUK ;");
//        
//        System.out.println("Data Pemasok : " +objku3.dataPemasok() );
//        System.out.println("");
//        
//       //pemanggilan method overload CLASS PEMASOK
//       System.out.println("METHOD overload CLASS PEMASOK");
//       pemasok objku4 = new pemasok();
//       
//       System.out.println("Data Pemasok :" +objku4.dataPemasok("KODE PEMASOK : 001 ;   ", "NO IZIN : 001 ; ","NAMA PERUSAHAAN : Abadi Jaya ;   ", "ALAMAT KANTOR : Jl.Sultan Adam ;    ", "RT : 002 ;  ", "RW : 001 ;  ", "KECAMATAN : sungai Miai ; ", "KABUPATEN : Banjarmasin Utara ;   ", "PROVINSI : Kalimantan Selatan;  ", "POS : 21234;    ", "KONTAK : 0898767654 ;   ", "DIREKTUR : Yadi Surba ; ", "KETERANGAN : MASUK ;"));
//       System.out.println("");
//       
//       
//       //pemanggilan konstuktor overload CLASS PELANGGAN
//       System.out.println("KONSTRUKTOR overload CLASS PELANGGAN");
//       pelanggan objku5= new pelanggan("KODE PELANGGAN : 002 ;  ","NAMA PELANGGAN : JAYA ;    ", "ALAMAT : Jl.MASUK MASUK ;  ", "RT : 001;  ", "RW : 001 ;  ", "KECAMATAN : Pulau BULA ;    ", "KABUPATEN : Kotabaru ;  ", "PROVINSI : Kalimantan Selatan ; ", "POS : 12345");
//       
//       System.out.println("DATA PELANGGAN : " +objku5.dataPelanggan());
//       System.out.println("");
//       
//       //pemanggilan method overload CLASS PELANGGAN
//       System.out.println("METHOD overload CLASS PELANGGAN");
//       pelanggan objku6= new pelanggan();
//       
//       System.out.println("DATA PELANGGAN : " +objku6.dataPelanggan("KODE PELANGGAN : 002 ;  ","NAMA PELANGGAN : ANDRE ;    ", "ALAMAT : Jl.Melati Putih ;  ", "RT : 002 ;  ", "RW : 002 ;  ", "KECAMATAN : Pulau sembilan ;    ", "KABUPATEN : Kotabaru ;  ", "PROVINSI : Kalimantan Selatan ; ", "POS : 12345"));
//       System.out.println("");
//       
//       
//       //pemanggilan konstuktor overload CLASS BARANG
//       System.out.println("KONSTRUKTOR overload CLASS BARANG");
//       barang objku7= new barang("NO BARANG : 011 ; ", "KODE BARANG : 123;  ", "JENIS : KAIN ;  ", "SATUAN : 100 ;  ", 100000   , 800000    , 100   , "TANGGAL : 10-April-2023 ;    ", "NAMA BARANG : KAOS SMITH");
//       
//       System.out.println("DATA BARANG : " +objku7.dataBarang());
//       System.out.println("");
//       
//       //pemanggilan method overload CLASS BARANG
//       System.out.println("METHOD overload CLASS BARANG");
//       barang objku8= new barang();
//       
//       System.out.println("DATA BARANG : " +objku8.dataBarang("NO BARANG : 011 ; ", "KODE BARANG : 223;  ", "JENIS : SEPATU ;  ", "SATUAN : 100 ;  ", 100000   ,    800000    , 100   , "TANGGAL : 10-April-2023 ;    ", "NAMA BARANG : SPEC"));
//       System.out.println("");
//       
//       //pemanggilan konstuktor overload CLASS PEMBELIAN
//       System.out.println("KONSTRUKTOR overload CLASS PEMBELIAN");
//       pembelian objku9= new pembelian("FAKTUR PEMBELIAN : 111 ;    ", "TANGGAL : 28-Januari-2023 ; ", "KODE PEMASOK : 001 ;    ", 10, 1000000,"USERNAME : ryhan");
//       
//       System.out.println("DATA PEMBELIAN :  " +objku9.dataPembelian());
//       System.out.println("");
//       
//       //pemanggilan Method overload CLASS PEMBELIAN
//       System.out.println("METHOD overload CLASS PEMBELIAN");
//       pembelian objku10= new pembelian();
//       
//       System.out.println("DATA PEMBELIAN : " +objku10.dataPembelian("FAKTUR PEMBELIAN : 112 ;    ", "TANGGAL : 29-Januari-2023 ; ", "KODE PEMASOK : 002 ;    ", 10, 1000000,"USERNAME : TARI"));
//       System.out.println("");
//       
//       
//        //pemanggilan konstuktor overload CLASS JUAL
//        System.out.println("KONSTRUKTOR overload CLASS JUAL");
//        jual objku11= new jual("FAKTUR PEMBELIAN : 111 ;    ", "KODE BARANG : 001 ; ", 100000, 5 , 500000);
//        
//        System.out.println("DATA JUAL : " +objku11.dataJual());
//       System.out.println("");
//       
//        //pemanggilan Method overload CLASS JUAL
//        System.out.println("METHOD overload CLASS JUAL");
//        jual objku12= new jual();
//       
//        System.out.println("DATA JUAL : " +objku12.dataJual("FAKTUR PEMBELIAN : 112 ;   ", "KODE BARANG : 002 ; ", 500000, 5 , 2500000));
//        System.out.println("");
//        
//        
//        //pemanggilan konstuktor overload CLASS JUAL
//        System.out.println("KONSTRUKTOR overload CLASS DETAIL DATA BELI");
//        detailBeli objku13= new detailBeli("FAKTUR PEMBELIAN : 111 ;    ", "KODE BARANG : 001 ; ", 100000, 5 , 500000);
//        
//        System.out.println("DATA DETAIL BELI : " +objku13.dataDetailBeli());
//        System.out.println("");
//        
//        //pemanggilan Method overload CLASS JUAL
//         System.out.println("METHOD overload CLASS DETAIL DATA BELI");
//        detailBeli objku14= new detailBeli();
//       
//        System.out.println("DATA DETAIL BELI : " +objku14.dataDetailBeli("FAKTUR PEMBELIAN : 112 ;  ", "KODE BARANG : 002 ; ", 500000, 5 , 2500000));
   
//    datasetBarang dataBarang = new datasetBarang();
//        dataBarang.insertNomor("111");
//        dataBarang.insertKodeBarang("A.1");
//        dataBarang.insertSatuan("50");
//        dataBarang.insertHargaBeli(170000);
//        dataBarang.insertHargaJual(2000000);
//        dataBarang.insertTanggal("20-Mei-2023");
//        dataBarang.insertUsername("Arya");
//        System.out.println(dataBarang.getRecordNomor().get(0));
    
//    datasetDetailBeli detailBeli = new datasetDetailBeli();
//        detailBeli.insertFakturPembelian("A12");
//        detailBeli.insertKodeBarang("B.1.1");
//        detailBeli.insertHargaBeli(15000);
//        detailBeli.insertJumlah(10);
//        detailBeli.insertTotalHarga(1500000);
//        System.out.println(detailBeli.getRecordFakturPembelian().get(0));
  
// pemanggilan form
    new frameUtama().setVisible(true);
    
    }
    
        
    
}
