/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public class Doktor extends Mahasiswa {

    private String judulTesis;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;

    public Doktor(String nama, String NIM, String jurusan, String alamat, String TTL, String telepon, String judulTesis, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3) {
        super(nama, NIM, jurusan, alamat, TTL, telepon);
        this.judulTesis = judulTesis;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulTesis = judulDisertasi;
    }

    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDisertasi() {
        return judulTesis;
    }

    public double getNilaiSidang1() {
        return nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJudul Tesis : " + judulTesis
                + "\nNilai Sidang 1 : " + nilaiSidang1
                + "\nNilai Sidang 2 : " + nilaiSidang2
                + "\nNilai Sidang 3 : " + nilaiSidang3;
    }
}
