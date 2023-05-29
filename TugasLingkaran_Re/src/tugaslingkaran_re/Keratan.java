/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Keratan extends Bola implements Runnable{
    private double TK;
    private double RK1=jariMT-1;
    private double RK2=jariMT+1;
    public double LuasKeratan;
    public double VolKeratan;

    public Keratan(double jariMT) {
        super(jariMT);
    }
    
    public double getTK()
    {
        return TK;
    }
    
    public void setTK(double TK)
    {
        this.TK = TK;
    }
    
    public void HitungLuasKeratan()
    {
        LuasKeratan = super.hitungKelilingLingkaran()*this.TK;
    }
    
    public double getLuasKeratan(){
        return this.LuasKeratan;
    }
    
    public void HitungVolKeratan()
    {
        VolKeratan = (1/2*Bola.PI*RK1*RK1)+(1/2*Bola.PI*RK2*RK2)+(1/6*Bola.PI*TK*TK*TK);
    }
    
    public double getVolKeratan(){
        return this.VolKeratan;
    }
    
    @Override
    public void run(){
        keliling();
        luas();
        HitungLuasKeratan();
        HitungVolKeratan();
        FileStream insertfile = new FileStream();
        insertfile.InsertKeratan(getLuasKeratan(), getVolKeratan());
    }
    
}
