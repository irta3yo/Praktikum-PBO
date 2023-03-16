package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);

        // print luas dan volume
        System.out.println("luas kubus : " + kubus.hitungLuasAlas());
        System.out.println("volume kubus : " + kubus.hitungVolume());
    }
}