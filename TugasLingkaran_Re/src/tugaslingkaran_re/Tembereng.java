/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class Tembereng extends Bola{
    private double TT;
    public double LuasTembereng;
    public double VolTembereng;
    Lingkaran Lingkaran = new Lingkaran();

    public Tembereng(double jariMT) {
        super(jariMT);
    }
    
    public double GetTT()
    {
        return TT;
    }
    
    public void SetTT(double TT)
    {
        this.TT = TT;
    }
    
    public void HitungLuastembereng()
    {
        Lingkaran.keliling();
        LuasTembereng = super.hitungKelilingLingkaran()*this.TT;
    }
    
    public double getLuasTembereng(){
        return this.LuasTembereng;
    }
    
    public void HitungVolTembereng()
    {
        VolTembereng = ((3*jariMT*TT)*Bola.PI*TT*TT)/3;
    }
    
    public double getVolTembereng(){
        return this.VolTembereng;
    }
    
    @Override
    public void run(){
        keliling();
        luas();
        HitungLuastembereng();
        HitungVolTembereng();
        FileStream insertfile = new FileStream();
        insertfile.InsertTembereng(getLuasTembereng(), getVolTembereng());
    }
}
