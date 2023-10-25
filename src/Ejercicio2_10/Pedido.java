package Ejercicio2_10;

public class Pedido {
    String primerPlato,bebida,segundoPlato;
    double costoPrimerplato,costoBebida,costoSegundoPlato,total;

    public Pedido() {

    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public double getCostoPrimerplato() {
        return costoPrimerplato;
    }

    public void setCostoPrimerplato(double costoPrimerplato) {
        this.costoPrimerplato = costoPrimerplato;
    }

    public double getCostoBebida() {
        return costoBebida;
    }

    public void setCostoBebida(double costoBebida) {
        this.costoBebida = costoBebida;
    }

    public double getCostoSegundoPlato() {
        return costoSegundoPlato;
    }

    public void setCostoSegundoPlato(double costoSegundoPlato) {
        this.costoSegundoPlato = costoSegundoPlato;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pedido(String primerPlato, String bebida, String segundoPlato, double costoPrimerplato, double costoBebida, double costoSegundoPlato, double total) {
        this.primerPlato = primerPlato;
        this.bebida = bebida;
        this.segundoPlato = segundoPlato;
        this.costoPrimerplato = costoPrimerplato;
        this.costoBebida = costoBebida;
        this.costoSegundoPlato = costoSegundoPlato;
        this.total = total;
    }

    public void calcularPedido(String primerPlato, double costoPrimerPLato, String bebida, double costoBebida) {
        double total = costoPrimerPLato + costoBebida;
        System.out.println("El costo de " + primerPlato + " y " + bebida + " es: " + total );
    }

    public void calcularPedido(String primerPlato, double costoPrimerPLato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida){
        double total = costoPrimerPLato + costoSegundoPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " y " + bebida + " es: " + total );
    }

    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato,String postre,double costoPostre, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " + " + bebida + " y " + postre +" es: "+ total );
    }


}
