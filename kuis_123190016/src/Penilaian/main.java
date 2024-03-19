/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;
import Kategori.Animasi;
import Kategori.InputNilai;
import Kategori.Menulis;
import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class main {
    public static void main(String[]args){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("KATEGORI PERLOMBAAN");
            System.out.println("1. ANIMASI");
            System.out.println("2. MENULIS SURAT");
            System.out.println("Pilih Jenis Perlombaan : ");
            int pilih = input.nextInt();
            
            System.out.println("----Formulir Peserta----");
            Scanner data = new Scanner(System.in);
            System.out.println("Nama Lengkap : ");
            String nama = data.next();
            System.out.println("Asal Sekolah : ");
            String sekolah = data.next();
            
            if(pilih==1){
                System.out.println("Input Nilai Alur Cerita : ");
                int nilaiSatu = data.nextInt();
                System.out.println("Input Nilai Konten : ");
                int nilaiDua = data.nextInt();
                System.out.println("Input Nilai Kreativitas : ");
                int nilaiTiga = data.nextInt();
                System.out.println("Input Nilai Sinematografi : ");
                int nilaiEmpat = data.nextInt();
                
                Animasi animasi = new Animasi(nama,sekolah,nilaiSatu,nilaiDua,nilaiTiga,nilaiEmpat);
                do{
                    System.out.println("1. Tampilkan Hasil");
                    System.out.println("2. Edit Nilai");
                    System.out.println("3. Keluar");
                    int Menu = input.nextInt();
                    
                    if(Menu==1){
                        System.out.println("Nilai Akhir : " + animasi.nilaiTotal());
                        System.out.println("Keterangan : " + animasi.keterangan());
                    }
                    else if(Menu==2){
                        System.out.println("Input Nilai Alur Cerita : ");
                        animasi.inputNilaiSatu(input.nextInt());
                        System.out.println("Input Nilai Konten : ");
                        animasi.inputNilaiDua(input.nextInt());
                        System.out.println("Input Nilai Kreativitas : ");
                        animasi.inputNilaiTiga(input.nextInt());
                        System.out.println("Input Nilai Sinematografi : ");
                        animasi.inputNilaiEmpat(input.nextInt());
                    }
                    else{
                        System.out.println("Terima Kasih");
                        break;
                    }
                }while(true);
            }
            else if(pilih==2){
               System.out.println("Input Nilai Struktur Surat : ");
                int nilaiSatu = data.nextInt();
                System.out.println("Input Nilai Isi Surat : ");
                int nilaiDua = data.nextInt();
                System.out.println("Input Nilai Kreativitas : ");
                int nilaiTiga = data.nextInt();
                System.out.println("Input Nilai Penerapan Kaidah Bahasa : ");
                int nilaiEmpat = data.nextInt();
                
                Menulis menulis = new Menulis(nama,sekolah,nilaiSatu,nilaiDua,nilaiTiga,nilaiEmpat);
                do{
                    System.out.println("1. Tampilkan Hasil");
                    System.out.println("2. Edit Nilai");
                    System.out.println("3. Keluar");
                    int Menu = input.nextInt();
                    
                    if(Menu==1){
                        System.out.println("Nilai Akhir : " + menulis.nilaiTotal());
                        System.out.println("Keterangan : " + menulis.keterangan());
                    }
                    else if(Menu==2){
                        System.out.println("Input Nilai Struktur Surat : ");
                        menulis.inputNilaiSatu(input.nextInt());
                        System.out.println("Input Nilai Isi Surat : ");
                        menulis.inputNilaiDua(input.nextInt());
                        System.out.println("Input Nilai Kreativitas : ");
                        menulis.inputNilaiTiga(input.nextInt());
                        System.out.println("Input Nilai Penerapan Kaidah Bahasa : ");
                        menulis.inputNilaiEmpat(input.nextInt());
                    }
                    else{
                        System.out.println("Terima Kasih");
                        break;
                    }
                }while(true);
            }
            else{
                System.out.println("Input Salah");
                System.out.println("Mohon Input Ulang");
            }
        }
        catch(Exception error){
            System.out.println("error karena "+ error.getMessage());
        }
    }
    
}
