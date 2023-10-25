package Ejercicio2_9;

public class ConvertirMetros {
    double metros;
    int factorcentimetros = 100;
    int factorMilimetos = 1000;
    double factoPulgadas = 39.37;
    double factorPies = 3.28;
    double factorYardas = 1.09361;

    public ConvertirMetros(double metros) {
        this.metros = metros;
    }
    public double convertidorMaCM() {
        double centimetros;
        centimetros = factorcentimetros * metros;
        return centimetros;
    }

    public double ConvertidorMaMILM() {
        double Milimetros;
        Milimetros = factorMilimetos * metros;
        return Milimetros;
    }

    public double ConvertidorMapulgadas() {
        double pulgadas;
        pulgadas = factoPulgadas * metros;
        return pulgadas;
    }

    public double ConvertidorMaPies() {
        double pies;
        pies = factorPies * metros;
        return pies;
    }

    public double ConvertidorMaYardas() {
        double yardas;
        yardas = factorYardas * metros;
        return yardas;
    }
}


