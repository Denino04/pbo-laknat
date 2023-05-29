/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Kerucut extends Lingkaran implements Runnable{
    public double Tinggi;
    public double Miring;
    public double luasSelimut;
    public double luaskerucut=1;
    public double volkerucut=1;
    public double jariMT;
    
    public Kerucut(double jariMT)
    {
        this.jariMT = jariMT;
    }
    
    public double getTinggi()
    {
        return Tinggi;
    }
    
    public void SetTinggi(double Tinggi)
    {
        this.Tinggi = Tinggi;
    }
    
    public void hitungLuasKerucut()
    {
        Miring = Math.sqrt(Math.pow(jariMT, 2)+Math.pow(Tinggi, 2));
        luasSelimut = Lingkaran.PI*jariMT*Miring;
        luaskerucut = super.hitungLuasLingkaran()+luasSelimut;
    }
    
    public double getLuasKerucut(){
        return this.luaskerucut;
    }
    
    public void hitungVolumeKerucut()
    {
        volkerucut = 0.333*super.hitungLuasLingkaran()*this.Tinggi;
    }
    
    public double getVolumeKerucut(){
        return this.volkerucut;
    }
    
    @Override
    public void run() {
        luas();
        hitungLuasKerucut();
        hitungVolumeKerucut();
        Database insertdb = new Database();
        insertdb.InsertKerucut(getLuasKerucut(), getVolumeKerucut());
    }
}
