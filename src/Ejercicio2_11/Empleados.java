package Ejercicio2_11;

public class Empleados {
    String nombre;
    String [] apellidos = new String[2];
    int edad,id;

    public Empleados(int id,String nombre, String[]apellidos,int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void impEmpleados(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("Edad: "+edad);
    }

}
