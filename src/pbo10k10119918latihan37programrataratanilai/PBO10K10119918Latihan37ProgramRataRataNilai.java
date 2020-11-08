/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan37programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil rata-rata nilai dari data yang diinput-
 * kan menggunakan sistem OOP
 *
 */

public class PBO10K10119918Latihan37ProgramRataRataNilai {

    private static int jumlahMahasiswa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        RataRataNilai rataRataNilai = new RataRataNilai();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        System.out.println();
        
        rataRataNilai.hasilRataRataNilaiMahasiswa(jumlahMahasiswa);
    }
    
}
