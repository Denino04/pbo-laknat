/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslingkaran_re;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileStream {
    public void InsertBola(double jari, double volumebola, double permukaanbola){
    try {
        try (RandomAccessFile filestream = new RandomAccessFile("DataBola.txt", "rw")) {
            filestream.seek(filestream.length());
            filestream.writeChars("Jari - Jari \t\t\t\t= "+jari);
            filestream.writeChars("\n\n\n\nVolume Bola \t\t\t\t= "+volumebola);
            filestream.writeChars("\n\n\n\nLuas Permukaan Bola \t\t= "+permukaanbola);
            filestream.writeChars("\n\n\n\n\n\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void InsertCincin(double luasCincin, double volumeCincin){
    try {
        try (RandomAccessFile filestream = new RandomAccessFile("DataCincin.txt", "rw")) {
            filestream.seek(filestream.length());
            filestream.writeChars("\n\n\n\nVolume Cincin \t\t\t\t= "+volumeCincin);
            filestream.writeChars("\n\n\n\nLuas Cincin \t\t= "+luasCincin);
            filestream.writeChars("\n\n\n\n\n\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void InsertJuring(double luasJuring, double volumeJuring){
    try {
        try (RandomAccessFile filestream = new RandomAccessFile("DataJuring.txt", "rw")) {
            filestream.seek(filestream.length());
            filestream.writeChars("\n\n\n\nVolume Juring \t\t\t\t= "+volumeJuring);
            filestream.writeChars("\n\n\n\nLuas Juring \t\t= "+luasJuring);
            filestream.writeChars("\n\n\n\n\n\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void InsertKeratan(double luasKeratan, double volumeKeratan){
    try {
        try (RandomAccessFile filestream = new RandomAccessFile("DataKeratan.txt", "rw")) {
            filestream.seek(filestream.length());
            filestream.writeChars("\n\n\n\nVolume Keratan \t\t\t\t= "+volumeKeratan);
            filestream.writeChars("\n\n\n\nLuas Keratan \t\t= "+luasKeratan);
            filestream.writeChars("\n\n\n\n\n\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void InsertTembereng(double luasTembereng, double volumeTembereng){
    try {
        try (RandomAccessFile filestream = new RandomAccessFile("DatatTembereng.txt", "rw")) {
            filestream.seek(filestream.length());
            filestream.writeChars("\n\n\n\nVolume Tembereng \t\t\t\t= "+volumeTembereng);
            filestream.writeChars("\n\n\n\nLuas Tembereng \t\t= "+luasTembereng);
            filestream.writeChars("\n\n\n\n\n\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
