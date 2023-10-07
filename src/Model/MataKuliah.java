/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public class MataKuliah {

    private String kode;
    private int sks;
    private String nama;

    public MataKuliah(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public int getSks() {
        return sks;
    }

    public String getNama() {
        return nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Kode : " + kode + "\nBanyak SKS diambil : " + sks + "\nNama MataKuliah : " + nama;
    }
}
