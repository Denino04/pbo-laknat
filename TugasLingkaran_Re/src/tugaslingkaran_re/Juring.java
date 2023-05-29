/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Juring extends Bola implements Runnable{
    private double TJ;
    private double rJ=jariMT+1;
    public double LuasJuring;
    public double VolJuring;

    public Juring(double jariMT) {
        super(jariMT);
    }
    
    public double getTJ()
    {
        return TJ;
    }
    
    public void SetTJ(double TJ)
    {
        this.TJ = TJ;
    }
    
    public void HitungLuasJuring()
    {
        LuasJuring = super.hitungKelilingLingkaran()*this.TJ + (super.hitungKelilingLingkaran()*this.rJ)/2;
    }
    
    public double getLuasJuring(){
        return this.LuasJuring;
    }
    
    public void HitungVolJuring()
    {
        VolJuring = 2*super.hitungLuasLingkaran()*this.TJ/3;
    }
    
    public double getVolJuring(){
        return this.VolJuring;
    }
    
    @Override
    public void run(){
        keliling();
        luas();
        HitungLuasJuring();
        HitungVolJuring();
        FileStream insertfile = new FileStream();
        insertfile.InsertJuring(getLuasJuring(), getVolJuring());
    }
}
