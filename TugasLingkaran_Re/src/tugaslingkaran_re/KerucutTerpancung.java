 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

/**
 *
 * @author ASUS ROG
 */
public class KerucutTerpancung extends Kerucut{
    public double r1=jariMT-2;
    public double t1;
    public double VolTerpancung;

    public KerucutTerpancung(double jariMT) {
        super(jariMT);
    }
    
    public double Gett1()
    {
        return t1;
    }
    
    public void sett1(double t1)
    {
        this.t1 = t1;
    }
        
    public double hitungVolKerucutTerpancung() {
        double kerucutKecil = volkerucut = 0.333*r1*r1*Bola.PI*t1;;
        double kerucutBesar = super.getVolumeKerucut();
        VolTerpancung = (float) (kerucutBesar - kerucutKecil);
        return VolTerpancung;
    }
    
    @Override
    public void run() {
        luas();
        hitungLuasKerucut();
        hitungVolumeKerucut();
        Database insertdb = new Database();
        insertdb.InsertTerpancung(getVolumeKerucut());
    }
}
