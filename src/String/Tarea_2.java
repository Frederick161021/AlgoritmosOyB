package String;
import java.util.Comparator;
import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Tarea_2 {
    private static String texto = null, texto2 = null, root = "", root2 = "", verne = "", clave = "",pig ="",latin = "";
    private static String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", v = "AEIOUaeiou"; 
    private static int letras = 0, vocales =0, consonantes = 0, espacios = 0, digitos = 0, especiales = 0,palabras = 1, codigo = 0, altura = 0;
    private static int Codigo[];
    private static int nPalabras[];
    private static char encriptamiento [][];
    private static LinkedList <Integer> ordenCodigo = new LinkedList<>();
    private static LinkedList <String> Palabras = new LinkedList<>();
    
    private static void Letras(){ 
        letras = 0;
        vocales = 0;
        consonantes = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                letras++;
                Vocales(String.valueOf(texto.charAt(i)));
            }
        }
    }
    
    private static void Vocales(String c){
        String v = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        boolean vocal = false; 
        for (int i = 0; i < v.length(); i++) {
            if (c.contains(String.valueOf(v.charAt(i)))) {
                vocales++;
                vocal = true;
            }
        }
        if (!vocal) {
            consonantes++;
        }
    }
    
    private static void Espacios(){
        espacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                espacios++;
            }
        }
    }
    
    private static void Digitos(){
        digitos = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                digitos++;
            }
        }
    }
    
    private static void CaracteresEspeciales(){
        especiales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isAlphabetic(texto.charAt(i)) && !Character.isDigit(texto.charAt(i)) && !Character.isWhitespace(texto.charAt(i))) {
                especiales++;
            }
        }
    }
    
    private static void Palabras(){
        char anterior = texto.charAt(0);
        for (int i = 1; i < texto.length(); i++) {
            if (!Character.isWhitespace(anterior) && Character.isWhitespace(texto.charAt(i))) {
                palabras++;
            }
            anterior = texto.charAt(i);
        }
    }
    
    private static void String2(){
        try{
            texto2 = "";
            char iPalabra = JOptionPane.showInputDialog("Digite el carcater con el que inicia la pablabra:").charAt(0);
            for (int i = texto.indexOf(iPalabra); i < texto.length(); i++) {
                if (Character.isWhitespace(texto.charAt(i))) {
                    JOptionPane.showMessageDialog(null, "La palabra es :"+texto2);
                    Menu();
                }
                else{
                    texto2 += texto.charAt(i);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Caracter invalido!!");
            Menu();
        }
    }
    
    private static void Root3(){
        root = "";
        String texto3 = texto.toLowerCase();
        for (int i = 0; i < texto3.length(); i++) {
            if (Character.isAlphabetic(texto3.charAt(i))) {
                switch(texto3.charAt(i)){
                    case 'a': root +="d"; break;
                    case 'b': root +="e"; break;
                    case 'c': root +="f"; break;
                    case 'd': root +="g"; break;
                    case 'e': root +="h"; break;
                    case 'f': root +="i"; break;
                    case 'g': root +="j"; break;
                    case 'h': root +="k"; break;
                    case 'i': root +="l"; break;
                    case 'j': root +="m"; break;
                    case 'k': root +="n"; break;
                    case 'l': root +="ñ"; break;
                    case 'm': root +="o"; break;
                    case 'n': root +="p"; break;
                    case 'ñ': root +="q"; break;
                    case 'o': root +="r"; break;
                    case 'p': root +="s"; break;
                    case 'q': root +="t"; break;
                    case 'r': root +="u"; break;
                    case 's': root +="v"; break;
                    case 't': root +="w"; break;
                    case 'u': root +="x"; break;
                    case 'v': root +="y"; break;
                    case 'w': root +="z"; break;
                    case 'x': root +="a"; break;
                    case 'y': root +="b"; break;
                    case 'z': root +="c"; break;
                    case 'á': root +="ó"; break;
                    case 'é': root +="ú"; break;
                    case 'í': root +="á"; break;
                    case 'ó': root +="é"; break;
                    case 'ú': root +="í"; break;   
                }
            }
            else{
            if (Character.isDigit(texto3.charAt(i))) {
                switch(texto3.charAt(i)){
                    case '0':root += 3;break;
                    case '1':root += 4;break;
                    case '2':root += 5;break;
                    case '3':root += 6;break;
                    case '4':root += 7;break;
                    case '5':root += 8;break;
                    case '6':root += 9;break;
                    case '7':root += 0;break;
                    case '8':root += 1;break;
                    case '9':root += 2;break;
            }
            }
            else{
            if (Character.isWhitespace(texto3.charAt(i))) {
                root += "°" ;
            }
            else{
                switch(texto3.charAt(i)){
                    case '¡':root += "$";break;
                    case '!':root += "%";break;
                    case '#':root += "&";break;
                    case '$':root += "/";break;
                    case '%':root += "(";break;
                    case '&':root += ")";break;
                    case '/':root += "=";break;
                    case '(':root += "?";break;
                    case ')':root += "¿";break;
                    case '=':root += "¡";break;
                    case '?':root += "!";break;
                    case '¿':root += "#";break;
                    
                }
            }
            }
            }
        }
    }
    
    private static void DesencriptacionRoot3(){
        root2 ="";
        for (int i = 0; i < root.length(); i++) {
            if (Character.isAlphabetic(root.charAt(i))) {
                switch(root.charAt(i)){
                    case 'd': root2 +="a"; break;
                    case 'e': root2 +="b"; break;
                    case 'f': root2 +="c"; break;
                    case 'g': root2 +="d"; break;
                    case 'h': root2 +="e"; break;
                    case 'i': root2 +="f"; break;
                    case 'j': root2 +="g"; break;
                    case 'k': root2 +="h"; break;
                    case 'l': root2 +="i"; break;
                    case 'm': root2 +="j"; break;
                    case 'n': root2 +="k"; break;
                    case 'ñ': root2 +="l"; break;
                    case 'o': root2 +="m"; break;
                    case 'p': root2 +="n"; break;
                    case 'q': root2 +="ñ"; break;
                    case 'r': root2 +="o"; break;
                    case 's': root2 +="p"; break;
                    case 't': root2 +="q"; break;
                    case 'u': root2 +="r"; break;
                    case 'v': root2 +="s"; break;
                    case 'W': root2 +="t"; break;
                    case 'x': root2 +="u"; break;
                    case 'y': root2 +="v"; break;
                    case 'z': root2 +="w"; break;
                    case 'a': root2 +="x"; break;
                    case 'b': root2 +="y"; break;
                    case 'c': root2 +="z"; break;
                    case 'ó': root2 +="á"; break;
                    case 'ú': root2 +="é"; break;
                    case 'á': root2 +="í"; break;
                    case 'é': root2 +="ó"; break;
                    case 'í': root2 +="ú"; break;   
                }
            }
            else{
            if (Character.isDigit(root.charAt(i))) {
                switch(root.charAt(i)){
                    case '3':root2 += 1;break;
                    case '4':root2 += 2;break;
                    case '5':root2 += 3;break;
                    case '6':root2 += 4;break;
                    case '7':root2 += 5;break;
                    case '8':root2 += 6;break;
                    case '9':root2 += 7;break;
                    case '0':root2 += 8;break;
                    case '1':root2 += 9;break;
                    case '2':root2 += 0;break;
            }
            }
            else{
            if (root.charAt(i) == '°') {
                root2 += " " ;
            }
            else{
                switch(root.charAt(i)){
                    case '$':root2 += "¡";break;
                    case '%':root2 += "!";break;
                    case '&':root2 += "#";break;
                    case '/':root2 += "$";break;
                    case '(':root2 += "%";break;
                    case ')':root2 += "&";break;
                    case '=':root2 += "/";break;
                    case '?':root2 += "(";break;
                    case '¿':root2 += ")";break;
                    case '¡':root2 += "=";break;
                    case '!':root2 += "?";break;
                    case '#':root2 += "¿";break;
                    
                }
            }
            }
            }
        }
    }
    
    private static void JulioVerne(){
        clave = JOptionPane.showInputDialog("Digite la clave: (Solo en MAYUSCULAS y sin caracteres espciales ni digitos)");
        verne = "";
        
        Codigo = new int [clave.length()];
        for (int i = 0; i < clave.length(); i++) {
            Codigo [i] = abc.indexOf(clave.charAt(i));
        }
        
        for (int i = 0; i < clave.length(); i++) {
            ordenCodigo.add(Codigo[i]);
        }
        ordenCodigo.sort(Comparator.naturalOrder());
        
        
        LinkedList <Character> letra = new LinkedList<>();
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isWhitespace(texto.charAt(i))) {
                letra.add(texto.charAt(i));
            }
            else{
                letra.add('*');
            }
        }
        altura =(texto.length()/clave.length())+1;
        encriptamiento = new char [altura][clave.length()];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (!letra.isEmpty()) {
                    encriptamiento [i][j] = letra.getFirst();
                    letra.poll();
                }
            }
        }
        
        for (int i = 0; i < clave.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (ordenCodigo.getFirst() == Codigo[j]) {
                    for (int k = 0; k < altura; k++) {
                        verne += encriptamiento[k][j];
                    }
                }
            }
            ordenCodigo.poll();
        }
        
        JOptionPane.showMessageDialog(null, "El texto encriptado es:" + verne);
    }
    
    private static void JulioVerneDesencriptacion(){
        verne = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (encriptamiento[i] [j] != '*') {
                    verne += encriptamiento[i] [j];
                }
                else{
                    verne += " ";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El texto desencriptado es: "+ verne);
    }
    
    private static void PigLatin(){
        StringBuilder t = new StringBuilder();
        String aux = "";
        pig = "";
        latin = texto;
        
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isAlphabetic(texto.charAt(i))) {
                aux += texto.charAt(i);
            }
            if (Character.isWhitespace(texto.charAt(i))) {
                Palabras.add(aux);
                aux = "";
            }
        }
        Palabras.add(aux);
        try{
            boolean iVocal = false;
            for (int i = 0; i < Palabras.size(); i++) {
                iVocal = false;
                for (int j = 0; j < v.length(); j++) {
                    if (Palabras.getFirst().startsWith(String.valueOf(v.charAt(j)))) {
                        pig += Palabras.getFirst()+"-yay ";
                        Palabras.poll();
                        iVocal = true;
                    }
                }
                if (!iVocal) {
                    t.append(Palabras.getFirst());
                    aux = String.valueOf(Palabras.getFirst().charAt(0));
                    t.deleteCharAt(0);
                    pig += t+"-"+aux+"ay "; 
                    t.delete(0, Palabras.getFirst().length());
                    Palabras.poll();
                }
            }
            iVocal = false;
            for (int j = 0; j < v.length(); j++) {
                    if (Palabras.getLast().startsWith(String.valueOf(v.charAt(j)))) {
                        pig += Palabras.getLast()+"-yay";
                        System.out.println(pig);
                        iVocal = true;
                    }
                }
                if (!iVocal) {
                     t.append(Palabras.getLast());
                    aux = String.valueOf(Palabras.getLast().charAt(0));
                    t.deleteCharAt(0);
                    pig += t+"-"+aux+"ay ";
                    t.delete(0, Palabras.getLast().length());
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "El texto encriptado en pig-latin es: "+pig);
        }
    }
    
    public static void Menu(){
        int seleccion = 0;
        try{
            do{
                String menu = "----------------------------------------Menu----------------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Nuevo String\n2.- Obtener Vocales y Consonantes\n"
                + "3.- Obtener Espacios\n4.- Obtner Digitos\n5.- Obtener Caracteres Especiales\n"
                + "6.- Obtener Palabras\n7.-Convertir de Mayusculas a Minusculas\n"
                + "8.-Convertir de Minusculas a Mayusculas\n9.-Impirmir Primer Caracter\n"
                + "10.- Imprimir Ultimo Caracter\n11.- Longitud\n12.- Pasar el Segundo String\n"
                + "13.-Root 3\n14.-Desencriptacion Root 3\n15.-Julio Verne\n16.-Desencriptacion Julio Verne\n"
                + "17.-Pig Latin\n18.-Desencriptacion Pig Latin\n19.-Salir del Sistema\nEl String es: "+texto;
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(seleccion){
                    case 1:
                        texto = JOptionPane.showInputDialog("Digite el valor del Primer String:");break;
                    case 2:
                        Letras();
                        JOptionPane.showMessageDialog(null, "El numero de letras es de: "+letras+"\nEl numero de vocales es de: "+vocales+"\nEl numero de consonantes es de: "+consonantes);break;
                    case 3:
                        Espacios();
                        JOptionPane.showMessageDialog(null, "El numero de espacios es de: "+espacios);break;
                    case 4:
                        Digitos();
                        JOptionPane.showMessageDialog(null, "El numero de digitos es de: "+digitos);break;
                    case 5:
                        CaracteresEspeciales();
                        JOptionPane.showMessageDialog(null, "El numero de caracteres especiales es de: "+especiales);break;
                    case 6:
                        Palabras();
                        JOptionPane.showMessageDialog(null, "El numero de palabras es de: "+palabras);break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "El String "+texto+ "en minusculas: "+texto.toLowerCase());break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "El String "+texto+ "en mayusculas: "+texto.toUpperCase());break;
                    case 9:
                        if (Character.isWhitespace(texto.charAt(0))) {
                            texto.trim();
                        }
                        JOptionPane.showMessageDialog(null, "El primer caracter es de: "+texto.charAt(0));break;
                    case 10:
                        if (Character.isWhitespace(texto.charAt(texto.length()-1))) {
                            texto.trim();
                        }
                        JOptionPane.showMessageDialog(null, "El ultimo caracter es de: "+texto.charAt(texto.length()-1));break;
                    case 11:
                        JOptionPane.showMessageDialog(null,"La longitud del String es de: "+ texto.length());break;
                    case 12:String2();break;
                    case 13:
                        Root3();
                        JOptionPane.showMessageDialog(null,"El String encriptado en root 3 es: "+ root);break;
                    case 14:
                        DesencriptacionRoot3();
                        JOptionPane.showMessageDialog(null,"El String desencriptado en root 3 es: "+ root2);break;
                    case 15:
                        JulioVerne();break;
                    case 16:
                        JulioVerneDesencriptacion();break;
                    case 17:
                        PigLatin();break;
                    case 18:JOptionPane.showMessageDialog(null, latin);break;
                    case 19:System.exit(0);break;
                }
                
            }while(seleccion !=19);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "------------------------------Opcion Invalida------------------------------\nFavor de Digitar un Numero Valido del Menu de Opciones");
            Menu();
        }
    }
    
    public static void main(String[] args) {
        Menu();
    }
    
}
