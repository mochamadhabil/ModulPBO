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
public class DosenTetap extends Dosen {

    private double salary;

    public DosenTetap(String departemen, String NIK, String nama, String alamat, String TTL, String telepon, double salary, ArrayList<MatkulAjar> mataKuliahDiajar) {
        super(departemen, mataKuliahDiajar, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary : " + salary;
    }
}
