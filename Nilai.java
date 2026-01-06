/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class Nilai implements Penilaian {//aturan nyatanya/perhitungannya
    private double Tugas;
    private double Uts;
    private double Uas;

    public Nilai() {}

    public Nilai(double Tugas, double Uts, double Uas) {
        this.Tugas = Tugas;
        this.Uts = Uts;
        this.Uas = Uas;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (Tugas * 0.3) + (Uts * 0.3) + (Uas * 0.4);
    }

    @Override
    public String grade() {
        double nilai = hitungNilaiAkhir();
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B";
        else if (nilai >= 65) return "C";
        else return "D";
    }
     public void tampilnilai(){
     
     }
            
}

