/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author nifsi
 */
public class Mainclass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        int pilih;
        do {
            System.out.println("=== MENU SIAKAD MINI ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih==1){
                User_Mahasiswa Mhs= new User_Mahasiswa();//CONSTRUCTOR DEFAULT + SETTER
                System.out.print("NPM: ");
                Mhs.setNpm(input.nextLine());
                System.out.print("Nama: ");
                Mhs.setNama(input.nextLine());
                System.out.print("Peogram Jurusan: ");
                Mhs.setJurusan(input.nextLine());
                System.out.print("Semester: ");
                Mhs.setSemester(input.nextInt());
                
                users.add(Mhs);
            }
        else if (pilih==2){
                System.out.print("NID: ");//CONSTRUCTOR PARAMETER
                String nidDsn = input.nextLine();
                System.out.print("Nama Dosen: ");
                String namaDsn= input.nextLine();
                System.out.print("Program Keahlian: ");
                String ahl = input.nextLine();
                
                User Dsn= new User_Dosen(nidDsn,namaDsn,ahl);
                users.add(Dsn);
            }
            else if (pilih==3){

                System.out.print("Kode MK: ");
                String kode = input.nextLine();
                System.out.print("Nama MK: ");
                String namaMk = input.nextLine();
                System.out.print("SKS: ");
                int sks = input.nextInt();
                input.nextLine();

                Matakuliah mk = new Matakuliah(Kode, NamaMk, Sks);
                mk.tampilMk();
            }
            else if (pilih==4){
                System.out.print("Nilai Tugas: ");
                double t = input.nextDouble();
                System.out.print("Nilai UTS: ");
                double uts = input.nextDouble();
                System.out.print("Nilai UAS: ");
                double uas = input.nextDouble();

                Nilai nilai = new Nilai(t, uts, uas);
                System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
                System.out.println("Grade: " + nilai.grade());
            }

            else if (pilih==5){
                for (User u : users) {
                    u.tampilInfo(); // polymorphisme=satu variabel bertipe class induk dapat menampung berbagai objek dari class turunannya.
                    System.out.println("----------------");
                    }
            }
              else if (pilih == 0) {
                System.out.println("Keluar dari program.");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}



    


