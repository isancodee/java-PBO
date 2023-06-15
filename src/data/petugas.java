/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.Scanner;

/**
 *
 * @author Muhammad Al-Iksan
 */
public class petugas {
    //variabel
    private String username;
    private String pass;
    private String nama;
    private String alamat;
    private String rt;
    private String rw;
    private String kecamatan;
    private String kabupaten;
    private String propinsi;
    private String pos;
    private String kontak;
    private String status;
    
    
    
    //construktor overload
    public petugas() {}
    
    /*public void setUsername(String login){
        /*Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Username Anda : ");
        login = objku.nextLine();*/
        //this.username=login;
    //} 
    
    public petugas(String pUsername){
        setUsername(pUsername);
    }
    
    public petugas(String pUsername, String password){
        setUsername(pUsername);
        setPass(password);
    }
    
    public petugas(String pUsername, String password, String pNama){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
    }
    
    public petugas(String pUsername, String password, String pNama, String pAlamat){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
    }
    
    public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
    }
    
    public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        
    }
    
    public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
    }
    
       public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan, String pKabupaten){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
        setKabupaten(pKabupaten);
    }
       
        public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan, String pKabupaten, String pPropinsi){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
        setKabupaten(pKabupaten);
        setPropinsi(pPropinsi);
    }
        
        public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan, String pKabupaten, String pPropinsi, String pPos){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
        setKabupaten(pKabupaten);
        setPropinsi(pPropinsi);
        setPos(pPos);
    }
        public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan, String pKabupaten, String pPropinsi, String pPos, String pKontak){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
        setKabupaten(pKabupaten);
        setPropinsi(pPropinsi);
        setPos(pPos);
        setKontak(pKontak);
    }
        public petugas(String pUsername, String password, String pNama, String pAlamat, String pRt, String pRw, String pKecamatan, String pKabupaten, String pPropinsi, String pPos, String pKontak, String pStatus){
        setUsername(pUsername);
        setPass(password);
        setNama(pNama);
        setAlamat(pAlamat);
        setRt(pRt);
        setRw(pRw);
        setKecamatan(pKecamatan);
        setKabupaten(pKabupaten);
        setPropinsi(pPropinsi);
        setPos(pPos);
        setKontak(pKontak);
        setStatus(pStatus);
    }
        
    //konstruktor 
    public void setUsername(String pUsername){
        this.username=pUsername;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    
    
    public void setPass(String password){
        this.pass=password;
    }
    
    public String getPass(){
        return this.pass;
    }
    
    public void setNama(String pNama){
        this.nama=pNama;
    }
    
    public String getNama(){
        return this.nama;
    }

    public void setAlamat(String pAlamat){
        this.alamat=pAlamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setRt(String pRt){
        this.rt=pRt;
    }
    
    public String getRt(){
        return this.rt;
    }

    public void setRw(String pRw){
        this.rw=pRw;
    }
    
    public String getRw(){
        return this.rw;
    }

    public void setKecamatan(String pKecamatan){
        this.kecamatan=pKecamatan;
    }
    
    public String getKecamatan(){
        return this.kecamatan;
    }

    public void setKabupaten(String pKabupaten){
        this.kabupaten=pKabupaten;
    }
    
    public String getKabupaten(){
        return this.kabupaten;
    }

    public void setPropinsi(String pPropinsi){
        this.propinsi=pPropinsi;
    }
    
    public String getPropinsi(){
        return this.propinsi;
    }

    public void setPos(String pPos){
        this.pos=pPos;
    }
    
    public String getPos(){
        return this.pos;
    }

    public void setKontak(String pKontak){
        this.kontak=pKontak;
    }
    
    public String getKontak(){
        return this.kontak;
    }

    public void setStatus(String pStatus){
        this.status=pStatus;
    }
    
    public String getStatus(){
        return this.status;
    }

    
    public String dataPetugas(){
        return getUsername()+getPass()+getNama()+getAlamat()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos()+getKontak()+getStatus();
    }
    
    public String dataPetugas(String x, String psw, String nma, String almt, String rt, String rw, String kcmt, String kptn, String i, String prov, String ktk, String sts){
        setUsername(x);
        setPass(psw);
        setNama(nma);
        setAlamat(almt);
        setRt(rt);
        setRw(rw);
        setKecamatan(kcmt);
        setKabupaten(kptn);
        setPropinsi(i);
        setPos(prov);
        setKontak(ktk);
        setStatus(sts);
        return getUsername()+getPass()+getNama()+getAlamat()+getRt()+getRw()+getKecamatan()+getKabupaten()+getPropinsi()+getPos()+getKontak()+getStatus();
    }
}
