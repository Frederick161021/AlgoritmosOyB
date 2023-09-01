package Documentos;
import java.util.Objects;

public class Alumnos implements Comparable<Alumnos> {

    private int edad;
    private int matricula;
    public String nombre;
    private String carrera;
    private String materia;
    private int calif;
    private int semestre;
    

    public Alumnos(int edad, int matricula, String nombre, String carrera, String materia, int calificaion, int semestre, int altura) {
        this.edad = edad;
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.materia = materia;
        this.calif = calificaion;
        this.semestre = semestre;
    }
    @Override
    public String toString() {
        return "Alumno-> Edad: " + edad + " Matricula: " + matricula
                                 + " Nombre: " + nombre + "Carrera: " + carrera
                                 + "Materia: " + materia + "Calificacion: " + calif + "Semestre: " + semestre + "\n";
    }

    @Override
    public int compareTo(Alumnos o) {
        return this.matricula- o.matricula;
    }

    @Override
    public int hashCode() {
        return edad + nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (this.nombre != other.nombre) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        return true;
    }
}

