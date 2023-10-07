/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author abil
 */
public class Sarjana extends Mahasiswa {

    private ArrayList<MatkulAmbil> mataKuliahDiambil;

    public Sarjana(String nama, String NIM, String jurusan, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> mataKuliahDiambil) {
        super(nama, NIM, jurusan, alamat, TTL, telepon);
        this.mataKuliahDiambil = mataKuliahDiambil;
    }

    public ArrayList<MatkulAmbil> getMataKuliahDiambil() {
        return mataKuliahDiambil;
    }

    public void setMataKuliahDiambil(ArrayList<MatkulAmbil> mataKuliahDiambil) {
        this.mataKuliahDiambil = mataKuliahDiambil;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMata Kuliah yang Diambil: " + mataKuliahDiambil ;
    }
}
