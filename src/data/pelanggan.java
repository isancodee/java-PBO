/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class pelanggan {
    //variabel
    private String kodePelanggan;
    private String namaPelanggan;
    private String alamat;
    private String rt;
    private String rw;
    private String kecamatan;
    private String kabupaten;
    private String propinsi;
    private String pos;


// konstruktor 1

    public void setKodePelanggan(String kodpel){
        this.kodePelanggan=kodpel;
    }
    
    public String getKodePelanggan(){
        return this.kodePelanggan;
    }

    public void setNamaPelanggan(String namaPel){
        this.namaPelanggan=namaPel;
    }
    
    public String getNamaPelanggan(){
        return this.namaPelanggan;
    }

    public void setAlamat(String alamatPel){
        this.alamat=alamatPel;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setRt(String pelRt){
        this.rt=pelRt;
    }
    
    public String getRt(){
        return this.rt;
    }

    public void setRw(String pelRw){
        this.rw=pelRw;
    }
    
    public String getRw(){
        return this.rw;
    }

    public void setKecamatan(String kcmtn){
        this.kecamatan=kcmtn;
    }
    
    public String getKecamatan(){
        return this.kecamatan;
    }

    public void setKabupaten(String kbptn){
        this.kabupaten=kbptn;
    }
    
    public String getKabupaten(){
        return this.kabupaten;
    }

    public void setPropinsi(String prov){
        this.propinsi=prov;
    }
    
    public String getPropinsi(){
        return this.propinsi;
    }

    public void setPos(String posPel){
        this.pos=posPel;
    }
    
    public String getPos(){
        return this.pos;
    }
    
    
    //Konstruktor Overload
    public pelanggan(){}
    
        public pelanggan(String kodpel){
        setKodePelanggan(kodpel);
    }
    
    public pelanggan(String kodpel, String namaPel){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
    }
    
    public pelanggan(String kodpel, String namaPel, String alamatPel){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
    }
    
    public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
    }
    
    public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt, String pelRw){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
        setRw(pelRw);
        
    }
    
    public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt, String pelRw, String kcmtn){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
        setRw(pelRw);
        setKecamatan(kcmtn);
    }
    
       public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt, String pelRw, String kcmtn, String kbptn){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
        setRw(pelRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
    }
       
        public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt, String pelRw, String kcmtn, String kbptn, String prov){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
        setRw(pelRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
    }
        
        public pelanggan(String kodpel, String namaPel, String alamatPel, String pelRt, String pelRw, String kcmtn, String kbptn, String prov, String posPel){
        setKodePelanggan(kodpel);
        setNamaPelanggan(namaPel);
        setAlamat(alamatPel);
        setRt(pelRt);
        setRw(pelRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
        setPos(posPel);
    }
    
    //method overload
        public String dataPelanggan(){
        return getKodePelanggan()+getNamaPelanggan()+getAlamat()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos();
    }
    
    public String dataPelanggan(String kodePelanggan, String namaPelanggan, String alamatPel, String rt, String rw, String kecamatan, String kabupaten, String propinsi, String posPel){
        setKodePelanggan(kodePelanggan);
        setNamaPelanggan(namaPelanggan);
        setAlamat(alamatPel);
        setRt(rt);
        setRw(rw);
        setKecamatan(kecamatan);
        setKabupaten(kabupaten);
        setPropinsi(propinsi);
        setPos(posPel);
        return getKodePelanggan()+getNamaPelanggan()+getAlamat()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos();
    }
}