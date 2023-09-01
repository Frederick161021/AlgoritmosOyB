package String;
import javax.swing.JOptionPane;

public class Tarea_3 {
    static Nombres Nombre[],nombres;
    static int nNombres;
    static String v = "AEIOUaeiou",NombresC = "";
    
    public static void nNombres(){
        nNombres = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos nombres va a agreagar:"));
        Nombre = new Nombres [nNombres];
        String nombre, apellido;
        for (int i = 0; i < nNombres; i++) {
            nombre = JOptionPane.showInputDialog("Digite el  Primer nombre: ");
            apellido = JOptionPane.showInputDialog("Digite el  Primer apellido: ");
            Nombre[i] = nombres = new Nombres(nombre, apellido);
        }
        
        String aux = "";
        for (int i = 0; i < nNombres; i++) {
            aux += Nombre[i].getNombreCompleto()+"\n";
        }
        JOptionPane.showMessageDialog(null,aux);
    }
    
    public static void iVocal(){
        String aux = "";
        NombresC = "";
        boolean esVocal = false;
        for (int i = 0; i < nNombres; i++) {
            esVocal = false;
            for (int j = 0; j < v.length(); j++) {
                if (Nombre[i].getNombre().startsWith(String.valueOf(v.charAt(j)))) {
                    aux += Nombre[i].getNombreCompleto()+"\n";
                    esVocal = true;
                }
            }
            if (!esVocal) {
                NombresC += Nombre[i].getNombreCompleto()+"\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Los nombres que inician con vocales son: "+aux);
    }
    
    public static void mismoApellido(){
        String aux = "";
        String bApellido = JOptionPane.showInputDialog("Digite el apellido que quiere buscar: ");
        for (int i = 0; i < nNombres; i++) {
            if (Nombre[i].getApellido().equalsIgnoreCase(bApellido)) {
                aux += Nombre[i].getNombreCompleto()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Los nombres con el  apellido "+bApellido+" son:\n"+aux);
    } 
    
    public static void mismoNombre(){
        String aux = "";
        String bNombre = JOptionPane.showInputDialog("Digite el nombre que quiere buscar: ");
        for (int i = 0; i < nNombres; i++) {
            if (Nombre[i].getNombre().equalsIgnoreCase(bNombre)) {
                aux += Nombre[i].getNombreCompleto()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Los nombres con el  nombre "+bNombre+" son:\n"+aux);
    } 
    
    public static void Vocales(){
        int nV = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas vocales como minimo debe tener: "));
        int nVocales;
        String aux = "";
        for (int i = 0; i < nNombres; i++) {
            nVocales = 0;
            for (int j = 0; j < Nombre[i].getNombreCompleto().length(); j++) {
                for (int k = 0; k < v.length(); k++) {
                    if (Nombre[i].getNombreCompleto().charAt(j) == v.charAt(k)) {
                        nVocales++;
                    }
                }
            }
            if (nVocales >= nV) {
                aux += Nombre[i].getNombreCompleto()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Nombres con más o igual de "+nV+" vocales son:\n"+aux);
    }
    
    public static void StringC(){
        String aux = "";
        String C = JOptionPane.showInputDialog("Digite el String que quiere buscar: ");
        for (int i = 0; i < nNombres; i++) {
            if (Nombre[i].getApellido().equalsIgnoreCase(C)) {
                aux += Nombre[i].getNombreCompleto()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Los nombres con el  apellido "+C+" son:\n"+aux);
    } 
    
    public static void Menu(){
        try{
            int seleccion = 0;
            do{
                String menu = "----------------------------------------Menu----------------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Nuevos Nombres\n2.- Numero de nombres\n3.- Imprimir nombres que inicien con vocal\n"
                + "4.- Imprimir nombres que inicien con consonante\n5.- Imprimir nombres con el mismo apelldio\n"
                + "6.- Imprimir nombres con el mismo nombre\n7.- Vocales\n8.- Imprimir c\n9.- Salir del sistema";
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(seleccion){
                case 1:nNombres();break;
                case 2:JOptionPane.showMessageDialog(null, "El numero de nombres del arreglo es de: "+nNombres);break;
                case 3:iVocal();break;
                case 4:JOptionPane.showMessageDialog(null, "Los nombres que inician con consonante son:\n"+NombresC);break;
                case 5:mismoApellido();break;
                case 6:mismoNombre();break;
                case 7:Vocales();break;
                case 8:StringC();break;
                case 9:System.exit(0);break;
            }
            }while(seleccion != 9);
        }catch(Exception e){
            Menu();
        }
    }
    
    public static void main(String[] args) {
        Menu();
    }
    
}
