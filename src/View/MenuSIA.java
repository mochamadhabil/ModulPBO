/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.User;
import Main.Main;

public class MenuSIA {

    public MenuSIA() {
        showMainMenu();
    }

    public static void showMainMenu() {
        ArrayList<User> listUser = new ArrayList<User>();
        Main.dummy(listUser);
        Boolean menu = true;

        while (menu) {
            int pilihMenu = Integer.parseInt(JOptionPane.showInputDialog("Pilih Menu : \n1. Print Data User"
                    + " \n2. Print Nilai Akhir (NA)"
                    + " \n3. Print Rata-Rata Nilai Akhir (NR)"
                    + " \n4. Print Banyak Mahasiswa Yang Tidak Lulus"
                    + " \n5. Matkul Diambil Mahasiswa"
                    + " \n6. Total Jam Mengajar Dosen"
                    + " \n7. Gaji Seorsng Staff"
                    + " \n8. Exit")
            );

            switch (pilihMenu) {
                case 1:
                    String nama = JOptionPane.showInputDialog("Masukkan Nama :");
                    String hasil = Controller.userData(nama, listUser);
                    JOptionPane.showMessageDialog(null, hasil);
                    break;
                case 2:
                    String NIM = JOptionPane.showInputDialog("Masukkan NIM :");
                    String kodeMK = JOptionPane.showInputDialog("Masukkan Kode Matakuliah :");
                    Double nilaiAkhir = Controller.nilaiAkhir(NIM, kodeMK, listUser);
                    JOptionPane.showMessageDialog(null, nilaiAkhir);
                    break;
                case 3:
                    kodeMK = JOptionPane.showInputDialog("Masukkan Kode Matakuliah :");
                    Double rataNilaiAkhir = Controller.rataNilaiAkhir(kodeMK, listUser);
                    JOptionPane.showMessageDialog(null, rataNilaiAkhir);
                    break;
                case 4:
                    kodeMK = JOptionPane.showInputDialog("Masukkan Kode Matakuliah :");
                    Double banyakMhsTidakLulus = Controller.banyakMahasiswaTidakLulus(kodeMK, listUser);
                    JOptionPane.showMessageDialog(null, banyakMhsTidakLulus + " dari ");
                    break;
                case 5:
                    NIM = JOptionPane.showInputDialog("Masukkan NIM :");
                    hasil = Controller.mataKuliahDiambil(NIM, listUser);
                    JOptionPane.showMessageDialog(null, hasil);
                    break;
                case 6:
                    String NIK = JOptionPane.showInputDialog("Masukkan NIK:");
                    int totalJam = Controller.hitungTotalJamMengajar(NIK, listUser);
                    JOptionPane.showMessageDialog(null, totalJam);
                    break;
                case 7:
                    double gaji = Controller.hitungGajiStaff(listUser);
                    JOptionPane.showMessageDialog(null, gaji);
                    break;
                case 8:
                    menu = false;
                    break;
            }
        }
    }
}
