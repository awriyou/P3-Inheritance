/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package INHERITANCE_P3;

/**
 *
 * @author febri
 */
public class Mahasiswa {
    String nim, nama, grade;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
    
    Mahasiswa(){
        
    }
    
    public void setDataMahasiswa(String nim, String nama, int nilai){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getGrade() {
        if( nilai >= 80 && nilai <= 100){
            grade = "A";
        }else if(nilai >= 70 && nilai <= 79){
            grade = "B";
        }else if(nilai >= 60 && nilai <= 69){
            grade = "C";
        }else if(nilai >= 50 && nilai <= 59){
            grade = "D";
        }else if(nilai < 50){
            grade = "E";
        }else{
            System.out.println("NILAI YANG ANDA MASUKAN SALAH");
        }
        return grade;
    }

    public int getNilai() {
        return nilai;
    }
    
    public void infoMahasiswa(){
        System.out.println("NIM   : "+ getNim());
        System.out.println("NAMA  : "+ getNama());
        System.out.println("NILAI : "+ getNilai());
        System.out.println("GRADE : " + getGrade());
//        System.out.println("GRADE : "+ getGrade());
        System.out.println("====================");
    }
    
    
    
}

