package com.mycompany.drone;
public class mainDrone {
   public static void main(String[] args) {
        
        Drone api = new Drone ();
        api.energi = 1;
        api.kecepatan = 80;
        api.ketinggian = 0;
        api.merek = "Avicenna";
        api.terbang();
        api.matikanMesin();
        api.turun();
        api.belok();
        api.maju();
        api.mundur();
        
        Drone air = new Drone();
        air.energi = 60;
        air.kecepatan = 90;
        air.ketinggian = 110;
        air.merek = "Aurel";
        air.terbang();
        air.matikanMesin();
        air.turun();
        air.belok();
        air.maju();
        air.mundur();
    }
}