/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Lingkaran implements Bangundatar{
    public static final double PI=3.14159265359;
    public double kelilingLingkaran;
    public double luasLingkaran;
    public double r;
    
    public double getJari(){
        return r;
    }
    
    public void setJari(double r){
        this.r = r;
    }
    
    public double hitungKelilingLingkaran(){
    this.kelilingLingkaran = 2*PI*r;
    return kelilingLingkaran;
    }
    
    public double hitungKelilingLingkaran(float r){
//        this.kelilingLingkaran = 2*Pi*r;
        return 2*PI*r;
    }
    
    public double hitungLuasLingkaran(){
        this.luasLingkaran = PI*r*r;
        return luasLingkaran;
    }
    
    public double hitungLuasLingkaran(float r){
//        this.luasLingkaran = PI*r*r;
        return PI*r*r;
    }
    
    @Override
    public double keliling() {
        kelilingLingkaran = 2*PI*r;
        return kelilingLingkaran;
    }

    @Override
    public double luas() {
        luasLingkaran = PI*r*r;
        return luasLingkaran;
    }
}
