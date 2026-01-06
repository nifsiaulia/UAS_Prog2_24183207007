/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class Matakuliah {
    private String KodeMk; 
    private String NamaMk; 
    private int Sks; 

    // default constructor
    public Matakuliah() {}

    // constructor parameter
    public Matakuliah(String KodeMk, String NamaMk, int Sks) {
        this.KodeMk = KodeMk;
        this.NamaMk = NamaMk;
        this.Sks = Sks;
    }

    // getter & setter
    public String getKodeMk() {
        return KodeMk;
    }

    public void setKodeMk(String KodeMk) {
        this.KodeMk = KodeMk;
    }

    public String getNamaMk() {
        return NamaMk;
    }

    public void setNamaMk(String NamaMk) {
        this.NamaMk = NamaMk;
    }

    public int getSks() {
        return Sks;
    }

    public void setSks(int Sks) {
        this.Sks = Sks;
    }

    // method void
    public void tampilMk(){
        System.out.println(KodeMk + " - " + NamaMk + " (" + Sks + " SKS)");
    }
}