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
public class MatkulAjar {

    private ArrayList<PresensiStaff> presensiStaff;
    private MataKuliah mataKuliahAjar;

    public MatkulAjar(ArrayList<PresensiStaff> presensiStaff, MataKuliah mataKuliahAjar) {
        this.presensiStaff = presensiStaff;
        this.mataKuliahAjar = mataKuliahAjar;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(MataKuliah mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }

    

    @Override
    public String toString() {
        return "\n" + mataKuliahAjar + "\nPresensi Staff: " + presensiStaff;
    }
}
