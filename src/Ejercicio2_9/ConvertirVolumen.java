package Ejercicio2_9;

public class ConvertirVolumen {
    double litros;
    double galon = 4.41;
    double pinta =0.46;
    double barril =158.99;
    double Metros_cubicos=1000;
    double hectrolitros=100;
    // constructores

    public ConvertirVolumen(double litros) {
        this.litros = litros;
    }

    public double ConversoAGalones() {
        double galones;
        galones=galon*litros;
        return galones;
    }
    public  double ConversoAPinta(){
        double pintas;
        pintas=pinta*litros;
        return pintas;
    }
    public  double ConversoABarril(){
        double barriles;
        barriles=barril*litros;
        return barriles;
    }
    public double ConversoAMetros_cubicos(){
        double metros_cubicos;
        metros_cubicos=Metros_cubicos*litros;
        return metros_cubicos;
    }
    public double ConversoAHectrolitros(){
        double Hectrolitro;
        Hectrolitro=hectrolitros*litros;
        return Hectrolitro;
    }

}
