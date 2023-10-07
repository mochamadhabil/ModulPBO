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
public class Magister extends Mahasiswa {

    private ArrayList<MatkulAmbil> mataKuliahDiambil;
    private String judulTesis;

    public Magister(String nama, String NIM, String jurusan, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> mataKuliahDiambil, String judulTesis) {
        super(nama, NIM, jurusan, alamat, TTL, telepon);
        this.mataKuliahDiambil = mataKuliahDiambil;
        this.judulTesis = judulTesis;
    }

    public ArrayList<MatkulAmbil> getMataKuliahDiambil() {
        return mataKuliahDiambil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setMataKuliahDiambil(ArrayList<MatkulAmbil> mataKuliahDiambil) {
        this.mataKuliahDiambil = mataKuliahDiambil;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMata Kuliah yang Diambil: " + mataKuliahDiambil + "\nJudul Tesis: " + judulTesis;
    }
}
