/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abil
 */
public class Presensi {

    private int tanggal;
    private Status status; // 1 untuk Hadir, 0 untuk Alpha

    public Presensi(int tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tanggal : " + tanggal + ", Status Kehadiran : " + status;
    }

}
