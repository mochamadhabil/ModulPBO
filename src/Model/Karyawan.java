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
public class Karyawan extends Staff {

    private double salary;
    private ArrayList<PresensiStaff> presensiStaff;

    public Karyawan(String NIK, String nama, String alamat, String TTL, String telepon, double salary, ArrayList<PresensiStaff> presensiStaff) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nPresensi Staff: " + presensiStaff;
    }

}
