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
    private int Semester;

    private Matakuliah matakuliah;
    private Nilai nilai;
    // static variable
    public static int totalMahasiswa = 0;

    public User_Mahasiswa() {}

    public User_Mahasiswa(String Npm, String Nama, String Jurusan, int Semester) {
        this.Jurusan = Jurusan;
        this.Npm = Npm;
        this.Semester = Semester;
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
    //public Matakuliah getmatakuliah(){
      //  return matakuliah;
    //}
    //public Nilai getnilai(){
     //   return nilai;
    //}
    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
    public void setNpm(String Npm){
        this.Npm = Npm;
    }
    public void setSemester(int Semester){
        this.Semester=Semester;
    }
   // public void setMatakuliah(Matakuliah matakuliah){
      //  this.matakuliah=matakuliah;
    //}
   // public void setNilai (Nilai nilai){
     //   this.nilai=nilai;
    //}

    @Override
    public void tampilInfo() {
        System.out.println("NPM: " + Npm);
        System.out.println("Nama: " + Nama);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Semester: "+Semester);
        
        //if(matakuliah !=null){
          //  matakuliah.tampilMk();
          //System.out.println(KodeMk + " - " + NamaMk + " (" + Sks + " SKS)");

        //}
       // if (nilai !=null){
          //  System.out.println("Nilai Akhir: "+ nilai.hitungNilaiAkhir());
           // System.out.println("Grade: "+nilai.grade());
           // nilai.tampilnilai();
       // }
    }
}
