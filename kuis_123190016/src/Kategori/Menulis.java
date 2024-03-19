/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kategori;
import Penilaian.Perhitungan;

/**
 *
 * @author Lab Informatika
 */
public class Menulis extends InputNilai implements Perhitungan {
    public Menulis(String nama,String sekolah,int nilaiSatu,int nilaiDua,int nilaiTiga,int nilaiEmpat){
       super(nama,sekolah,nilaiSatu,nilaiDua,nilaiTiga,nilaiEmpat); 
    }
    public void inputNilaiSatu(int nilaiSatu){
        this.nilaiSatu = nilaiSatu;
    }
    public void inputNilaiDua(int nilaiDua){
        this.nilaiDua = nilaiDua;
    }
    public void inputNilaiTiga(int nilaiTiga){
        this.nilaiTiga = nilaiTiga;
    }
    public void inputNilaiEmpat(int nilaiEmpat){
        this.nilaiEmpat = nilaiEmpat;
    }

    @Override
    public double nilaiTotal() {
        return(0.10*super.nilaiSatu)+(0.40*super.nilaiDua)+(0.30*super.nilaiTiga)+(0.20*super.nilaiEmpat);
    }

    @Override
    public String keterangan() {
        if(this.nilaiTotal()>=85)
            return"LULUS\n "+this.nama+" telah LULUS SELEKSI Perlombaan Menulis Surat/n";
        else
            return"GAGAL\n "+this.nama+" TIDAK LULUS SELEKSI Perlombaan Menulis Surat";
    }
}

