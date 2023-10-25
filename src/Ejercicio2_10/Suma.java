package Ejercicio2_10;

public class Suma {
    int suma1,suma2;
    double sumado1,sumdao2,sumado3,total;

    public Suma() {

    }

    public double getSumado1() {
        return sumado1;
    }

    public void setSumado1(double sumado1) {
        this.sumado1 = sumado1;
    }

    public double getSumdao2() {
        return sumdao2;
    }

    public void setSumdao2(double sumdao2) {
        this.sumdao2 = sumdao2;
    }

    public double getSumado3() {
        return sumado3;
    }

    public void setSumado3(double sumado3) {
        this.sumado3 = sumado3;
    }

    public Suma(int suma1, int suma2, double sumado1, double sumdao2, double sumado3) {
        this.suma1 = suma1;
        this.suma2 = suma2;
        this.sumado1 = sumado1;
        this.sumdao2 = sumdao2;
        this.sumado3 = sumado3;
    }

    public void calcularSuma(int suma1, int suma2){
        total=suma1+suma2;
        System.out.println("La suma de los enteros es: "+ total);
    }
    public void calcularSuma(double sumado1,double sumado2){
        total=sumado1+sumado2;
        System.out.println("La suma de los dos valores es: "+total);
    }
    public void calcularSuma(double sumado1,double sumado2, double sumado3){
        total=sumado1+sumado2+sumado3;
        System.out.println("La suma de los tres valores es: "+total);
    }
}
