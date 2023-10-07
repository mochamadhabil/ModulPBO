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
public class DosenHonorer extends Dosen {

    private double honorPerSKS;

    public DosenHonorer(String departemen, String NIK, String nama, String alamat, String TTL, String telepon, double honorPerSKS, ArrayList<MatkulAjar> mataKuliahDiajar) {
        super(departemen, mataKuliahDiajar, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHonor Per SKS : " + honorPerSKS;
    }

}
