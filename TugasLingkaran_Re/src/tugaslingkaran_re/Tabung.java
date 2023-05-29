/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Tabung extends Lingkaran{
    private double Tinggi;
    public double luasTabung;
    public double volTabung;
    
    
    public double getTinggi()
    {
        return Tinggi;
    }
    
    public void SetTinggi(double Tinggi)
    {
        this.Tinggi = Tinggi;
    } 
    
    public double hitungLuasTabung(){   
        this.luasTabung = super.hitungKelilingLingkaran()*Tinggi;
        return luasTabung;
    }
       
    public double hitungVolumeTabung(){
        this.volTabung = super.hitungLuasLingkaran()*Tinggi;
        return volTabung;
    }
    
}
