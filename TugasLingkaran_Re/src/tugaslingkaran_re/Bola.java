/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Bola extends Lingkaran implements Runnable{
    public double luasBola;
    public double volumeBola;
    public double jariMT;
    
    public Bola(double jariMT)
    {
        this.jariMT = jariMT;
    }
    
    public void hitungLuasBola(){
        luasBola = 4*super.hitungLuasLingkaran();
    }
    
    public double getLuasBola(){
        return this.luasBola;
    }
    
    public void hitungVolumeBola(){
        volumeBola = 4*(super.hitungLuasLingkaran()*jariMT)/3;
    }
    
    public double getVolumeBola(){
        return this.volumeBola;
    }
    
    @Override
    public void run(){
        setJari(jariMT);
        luas();
        keliling();
        hitungLuasBola();
        hitungVolumeBola();
        FileStream insertfile = new FileStream();
        insertfile.InsertBola(jariMT, getVolumeBola(), getLuasBola());
    }
}
