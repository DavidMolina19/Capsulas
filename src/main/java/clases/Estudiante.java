package clases;

public class Estudiante {

    private String nombre;
    private double notaPromedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, double notaPromedio) {
        this.nombre = nombre;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {

        if (notaPromedio>5){
            System.out.println("nota invalida");
        }else{
            this.notaPromedio=notaPromedio;
        }
        this.notaPromedio = notaPromedio;
    }
}
