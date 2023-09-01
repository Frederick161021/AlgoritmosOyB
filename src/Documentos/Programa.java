/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
package Documentos;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Programa {

    public void Personas() {
        Set<Persona> cjsp = new HashSet<Persona>();
        Set<Persona> cjssp = new TreeSet<Persona>();
        Set<Persona> con2 = new LinkedHashSet<Persona>();

        Persona p = new Persona(1, "Marta", 165, 20);

        cjsp.add(p);

        cjssp.add(p);
        con2.add(p);
        Persona p5 = new Persona(5, "Marta", 164, 20);

        cjsp.add(p5);

        cjssp.add(p5);
        con2.add(p5);

        Persona p1 = new Persona(4, "Juan", 178, 19);

        cjsp.add(p1);

        cjssp.add(p1);
        con2.add(p1);
        p1 = new Persona(2, "Elena", 155, 23);

        cjsp.add(p1);

        cjssp.add(p1);
        con2.add(p1);
        p1 = new Persona(3, "Mar�a", 170, 19);

        cjsp.add(p1);

        cjssp.add(p1);
        con2.add(p1);

        cjsp.add(p1);

        cjssp.add(p1);
        con2.add(p1);

        System.out.println("Personas en el conjunto: " + cjsp);

        System.out.println("Personas en el conjunto ordenado: " + cjssp);

        System.out.println("Personas en el conjunto LinkedHashset: " + con2);

        System.out.println("Compare to: " + p.compareTo(p5));

        System.out.println("Comparar nombres: " + p.nombreCompareTo(p5));

        System.out.println("Equals: " + p.equals(p5));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Alumnos> BaseDatos = new HashSet<Alumnos>();
        Set<Alumnos> Algoritmos = new TreeSet<Alumnos>();
        Set<Alumnos> Circuitos = new LinkedHashSet<Alumnos>();
        Set<Alumnos> Conjunto4 = new TreeSet<Alumnos>();
        Set<Alumnos> Interseccion = new TreeSet<Alumnos>();
        Set<Alumnos> aux = new TreeSet<Alumnos>();

        Alumnos a = new Alumnos(18, 45871, "Erick", "Sistemas Computacionales", "Algoritmos de Ordenamiento", 100, 4, 170);
        Algoritmos.add(a);
        Alumnos a1 = new Alumnos(19, 83124, "Gabriela", "Sistemas Computacionales", "Algoritmos de Ordenamiento", 100, 4, 150);
        Algoritmos.add(a1);
        Alumnos a2 = new Alumnos(20, 89865, "Gabo", "Sistemas Computacionales", "Algoritmos de Ordenamiento", 100, 4, 170);
        Algoritmos.add(a2);

        Alumnos a3 = new Alumnos(18, 45871, "Erick", "Sistemas Computacionales", "Base de Datos", 80, 4, 170);
        BaseDatos.add(a3);
        Alumnos a4 = new Alumnos(19, 78857, "Mariana", "Sistemas Computacionales", "Base de Datos", 95, 4, 178);
        BaseDatos.add(a4);
        Alumnos a5 = new Alumnos(21, 14845, "Sergio", "Sistemas Computacionales", "Base de Datos", 100, 4, 180);
        BaseDatos.add(a5);

        Alumnos a6 = new Alumnos(20, 89865, "Gabo", "Sistemas Computacionales", "Algoritmos de Ordenamiento", 85, 4, 170);
        Circuitos.add(a6);
        Alumnos a7 = new Alumnos(19, 78857, "Mariana", "Sistemas Computacionales", "Base de Datos", 90, 4, 178);
        Circuitos.add(a7);
        Alumnos a8 = new Alumnos(21, 14845, "Sergio", "Sistemas Computacionales", "Base de Datos", 95, 4, 180);
        Circuitos.add(a8);
        
        Conjunto4.add(a);
        Conjunto4.add(a1);
        Conjunto4.add(a2);
        Conjunto4.add(a3);
        Conjunto4.add(a4);
        Conjunto4.add(a5);
        
        Interseccion.add(a);
        Interseccion.add(a3);

        System.out.println("Conjunto1:");
        System.out.println(Algoritmos);
        System.out.println("Conjunto2:");
        System.out.println(BaseDatos);
        System.out.println("Conjunto3:");
        System.out.println(Circuitos);
        System.out.println("Union de conjunto 1 y 2:");
        System.out.println(Conjunto4);
        System.out.println("Interseccion de conjunto 1 y 2:");
        System.out.println(Interseccion);
        System.out.println("Digite un nombre del conjunto 1:");
        String nombre = s.next();
        System.out.println("Los elementos del primer conjutno antes de "+nombre+" son:");
        if (a2.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a);
            aux.add(a1);
        }
        if (a1.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a);
        }
        System.out.println(aux);
        aux.clear();
        System.out.println("Los elementos del primer conjutno despues de "+nombre+" son:");
        if (a.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a1);
            aux.add(a2);
        }
        if (a1.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a2);
        }
        System.out.println(aux);
        aux.clear();
        System.out.println("Digite una vocal que quiere bucar si inicia uno de los alumnos del conjunto 2:");
        char vocal = s.next().toUpperCase().charAt(0);
        if (a3.nombre.charAt(0) == vocal) {
            aux.add(a3);
        }
        if (a4.nombre.charAt(0) == vocal) {
            aux.add(a4);
        }
        if (a5.nombre.charAt(0) == vocal) {
            aux.add(a5);
        }
        System.out.println("Los alumnos que su nombre inicia con la vocal "+vocal+ " son:\n"+aux);
        aux.clear();
        System.out.println("Digite un nombre del conjunto 2:");
        nombre = s.next();
        System.out.println("Los elementos del segundo conjutno antes de "+nombre+" son:");
        if (a3.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a5);
            aux.add(a4);
        }
        if (a5.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a4);
        }
        System.out.println(aux);
        aux.clear();
        System.out.println("Los elementos del segundo conjutno despues de "+nombre+" son:");
        if (a4.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a3);
            aux.add(a5);
        }
        if (a3.nombre.equalsIgnoreCase(nombre)) {
            aux.add(a3);
        }
        System.out.println(aux);
        aux.clear();
        System.out.println("El primer Alumno del conjunto 1:\n"+a);
        System.out.println("El ultimo Alumno del conjunto 1:\n"+a2);
        System.out.println("El primer Alumno del conjunto 2:\n"+a4);
        System.out.println("El ultimo Alumno del conjunto 2:\n"+a3);
    }

}
