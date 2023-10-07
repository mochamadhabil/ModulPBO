/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MINGGU2;

import java.util.Scanner;

/**
 *
 * @author abil
 */
class Pasien {

    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[5];
    boolean pakaiBPJS;

    public Pasien() {
    }
}

class JenisKamar {

    String kelas;
    int hargaPerHari;

    public JenisKamar(String kelas, int hargaPerHari) {
        this.kelas = kelas;
        this.hargaPerHari = hargaPerHari;
    }

}

class JenisPerawatan {

    String nama;
    int biaya;

    public JenisPerawatan(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

}

public class MODUL1_1122038_MochamadHabilAlqaswa {

    public int hitungTotalBiaya(Pasien pasien) {
        int totalBiayaRawatInap = 0;
        int totalBiayaPerawatan = 0;

        for (int i = 0; i < pasien.rawatInap.length; i++) {
            if (pasien.rawatInap[i] != null) {
                totalBiayaRawatInap += pasien.rawatInap[i].hargaPerHari;
            }
        }

        for (int i = 0; i < pasien.perawatan.length; i++) {
            if (pasien.perawatan[i] != null) {
                totalBiayaPerawatan += pasien.perawatan[i].biaya;
            }
        }

        if (pasien.pakaiBPJS) {
            totalBiayaRawatInap = 0;
        }

        int totalBiaya = totalBiayaRawatInap + totalBiayaPerawatan;
        return totalBiaya;
    }

    public int hitungTotalPendapatan(Pasien[] patients) {
        int totalPendapatan = 0;

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                totalPendapatan += hitungTotalBiaya(patients[i]);
            }
        }

        return totalPendapatan;
    }

    public int hitungJumlahPasienDenganPerawatan(Pasien[] patients, String jenisPerawatan) {
        int jumlahPasien = 0;

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                for (int j = 0; j < patients[i].perawatan.length; j++) {
                    if (patients[i].perawatan[j] != null && patients[i].perawatan[j].nama.equalsIgnoreCase(jenisPerawatan)) {
                        jumlahPasien++;
                    }
                }
            }
        }

        return jumlahPasien;
    }

    public static void main(String[] args) {
        MODUL1_1122038_MochamadHabilAlqaswa main = new MODUL1_1122038_MochamadHabilAlqaswa();
        Scanner input = new Scanner(System.in);
        Pasien[] patients = new Pasien[150];

        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien();

            System.out.println("Masukkan nama pasien ke-" + (i + 1) + ":");
            patients[i].nama = input.next();

            System.out.println("Apakah pasien ke-" + (i + 1) + " menggunakan BPJS? (true/false)");
            patients[i].pakaiBPJS = input.nextBoolean();

            for (int j = 0; j < patients[i].rawatInap.length; j++) {
                System.out.println("Masukkan kelas kamar (VIP/I/II/III) untuk hari ke-" + (j + 1) + ":");
                String kelasKamar = input.next();
                System.out.println("Masukkan harga per hari untuk kamar " + kelasKamar + ":");
                int hargaPerHari = input.nextInt();

                patients[i].rawatInap[j] = new JenisKamar(kelasKamar, hargaPerHari);
            }

            for (int j = 0; j < patients[i].perawatan.length; j++) {
                System.out.println("Masukkan nama jenis perawatan ke-" + (j + 1) + ":");
                String namaPerawatan = input.next();
                System.out.println("Masukkan biaya perawatan " + namaPerawatan + ":");
                int biayaPerawatan = input.nextInt();

                patients[i].perawatan[j] = new JenisPerawatan(namaPerawatan, biayaPerawatan);
            }
        }
        for (int i = 0; i < patients.length; i++) {
            int totalBiayaPasien = main.hitungTotalBiaya(patients[i]);
            System.out.println("Total biaya pasien ke : " + (i + 1) + " : " + totalBiayaPasien);
        }

        int totalPendapatan = main.hitungTotalPendapatan(patients);
        System.out.println("Total pendapatan rumah sakit: " + totalPendapatan);

        int jumlahPasienOperasi = main.hitungJumlahPasienDenganPerawatan(patients, "Operasi");
        System.out.println("Jumlah pasien yang menggunakan perawatan 'Operasi': " + jumlahPasienOperasi);
    }
}
