package Praktikum2;

public class OperasiTitik {
    private float absis;
    private float ordinat;
    private int counterTitik = 0;

    public OperasiTitik(){
        counterTitik++;
    }

    public OperasiTitik(float a, float o){
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

    public float refleksiX(OperasiTitik t){
        return refleksiSumbuX(t);
    }

    public float refleksiY(OperasiTitik t){
        return refleksiSumbuY(t);
    }

    private float refleksiSumbuX(OperasiTitik Titik){
        return Titik.absis = absis - (absis * 2);
    }

    private float refleksiSumbuY(OperasiTitik Titik){
        return Titik.ordinat = ordinat - (ordinat * 2);
    }
    
}