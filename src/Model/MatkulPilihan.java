/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public class MatkulPilihan extends MataKuliah {

    private int jumlahMinMahasiswa;

    public MatkulPilihan(int jumlahMinMahasiswa, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Minimum Mahasiswa: " + jumlahMinMahasiswa;
    }
}
