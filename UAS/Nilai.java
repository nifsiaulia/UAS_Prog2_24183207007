/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class Nilai implements Penilaian {//aturan nyatanya/perhitungannya
    private double tugas;
    private double uts;
    private double uas;

    public Nilai() {}

    public Nilai(double tugas, double uts, double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    @Override
    public String grade() {
        double nilai = hitungNilaiAkhir();
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B";
        else if (nilai >= 65) return "C";
        else return "D";
    }
}

