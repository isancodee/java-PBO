/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class barang {
    
     //variabel
    private String nomor;
    private String kodeBarang;
    private String jenis;
    private String satuan;
    private int hargaBeli;
    private int hargaJual;
    private int stok;
    private String tanggal;
    private String username;
    
    
    // konstruktor 1
    public void setNomorBarang(String noBarang){
        this.nomor=noBarang;
    }
    
    public String getNomorBarang(){
        return this.nomor;
    }
    
        public void setKodeBarang(String kodBarang){
        this.kodeBarang=kodBarang;
    }
    
    public String getKodeBarang(){
        return this.kodeBarang;
    }

     public void setJenisBarang(String jenBarang){
        this.jenis=jenBarang;
    }
    
    public String getJenisBarang(){
        return this.jenis;
    }

     public void setSatuanBarang(String satBarang){
        this.satuan=satBarang;
    }
    
    public String getSatuanBarang(){
        return this.satuan;
    }

     public void setHargaBeliBarang(int hbeliBarang){
        this.hargaBeli=hbeliBarang;
    }
    
    public int getHargaBeliBarang(){
        return this.hargaBeli;
    }

     public void setHargaJualBarang(int hjualBarang){
        this.hargaJual=hjualBarang;
    }
    
    public int getHargaJualBarang(){
        return this.hargaJual;
    }

     public void setStokBarang(int stkBarang){
        this.stok=stkBarang;
    }
    
    public int getStokBarang(){
        return this.stok;
    }

     public void setTanggalBarang(String tglBarang){
        this.tanggal=tglBarang;
    }
    
    public String getTanggalBarang(){
        return this.tanggal;
    }

     public void setUsernameBarang(String namaBarang){
        this.username=namaBarang;
    }
    
    public String getUsernameBarang(){
        return this.username;
    }
    
    //Konstruktor Overload
    public barang(){}
    
    public barang(String noBarang){
        setNomorBarang(noBarang);
    }
    
    public barang(String noBarang, String kodBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
    }
    
    public barang(String noBarang, String kodBarang, String jenBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
    }
    
    public barang(String noBarang, String kodBarang, String jenBarang, String satBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
    }
    
    public barang(String noBarang, String kodBarang, String jenBarang, String satBarang, int hbeliBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
        setHargaBeliBarang(hbeliBarang);
        
    }
    
    public barang(String noBarang, String kodBarang, String jenBarang, String satBarang, int hbeliBarang, int hjualBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
        setHargaBeliBarang(hbeliBarang);
        setHargaJualBarang(hjualBarang);
    }
    
       public barang(String noBarang, String kodBarang, String jenBarang, String satBarang, int hbeliBarang, int hjualBarang, int stkBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
        setHargaBeliBarang(hbeliBarang);
        setHargaJualBarang(hjualBarang);
        setStokBarang(stkBarang);
    }
       
        public barang(String noBarang, String kodBarang, String jenBarang, String satBarang, int hbeliBarang, int hjualBarang, int stkBarang, String tglBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
        setHargaBeliBarang(hbeliBarang);
        setHargaJualBarang(hjualBarang);
        setStokBarang(stkBarang);
        setTanggalBarang(tglBarang);
    }
        
        public barang(String noBarang, String kodBarang, String jenBarang, String satBarang, int hbeliBarang, int hjualBarang, int stkBarang, String tglBarang, String namaBarang){
        setNomorBarang(noBarang);
        setKodeBarang(kodBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satBarang);
        setHargaBeliBarang(hbeliBarang);
        setHargaJualBarang(hjualBarang);
        setStokBarang(stkBarang);
        setTanggalBarang(tglBarang);
        setUsernameBarang(namaBarang);
    }
        
      //method overload
        public String dataBarang(){
        return getNomorBarang()+
                getKodeBarang()+
                getJenisBarang()+
                getSatuanBarang()+
                getHargaBeliBarang()+
                getHargaJualBarang()+
                getStokBarang()+
                getTanggalBarang()+
                getUsernameBarang();
    }
    
    public String dataBarang(String NomorBarang, String KodeBarang, String jenBarang, String satuanBarang, int hbBarang, int hjBarang, int stkBarang, String tglBarang, String namaBarang){
        setNomorBarang(NomorBarang);
        setKodeBarang(KodeBarang);
        setJenisBarang(jenBarang);
        setSatuanBarang(satuanBarang);
        setHargaBeliBarang(hbBarang);
        setHargaJualBarang(hjBarang);
        setStokBarang(stkBarang);
        setTanggalBarang(tglBarang);
        setUsernameBarang(namaBarang);
        return getNomorBarang()+
               getKodeBarang()+
               getJenisBarang()+
               getSatuanBarang()+
               getHargaBeliBarang()+
               getHargaJualBarang()+
               getStokBarang()+
               getTanggalBarang()+
               getUsernameBarang();
    }   
    
}
