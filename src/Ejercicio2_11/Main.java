package Ejercicio2_11;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {"Fisica","Espacio","Tiempo"};
        ArticuloCientifico art1 = new ArticuloCientifico("La teoria espacial de la relatividad","Albert Einstein",palabras,"Anales de fisica",1913,"Las leyes de la fisica son las mismas en todos los sistemas de referencia inerciales.");
        art1.imprimir();
        System.out.println("---------------------------------");
        String[] apellidos = {"Nuevo Empleado","Nuevo Empleado"};
        Empleados emp1 = new Empleados(100,"Nuevo Empleado",apellidos,18);
        emp1.impEmpleados();
    }

}
