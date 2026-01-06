/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nifsi
 */
public abstract class User {
    // encapsulation
    protected String Nama;

    // constructor default
    public User() {
    }

    // constructor parameter
    public User(String Nama) {
        this.Nama = Nama;
    }
    
    //getter setter
   public String getNama(){
        return Nama;
    }
    public void setNama (String Nama){
        this.Nama=Nama;
    }

    // abstract method
    public abstract void tampilInfo();{
   }
 
}
