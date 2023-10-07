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
public class MatkulAmbil {

    private ArrayList<Presensi> presensi;
    private MataKuliah mataKuliahAmbil;
    private double n1;
    private double n2;
    private double n3;

    public MatkulAmbil(ArrayList<Presensi> presensi, MataKuliah mataKuliahAmbil, double n1, double n2, double n3) {
        this.presensi = presensi;
        this.mataKuliahAmbil = mataKuliahAmbil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public MataKuliah getMataKuliahAmbil() {
        return mataKuliahAmbil;
    }

    public void setMataKuliahAmbil(MataKuliah mataKuliahAmbil) {
        this.mataKuliahAmbil = mataKuliahAmbil;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    

   

    @Override
    public String toString() {
        return "\n" + mataKuliahAmbil + "\nPresensi: " + presensi + "\nN1 : " + n1 + "\nN2 : " + n2 + "\nN3 : " + n3;
    }
}
