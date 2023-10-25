package Ejercicio2_11;

public class ArticuloCientifico {
    String resumen, titulo, autor, publicacion;
    String[] palabrasClaves = new String[3];
    int ano;

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String[] getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(String[] palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArticuloCientifico(String titulo,String autor,String[]palabrasClaves,String publicacion, int ano ,String resumen) {
        this.resumen = resumen;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.palabrasClaves = palabrasClaves;
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("Titulo del articulo: "+ titulo);
        System.out.println("Autor del articulo: "+autor);
        System.out.println("Palabras clave: ");
        for (int i=0;i<palabrasClaves.length;i++){
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicacion: "+ publicacion);
        System.out.println("Año: "+ano);
        System.out.println("Resumen: "+ resumen);
    }
}
