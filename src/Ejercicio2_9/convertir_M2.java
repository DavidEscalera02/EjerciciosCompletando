package Ejercicio2_9;

public class convertir_M2 {
    double Metros2;
    double area=100;
    double  hectarea=10000;
    double kilometro=1000000;
    double fanega=6430;
    double acres=4046.86;

    // constructores
    public convertir_M2(double Metros2){
        this.Metros2=Metros2;
    }
    public double ConversorMaA(){
        double Area;
        Area=area*Metros2;
        return Area;
    }
    public double ConversoMaH(){
        double hectareas;
        hectareas=hectarea*Metros2;
        return hectareas;
    }
    public double ConversorMaKM(){
        double Kilometro;
        Kilometro=kilometro*Metros2;
        return Kilometro;
    }
    public double ConversoMaFanegas(){
        double Fanegas;
        Fanegas=fanega*Metros2;
        return Fanegas;
    }
    public double ConversoMaAcres(){
        double Acres;
        Acres=acres*Metros2;
        return Acres;
    }

}
