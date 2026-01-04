/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class User_Dosen extends User {
    private String nid;
    private String ProgramKeahlian;

    // static variable
    public static int totalMahasiswa = 0;

    public User_Dosen() {}

    public User_Dosen (String nid, String nama, String ProgramKeahlian) {
        super(nama);
        this.ProgramKeahlian = ProgramKeahlian;
        this.nid = nid;
        totalMahasiswa++;
    }

    public String getProgramKeahlian() {
        return ProgramKeahlian;
    }
    public String getnid(){
        return nid;
    }

    public void setProgramKeahlian(String ProgramKeahlian) {
        this.ProgramKeahlian = ProgramKeahlian;
    }
    public void setnid(String nid){
        this.nid = nid;
    }

    @Override
    public void tampilInfo() {
        System.out.println("NID: " + nid);
        System.out.println("Nama: " + getNama());
        System.out.println("Program Keahlian: " + ProgramKeahlian);
    }
}    

