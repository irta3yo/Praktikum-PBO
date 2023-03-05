package Titik;

public class Titik {
    float absis;
    float ordinat;
    static int counterTitik = 0;

    public Titik(){
        counterTitik++;
    }

    public Titik(float a, float o){
        counterTitik++;
        absis = a;
        ordinat = o;
    }

    public float setAbsis(float absis){
        return this.absis = absis;
    }

    public float setOrdinat(float ordinat){
        return this.ordinat = ordinat;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }
}