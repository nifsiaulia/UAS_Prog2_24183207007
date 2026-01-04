/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class User_Mahasiswa extends User {
    private String Jurusan;
    private String Npm;
    private int Semester

    // static variable
    public static int totalMahasiswa = 0;

    public User_Mahasiswa() {}

    public User_Mahasiswa(String Npm, String Nama, String Jurusan) {
        super(Nama);
        this.Jurusan = Jurusan;
        this.Npm = Npm;
        totalMahasiswa++;
    }

    public String getJurusan() {
        return Jurusan;
    }
    public String getNpm(){
        return Npm;
    }
    public int getSemester(){
        return Semester;
    }
    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
    public void setNpm(String Npm){
        this.Npm = Npm;
    }
    public void setSemester(int Semester){
        this.Semester=Semester;
    }
    @Override
    public void tampilInfo() {
        System.out.println("NPM: " + Npm);
        System.out.println("Nama: " + Nama);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Semester: "+ Semester);
    }
}

