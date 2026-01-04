/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public class User_Mahasiswa extends User {
    private String jurusan;
    private String npm;

    // static variable
    public static int totalMahasiswa = 0;

    public User_Mahasiswa() {}

    public User_Mahasiswa(String npm, String nama, String jurusan) {
        super(nama);
        this.jurusan = jurusan;
        this.npm = npm;
        totalMahasiswa++;
    }

    public String getJurusan() {
        return jurusan;
    }
    public String getnpm(){
        return npm;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setnpm(String npm){
        this.npm = npm;
    }

    @Override
    public void tampilInfo() {
        System.out.println("NPM: " + npm);
        System.out.println("Nama: " + getNama());
        System.out.println("Jurusan: " + jurusan);
    }
}
