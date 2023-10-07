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
public class Dosen extends Staff {

    private String departemen;
    private ArrayList<MatkulAjar> mataKuliahDiajar;

    public Dosen(String departemen, ArrayList<MatkulAjar> mataKuliahDiajar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        this.mataKuliahDiajar = mataKuliahDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setMataKuliahDiajar(ArrayList<MatkulAjar> mataKuliahDiajar) {
        this.mataKuliahDiajar = mataKuliahDiajar;
    }

    public ArrayList<MatkulAjar> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen : " + departemen + "\nMata Kuliah Diajar : " + mataKuliahDiajar;
    }
}
