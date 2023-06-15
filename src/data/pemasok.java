/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class pemasok {
    
    //variabel
    private String kodePemasok;
    private String nomorIzin;
    private String namaPerusahaan;
    private String alamatKantor;
    private String rt;
    private String rw;
    private String kecamatan;
    private String kabupaten;
    private String propinsi;
    private String pos;
    private String kontak;
    private String direktur;
    private String keterangan;
    
    //konstruktor 1
public void setKodePemasok(String kodePem){
        this.kodePemasok=kodePem;
    }
    
    public String getKodePemasok(){
        return this.kodePemasok;
    }
    
public void setNomorIzin(String noIzin){
        this.nomorIzin=noIzin;
    }
    
    public String getNomorIzin(){
        return this.nomorIzin;
    }
    
public void setNamaPerusahaan(String naperus){
        this.namaPerusahaan=naperus;
    }
    
    public String getNamaPerusahaan(){
        return this.namaPerusahaan;
    }

public void setAlamatKantor(String alamatKan){
        this.alamatKantor=alamatKan;
    }
    
    public String getAlamatKantor(){
        return this.alamatKantor;
    }

public void setRt(String pemRt){
        this.rt=pemRt;
    }
    
    public String getRt(){
        return this.rt;
    }

public void setRw(String pemRw){
        this.rw=pemRw;
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

public void setPos(String posPemasok){
        this.pos=posPemasok;
    }
    
    public String getPos(){
        return this.pos;
    }

public void setKontak(String kontakPemasok){
        this.kontak=kontakPemasok;
    }
    
    public String getKontak(){
        return this.kontak;
    }

public void setDirektur(String drktr){
        this.direktur=drktr;
    }
    
    public String getDirektur(){
        return this.direktur;
    }

public void setKeterangan(String ket){
        this.keterangan=ket;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
    
    
    //konstruktor overload
    public pemasok() {}
    
    
    public pemasok(String kodePem){
        setKodePemasok(kodePem);
    }
    
    public pemasok(String kodePem, String noIzin){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
    }
    
    public pemasok(String kodePem, String noIzin, String naperus){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
    }
    
    public pemasok(String kodePem, String noIzin, String naperus, String alamatKan){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
    }
    
    public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
    }
    
    public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        
    }
    
    public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
    }
    
       public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
    }
       
        public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn, String prov){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
    }
        
        public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn, String prov, String posPemasok){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
        setPos(posPemasok);
    }
        public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn, String prov, String posPemasok, String kontakPemasok){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
        setPos(posPemasok);
        setKontak(kontakPemasok);
    }
        public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn, String prov, String posPemasok, String kontakPemasok, String drktr){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
        setPos(posPemasok);
        setKontak(kontakPemasok);
        setDirektur(drktr);
    }

     public pemasok(String kodePem, String noIzin, String naperus, String alamatKan, String pemRt, String pemRw, String kcmtn, String kbptn, String prov, String posPemasok, String kontakPemasok, String drktr, String ket){
        setKodePemasok(kodePem);
        setNomorIzin(noIzin);
        setNamaPerusahaan(naperus);
        setAlamatKantor(alamatKan);
        setRt(pemRt);
        setRw(pemRw);
        setKecamatan(kcmtn);
        setKabupaten(kbptn);
        setPropinsi(prov);
        setPos(posPemasok);
        setKontak(kontakPemasok);
        setDirektur(drktr);
        setKeterangan(ket);
    }
    
     
    public String dataPemasok(){
        return getKodePemasok()+getNomorIzin()+getNamaPerusahaan()+getAlamatKantor()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos()+getKontak()+getDirektur()+getKeterangan();
    }
    
    public String dataPemasok(String kodePemasok, String nomorIzin, String namaPerusahaan, String alamatKantor, String rt, String rw, String kecamatan, String kabupaten, String propinsi, String pos, String kontak, String direktur, String keterangan){
        setKodePemasok(kodePemasok);
        setNomorIzin(nomorIzin);
        setNamaPerusahaan(namaPerusahaan);
        setAlamatKantor(alamatKantor);
        setRt(rt);
        setRw(rw);
        setKecamatan(kecamatan);
        setKabupaten(kabupaten);
        setPropinsi(propinsi);
        setPos(pos);
        setKontak(kontak);
        setDirektur(direktur);
        setKeterangan(keterangan);
        return getKodePemasok()+getNomorIzin()+getNamaPerusahaan()+getAlamatKantor()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos()+getKontak()+getDirektur()+getKeterangan();
    }
    
    
}
