/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
package Documentos;
import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private int idPersona, altura, edad;
    private String nombre;
    
    public Persona(int idPersona, String nombre, int altura, int edad) {
        this.idPersona = idPersona;   this.nombre = nombre;    this.altura = altura; this.edad = edad;}

    @Override
    public String toString() { return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+" Edad: "+edad+"\n";  }

    @Override
    public int compareTo(Persona o) { return this.edad-o.edad; }
    
    public boolean nombreCompareTo(Persona o) { return this.nombre.equalsIgnoreCase(o.nombre); }

    @Override
    public int hashCode() { return altura + nombre.hashCode() + idPersona; }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {   return false;  }
        if (getClass() != obj.getClass()) {  return false;   }
        final Persona other = (Persona) obj;
        if (this.idPersona != other.idPersona) {  return false;    }
        if (!this.nombre.equalsIgnoreCase(other.nombre)) { return false; }
        if (!Objects.equals(this.nombre, other.nombre)) {    return false;     }
        if (this.altura != other.altura) {     return false;   }
        return true;
    }
}