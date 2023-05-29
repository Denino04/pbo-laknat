/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Cincin extends Bola implements Runnable{
    public double TC;
    public double RC1 = jariMT-1;
    public double RC2 = jariMT+1;
    public double KC=RC1+RC2;
    public double LuasCincin;
    public double VolCincin;

    public Cincin(double jariMT) {
        super(jariMT);
    }
        
    public double getTC()
    {
        return TC;
    }
    
    public void setTC(double TC){
        this.TC = TC;
    }
    
    
    public void HitungLuasCincin()
    {
        LuasCincin = super.hitungLuasLingkaran()*this.TC + Bola.PI*KC*(RC1+RC2);
    }
    
    public double getLuasCincin(){
        return this.LuasCincin;
    }
    
    public void HitungVolCincin()
    {
        VolCincin = (Bola.PI*KC*KC*TC)/6;
    }
    
    public double GetVolumeCincin(){
        return this.VolCincin;
    }
    
    @Override
    public void run(){
        keliling();
        luas();
        HitungLuasCincin();
        HitungVolCincin();
        FileStream insertfile = new FileStream();
        insertfile.InsertCincin(getLuasCincin(), GetVolumeCincin());
    }
    
}
