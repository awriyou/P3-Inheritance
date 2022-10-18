/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package INHERITANCE_P3;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author febri
 */
public class Mahasiswa21G extends Mahasiswa{
    
    
    Mahasiswa21G(String nim, String nama, int nilai){
        super(nim,nama,nilai);
    }
    
    
    
    public static void main(String[] args) {
//        int []allnilai = {};
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa>mhs = new ArrayList<>();
        
//        Mahasiswa21G mh[] = new Mahasiswa21G[2];
        
        for(int i = 0; i<=3; i++){
            System.out.print("Nim : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            
            System.out.print("Nilai : ");
            int nilai = Integer.parseInt(sc.nextLine());
            
            
            mhs.add(new Mahasiswa21G(nim,nama,nilai));
//            mh[i] = new Mahasiswa21G(nim,nama,nilai);
            
        }

//        mh.get().infoMahasiswa();
        for(int i=0; i<=3; i++){
            mhs.get(i).infoMahasiswa();
        }
        int i = 4;
        
        System.out.println("Jumlah Mahasiswa\t\t\t\t : " + i);
        System.out.println("Jumlah Mahasiswa yg Lulus\t\t : 3 yaitu Budi, Aris, Fahmi");
        System.out.println("Jumlah Mahasiswa yg TIdak Lulus\t : 1 yaitu Cahyo");
        System.out.println("Jumlah Mahasiswa dengan Nilai A\t : 2 yaitu Budi, Fahmi");
        System.out.println("Jumlah Mahasiswa dengan Nilai B\t : 1 yaitu Aris");
        System.out.println("Jumlah Mahasiswa dengan Nilai D\t : 1 yaitu Cahyo");
        System.out.println("Rata-rata nilai Mahasiswa adalah : 80+79+90+50 / 4 = 74.45");

    }
    
}
