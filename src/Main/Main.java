/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Model.Doktor;
import Model.DosenHonorer;
import Model.DosenTetap;
import Model.Karyawan;
import Model.Magister;
import Model.MataKuliah;
import Model.MatkulAjar;
import Model.MatkulAmbil;
import Model.MatkulPilihan;
import Model.Presensi;
import Model.PresensiStaff;
import Model.Sarjana;
import Model.User;
import java.util.ArrayList;
import View.MenuSIA;
import Controller.Controller;
import Model.Status;

/**
 *
 * @author abil
 */
public class Main {

    public static void dummy(ArrayList<User> user) {

        // Data dummy buat Mata Kuliah Diambil Sarjana dan Magister 
        ArrayList<Presensi> presensiMatkul1 = new ArrayList<>();
        Presensi presensi1 = new Presensi(1, Status.HADIR); // untuk presensi matkul 1 
        presensiMatkul1.add(presensi1);

        ArrayList<Presensi> presensiMatkul2 = new ArrayList<>();
        Presensi presensi2 = new Presensi(2, Status.TIDAK_HADIR); // untuk presensi matkul 2 
        presensiMatkul2.add(presensi2);

        // Dummy buat Mata Kuliah saja 
        MataKuliah praktikumBasisdata = new MataKuliah("IF-203", 2, "Praktikum Basis Data");
        MataKuliah basisData = new MataKuliah("IF-303", 4, "Basis Data");
        MataKuliah webDesain = new MataKuliah("IF-403", 3, "Web Desain");

        // Dummy buat Mata Kuliah yang diambil Sarjana dan Magister
        ArrayList<MatkulAmbil> matkulAmbil1 = new ArrayList<>();
        MatkulAmbil matkulA = new MatkulAmbil(presensiMatkul1, praktikumBasisdata, 55, 45, 56);
        MatkulAmbil matkulB = new MatkulAmbil(presensiMatkul1, webDesain, 25,30, 66);
        matkulAmbil1.add(matkulA);
        matkulAmbil1.add(matkulB);

        ArrayList<MatkulAmbil> matkulAmbil2 = new ArrayList<>();
        MatkulAmbil matkulC = new MatkulAmbil(presensiMatkul2, basisData, 80, 85, 90);
        matkulAmbil2.add(matkulC);

        //Dummy buat Matkul Pilihan
        MatkulPilihan matkulPilih1 = new MatkulPilihan(10, "IF-403", 3, "Game Developer");

        // Dummy buat Mahasiswa Sarjana, Magister, 
        Sarjana sarjana = new Sarjana("Mochamad", "1122025", "Informatika", "Jln Gak tau", "Bandung, 10 Oktober", "0895", matkulAmbil1);
        user.add(sarjana);

        Magister magister = new Magister("Habil", "1122030", "Informatika", "Jln Jalan", "Bandung, 10 Oktober", "0895", matkulAmbil2, "Analisis Strategi Informasi");
        user.add(magister);

        Doktor doktor = new Doktor("Alqaswa", "1122040", "Informatika", "Jln Sendiri", "Bandung, 10 Oktober", "0895", "Analisis Strategi Jaringan", 98, 89, 100);
        user.add(doktor);

        // Data dummy buat PresensiStaff
        ArrayList<PresensiStaff> presensiStaff1 = new ArrayList<>();
        PresensiStaff presensiS1 = new PresensiStaff(3, 1, Status.HADIR);
        PresensiStaff presensiS2 = new PresensiStaff(3, 1, Status.TIDAK_HADIR);
        presensiStaff1.add(presensiS1);
        presensiStaff1.add(presensiS2);

        ArrayList<PresensiStaff> presensiStaff2 = new ArrayList<>();
        PresensiStaff presensiS3 = new PresensiStaff(2, 2, Status.HADIR);
        presensiStaff2.add(presensiS3);

        // Dummy buat Mata Kuliah yang Diajar
        ArrayList<MatkulAjar> mataKuliahAjar1 = new ArrayList<>();
        MatkulAjar matkul1 = new MatkulAjar(presensiStaff2, praktikumBasisdata);
        mataKuliahAjar1.add(matkul1);

        ArrayList<MatkulAjar> mataKuliahAjar2 = new ArrayList<>();
        MatkulAjar matkul2 = new MatkulAjar(presensiStaff2, basisData);
        mataKuliahAjar2.add(matkul2);

        // Dummy buat Dosen Tetap
        DosenTetap dosenT1 = new DosenTetap("Informatika", "101", "Firhat", "Jln Jalan", "Bandung, 10 Januari 1999", "0895", 5000000, mataKuliahAjar1);
        user.add(dosenT1);

        //Dummy Buat Dosen Honorer
        DosenHonorer dosenH1 = new DosenHonorer("Informatika", "102", "Budi", "Jln. Sendiri", "Bandung, 10 Januari 1997", "0895", 450000, mataKuliahAjar2);
        user.add(dosenH1);

        //Dummy Buat Karyawan
        Karyawan karyawan1 = new Karyawan("111", "Inge martina", "Jln. Utara", "Bandung, 11 Januari 1996 ", "0895", 650000, presensiStaff1);
        user.add(karyawan1);
    }

    public static void main(String[] args) {
        Main maiClass = new Main();

//        maiClass.printData(user);
        MenuSIA.showMainMenu();

    }
}
