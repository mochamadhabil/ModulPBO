/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MenuSIA;


import java.util.ArrayList;
import Model.*;

public class Controller {

    public static String userData(String inputNama, ArrayList<User> listUser) {
        String hasil = " ";
        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia.getNama().equalsIgnoreCase(inputNama)) {
                if (sia instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + sarjana.toString() + "\n Status : Mahasiswa Sarjana ");
                } else if (sia instanceof Magister) {
                    Magister magister = (Magister) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + magister.toString() + "\n Status : Mahasiswa Magister ");
                } else if (sia instanceof Doktor) {
                    Doktor doktor = (Doktor) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + doktor.toString() + "\n Status : Mahasiswa Doktor ");
                } else if (sia instanceof DosenTetap) {
                    DosenTetap dosenTetap = (DosenTetap) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + dosenTetap.toString() + "\n Status : DosenTetap ");
                } else if (sia instanceof DosenHonorer) {
                    DosenHonorer dosenHonor = (DosenHonorer) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + dosenHonor.toString() + "\n Status : DosenHonorer ");
                } else if (sia instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) sia;
                    hasil = ("Nama : " + inputNama + "Data User : " + karyawan.toString() + "\n Status : Karyawan ");
                }
            }
        }
        return hasil;
    }

    public static Double nilaiAkhir(String NIM, String kodeMK, ArrayList<User> listUser) {
        double nilaiAkhir = 0;
        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);

            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                if (NIM.equals(sarjana.getNIM())) {
                    for (int j = 0; j < sarjana.getMataKuliahDiambil().size(); j++) {
                        if (kodeMK.equals(sarjana.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                            nilaiAkhir = sarjana.getMataKuliahDiambil().get(j).getN1() + sarjana.getMataKuliahDiambil().get(j).getN2() + sarjana.getMataKuliahDiambil().get(j).getN3();
                        }
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                if (NIM.equals(magister.getNIM())) {
                    for (int j = 0; j < magister.getMataKuliahDiambil().size(); j++) {
                        if (kodeMK.equals(magister.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                            nilaiAkhir = magister.getMataKuliahDiambil().get(j).getN1() + magister.getMataKuliahDiambil().get(j).getN2() + magister.getMataKuliahDiambil().get(j).getN3();
                        }
                    }
                }
            } else if (sia instanceof Doktor) {
                Doktor doktor = (Doktor) sia;
                if (NIM.equals(doktor.getNIM())) {
                    nilaiAkhir = doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3();
                }
            }
        }
        return nilaiAkhir / 3;
    }

    public static Double rataNilaiAkhir(String kodeMK, ArrayList<User> listUser) {
        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                for (int j = 0; j < sarjana.getMataKuliahDiambil().size(); j++) {
                    if (kodeMK.equals(sarjana.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                        double nilaiAkhir = (sarjana.getMataKuliahDiambil().get(j).getN1() + sarjana.getMataKuliahDiambil().get(j).getN2() + sarjana.getMataKuliahDiambil().get(j).getN3()) / 3;
                        totalNilai += nilaiAkhir;
                        jumlahMahasiswa++;
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                for (int j = 0; j < magister.getMataKuliahDiambil().size(); j++) {
                    if (kodeMK.equals(magister.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                        double nilaiAkhir = (magister.getMataKuliahDiambil().get(j).getN1() + magister.getMataKuliahDiambil().get(j).getN2() + magister.getMataKuliahDiambil().get(j).getN3()) / 3;
                        totalNilai += nilaiAkhir;
                        jumlahMahasiswa++;
                    }
                }
            }
        }
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            return rataRata;
        } else {
            return 0.0;
        }
    }

    public static Double banyakMahasiswaTidakLulus(String kodeMK, ArrayList<User> listUser) {
        double jumlahMahasiswa = 0;

        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                for (int j = 0; j < sarjana.getMataKuliahDiambil().size(); j++) {
                    if (kodeMK.equals(sarjana.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                        double nilaiAkhir = (sarjana.getMataKuliahDiambil().get(j).getN1() + sarjana.getMataKuliahDiambil().get(j).getN2() + sarjana.getMataKuliahDiambil().get(j).getN3()) / 3;
                        if (nilaiAkhir < 56) {
                            jumlahMahasiswa++;
                        }
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                for (int j = 0; j < magister.getMataKuliahDiambil().size(); j++) {
                    if (kodeMK.equals(magister.getMataKuliahDiambil().get(j).getMataKuliahAmbil().getKode())) {
                        double nilaiAkhir = (magister.getMataKuliahDiambil().get(j).getN1() + magister.getMataKuliahDiambil().get(j).getN2() + magister.getMataKuliahDiambil().get(j).getN3()) / 3;
                        if (nilaiAkhir < 56) {
                            jumlahMahasiswa++;
                        }
                    }
                }
            }
        }
        return jumlahMahasiswa;
    }

    public static String mataKuliahDiambil(String NIM, ArrayList<User> listUser) {
        String namaMataKuliah = "";
        int totalPresensi = 0;

        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);

            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                if (NIM.equals(sarjana.getNIM())) {
                    for (int j = 0; j < sarjana.getMataKuliahDiambil().size(); j++) {
                        MatkulAmbil matkulAmbil = sarjana.getMataKuliahDiambil().get(j);
                        namaMataKuliah += matkulAmbil.getMataKuliahAmbil().getNama();

                        for (int k = 0; k < matkulAmbil.getPresensi().size(); k++) {
                            if (matkulAmbil.getPresensi().get(k).getStatus() == Status.HADIR) {
                                totalPresensi++;
                            }
                        }
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                if (NIM.equals(magister.getNIM())) {
                    for (int j = 0; j < magister.getMataKuliahDiambil().size(); j++) {
                        MatkulAmbil matkulAmbil = magister.getMataKuliahDiambil().get(j);
                        namaMataKuliah += matkulAmbil.getMataKuliahAmbil().getNama();

                        for (int k = 0; k < matkulAmbil.getPresensi().size(); k++) {
                            if (matkulAmbil.getPresensi().get(k).getStatus() == Status.HADIR) {
                                totalPresensi++;
                            }
                        }
                    }
                }
            }
        }
        return "Nama Mata Kuliah: " + namaMataKuliah + "\n Total Presensi: " + totalPresensi;
    }

    public static int hitungTotalJamMengajar(String NIK, ArrayList<User> listUser) {
        int totalJamMengajar = 0;

        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);

            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                if (NIK.equals(staff.getNIK())) {
                    if (staff instanceof DosenTetap) {
                        DosenTetap dosenTetap = (DosenTetap) staff;
                        for (int j = 0; j < dosenTetap.getMataKuliahDiajar().size(); j++) {
                            MatkulAjar matkulAjar = dosenTetap.getMataKuliahDiajar().get(j);

                            for (int k = 0; k < matkulAjar.getPresensiStaff().size(); k++) {
                                if (matkulAjar.getPresensiStaff().get(k).getStatus() == Status.HADIR) {
                                    totalJamMengajar += matkulAjar.getPresensiStaff().get(k).getJam();
                                }
                            }
                        }
                    } else if (staff instanceof DosenHonorer) {
                        DosenHonorer dosenHonorer = (DosenHonorer) staff;
                        for (int j = 0; j < dosenHonorer.getMataKuliahDiajar().size(); j++) {
                            MatkulAjar matkulAjar = dosenHonorer.getMataKuliahDiajar().get(j);

                            for (int k = 0; k < matkulAjar.getPresensiStaff().size(); k++) {
                                if (matkulAjar.getPresensiStaff().get(k).getStatus() == Status.HADIR) {
                                    totalJamMengajar += matkulAjar.getPresensiStaff().get(k).getJam();
                                }
                            }
                        }
                    }
                }
            }
        }
        return totalJamMengajar;
    }

    public static double hitungGajiStaff(ArrayList<User> listUser) {
        double gaji = 0.0;
        double unit = 0.0;
        String NIK = " ";
        unit = hitungTotalJamMengajar(NIK, listUser);

        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                if (staff instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) staff;
                    for (int j = 0; j < karyawan.getPresensiStaff().size(); j++) {
                        PresensiStaff presensiStaff = karyawan.getPresensiStaff().get(j);
                        if (presensiStaff.getStatus() == Status.HADIR) {
                            unit++;
                        }
                    }
                    gaji = unit * karyawan.getSalary() / 22.0;
                } else if (staff instanceof DosenTetap) {
                    DosenTetap dosenTetap = (DosenTetap) staff;
                    gaji = dosenTetap.getSalary() + (unit * 25000);
                } else if (staff instanceof DosenHonorer) {
                    DosenHonorer dosenHonor = (DosenHonorer) staff;
                    gaji = dosenHonor.getHonorPerSKS() * unit;
                }
            }
        }
        return gaji;
    }
}
