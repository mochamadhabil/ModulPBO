/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public abstract class User {

    private String nama;
    private String alamat;
    private String TTL;
    private String telepon;

    public User(String nama, String alamat, String TTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nTempat/Tanggal Lahir: " + TTL + "\nTelepon: " + telepon;
    }
}
