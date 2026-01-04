/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class User_Dosen extends User {
    private String Nid;
    private String ProgramKeahlian;

    // static variable
    public static int totalDosen = 0;

    public User_Dosen() {}

    public User_Dosen (String Nid, String Nama, String ProgramKeahlian) {
        super(Nama);
        this.ProgramKeahlian = ProgramKeahlian;
        this.Nid = Nid;
        totalDosen++;
    }

    public String getProgramKeahlian() {
        return ProgramKeahlian;
    }
    public String getNid(){
        return Nid;
    }

    public void setProgramKeahlian(String ProgramKeahlian) {
        this.ProgramKeahlian = ProgramKeahlian;
    }
    public void setNid(String Nid){
        this.nid = Nid;
    }

    @Override
    public void tampilInfo() {
        System.out.println("NID: " + Nid);
        System.out.println("Nama: " + getNama());
        System.out.println("Program Keahlian: " + ProgramKeahlian);
    }
}    


