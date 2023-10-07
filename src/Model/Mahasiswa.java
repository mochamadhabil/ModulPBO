/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public abstract class Mahasiswa extends User {

    private String NIM;
    private String jurusan;

    public Mahasiswa(String nama, String NIM, String jurusan, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }
}
