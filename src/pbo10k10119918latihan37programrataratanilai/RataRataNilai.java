/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan37programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class RataRataNilai {
    Scanner scanner = new Scanner(System.in);
    private int jumlahMahasiswa;
    private double nilaiMahasiswa, rataRata, totalNilai = 0;
    
    private double totalNilaiMahasiswa (int parJumlahMahasiswa) {
        for (int i = 1; i <= parJumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaiMahasiswa = scanner.nextDouble();
            totalNilai += nilaiMahasiswa;
        }
        
        return totalNilai;
    }
    
    private double rataRataNilaiMahasiswa (double parTotalNilai, int parJumlahMahasiswa) {
        return parTotalNilai / parJumlahMahasiswa;
    }
    
    public void hasilRataRataNilaiMahasiswa (int parJumlahMahasiswa) {
        totalNilai = this.totalNilaiMahasiswa(parJumlahMahasiswa);
        
        rataRata = this.rataRataNilaiMahasiswa(totalNilai, parJumlahMahasiswa);
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Andreas Suryadi");
    }
}
