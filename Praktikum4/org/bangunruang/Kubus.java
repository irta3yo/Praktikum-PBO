package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        //implementasi
        return this.permukaan.getPanjangSisi() * this.permukaan.getPanjangSisi();
    }

    public double hitungVolume(){
        //implementasi
        return this.permukaan.getPanjangSisi() * this.permukaan.getPanjangSisi() * this.permukaan.getPanjangSisi();
    }
}