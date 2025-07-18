// Clase Estudiante con atributos privados y métodos getter/setter
public class Estudiante {
    // Atributos privados
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    //  Metodo Constructor
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Métodos getter
    public String getNombre() { return nombre; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    // Métodos setter
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    public void setNota3(double nota3) { this.nota3 = nota3; }

}

