//Matricula: 19017291
//Nombre : Erick Ivan Toledo Galenana
//Materia: Algoritmos de Ordenamiento y Búsqueda

package Examen_Parcial1;
import javax.swing.JOptionPane;

public class Examen {
    private static String texto,textoencrip,textoEncriptado,root = "", root2 = "",prnt = "", t = "";
    private static int numero,contadorNodos = 0,profundidad = 0;
    private static char seccion, s;
    private static double cantidad;
    private static Nodo nNodo, raiz, aux;
    
     public static void nNodo(){
        try{
            int numNodos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de parrafos que quiera agregar"));
            for (int i = 0; i < numNodos; i++) {
                texto = JOptionPane.showInputDialog("Digite el texto del nodo:");
                textoencrip = JOptionPane.showInputDialog("Digite el texto encriptado del nodo:");
                seccion = JOptionPane.showInputDialog("Digite la seccion (char) del nodo: ").charAt(0);
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Digite una cantidad (float) al nodo:"));
                Root3(textoencrip.toLowerCase());
                numero = texto.length();
                nNodo = new Nodo(texto, root, seccion, numero, cantidad);
                if (contadorNodos == 0) {
                    raiz = nNodo;
                    contadorNodos++;
                    profundidad++;
                }
                else {
                    Arbol(raiz);
                    contadorNodos++;
                }
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Digite una opcion valida!!");
        }
    }
    
    public static void Arbol(Nodo r){
        if (numero < r.getNumeroNodo()) {
            if (r.izquierda == null) {
                r.izquierda = nNodo; 
            }
            else{
                Arbol(r.izquierda);
            }
        }
        else{
            if (r.derecha == null) {
                r.derecha = nNodo; 
            }
            else{
                Arbol(r.derecha);
            }
        }
    } 
    
    private static void Root3(String t){
        root = "";
        for (int i = 0; i < t.length(); i++) {
            if (Character.isAlphabetic(t.charAt(i))) {
                switch(t.charAt(i)){
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
            if (Character.isDigit(t.charAt(i))) {
                switch(t.charAt(i)){
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
            if (Character.isWhitespace(t.charAt(i))) {
                root += "°" ;
            }
            else{
                switch(t.charAt(i)){
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
    
    private static void DesencriptacionRoot3 (String t){
        root2 ="";
        for (int i = 0; i < t.length(); i++) {
            if (Character.isAlphabetic(t.charAt(i))) {
                switch(t.charAt(i)){
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
    
    public static void Recorridos(){
        int seleccion = 0;
        try{
        do{
            String menu = "------------------------------Menu------------------------------\n"
                +"Digite el Numero que Desee que el Codigo Ejecute:\n"
                +"1.- Preorder\n2.- Postorder\n"
                +"3.- Inorder\n4.- Regresar al menu\n";
        seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch(seleccion){
            case 1:
                prnt = "";
                preOrder(raiz);
                JOptionPane.showMessageDialog(null,prnt);
                break;
            case 2:
                prnt= "";
                posOrder(raiz);
                JOptionPane.showMessageDialog(null,prnt);
                break;
            case 3:
                prnt = "";
                inOrder(raiz);
                JOptionPane.showMessageDialog(null, prnt);
                break;
            case 4:Menu();break;
        }      
        }
        while(seleccion != 4);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "------------------------------Opcion Invalida------------------------------\nFavor de Digitar un Numero Valido del Menu de Opciones");
            Recorridos();
        }
    }
    
    public static void preOrder(Nodo r){
        if (r != null) {
            prnt += r.toString();
            preOrder(r.izquierda);
            preOrder(r.derecha);
        }
    }
    
    public static void posOrder(Nodo r){
        if (r != null) {
            posOrder(r.izquierda);
            posOrder(r.derecha);
            prnt += r.toString();
        }
    }
    
    public static void inOrder(Nodo r){
        if (r != null) {
            inOrder(r.izquierda);
            prnt += r.toString();
            inOrder(r.derecha);
        }
    }
    
    public static void bTexto(int d){
        aux = raiz;
        while(aux.getNumeroNodo() != d){
            if (d < aux.getNumeroNodo()) {
                aux = aux.izquierda;
            }else{
                aux = aux.derecha;
            }
            if (aux == null) {
                JOptionPane.showMessageDialog(null, "El dato que se quiere buscar no existe!!");
                Menu();
            }
        }
        if (!aux.getTexto().equalsIgnoreCase(t)) {
            JOptionPane.showMessageDialog(null, "El dato que se quiere buscar no existe!!");
            Menu();
        }
    }
    
    public static int getPalabras(String t) {
        int palabras = 0;
        for (int i = 1; i < t.length(); i++) {
            if (Character.isWhitespace(t.charAt(i))) {
                palabras++;
            }
        }
        palabras++;
        return palabras;
    }
    
    public static void inOrderNumPalabrasDesencripamiento(Nodo r){
        if (r != null) {
            inOrderNumPalabrasDesencripamiento(r.izquierda);
            DesencriptacionRoot3 (r.getTextoEncriptado());
            prnt += "Numero de nodo: "+r.getNumeroNodo()+" Texto encriptado: "+r.getTextoEncriptado()+" Texto desencriptado: "+root2+" Numero de palabras: "+getPalabras(root2)+"\n";
            inOrderNumPalabrasDesencripamiento(r.derecha);
        }
    }
    
    public static void preOrderEncriptado(Nodo r){
        if (r != null) {
            prnt += "Numero de Nodo: "+r.getNumeroNodo()+" Texto encriptado: "+r.getTextoEncriptado()+"\n";
            preOrderEncriptado(r.izquierda);
            preOrderEncriptado(r.derecha);
        }
    }
    
    public static void posOrderDesencripamiento(Nodo r){
        if (r != null) {
            posOrderDesencripamiento(r.izquierda);
            posOrderDesencripamiento(r.derecha);
            prnt += "Numero de Nodo: "+r.getNumeroNodo()+" Texto encriptado: "+r.getTextoEncriptado()+"\n";
        }
    }
    
    public static void inOrderSeccion(Nodo r){
        if (r != null) {
            inOrderSeccion(r.izquierda);
            if (r.getSeccion() == s) {
                aux = r;
            }
            inOrderSeccion(r.derecha);
        }
    }
    
    public static void bSeccion(int d){
        aux = raiz;
        while(aux.getNumeroNodo() != d){
            if (d < aux.getNumeroNodo()) {
                aux = aux.izquierda;
            }else{
                aux = aux.derecha;
            }
            if (aux == null) {
                JOptionPane.showMessageDialog(null, "El dato que se quiere buscar no existe!!");
                Menu();
            }
        }
        if (!aux.getTexto().equalsIgnoreCase(t)) {
            JOptionPane.showMessageDialog(null, "El dato que se quiere buscar no existe!!");
            Menu();
        }
    }
    
    public static void Menu(){
        int seleccion = 0;
        try{
        do{
            String menu = "------------------------------Menu------------------------------\n"
                +"Digite el Numero que Desee que el Codigo Ejecute:\n"
                +"1.- Agregar nodo a arbol\n2.- Recorridos\n3.- Imprimir nodos >= x\n"
                +"4.- Numero de palabras desencriptamiento inOrder\n5.- Desenciptamiento posOrder\n6.-Texto encriptado preOrder\n"
                +"7.- Imprimir nodo = x\n8.-Salir del Programa";
        seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch(seleccion){
            case 1:nNodo();break; 
            case 2:Recorridos();break; 
            case 3:
                prnt = "";
                s = JOptionPane.showInputDialog("Digite la seccion que quiere buscar en el Arbol:").charAt(0);
                inOrderSeccion(raiz);
                inOrder(aux);
                JOptionPane.showMessageDialog(null, aux.getNumeroNodo()+"/"+aux.getSeccion());
                break;
            case 4: 
                prnt = "";
                s = JOptionPane.showInputDialog("Digite la seccion que quiere buscar en el Arbol:").charAt(0);
                inOrderSeccion(raiz); 
                JOptionPane.showMessageDialog(null, prnt);
                break;
            case 5: 
                prnt = "";
                s = JOptionPane.showInputDialog("Digite la seccion que quiere buscar en el Arbol:").charAt(0);
                inOrderSeccion(raiz);
                JOptionPane.showMessageDialog(null, prnt);
                break;
            case 6: prnt = "";preOrderEncriptado(raiz);JOptionPane.showMessageDialog(null, prnt);break;
            case 7: 
                s = JOptionPane.showInputDialog("Digite la seccion que quiere buscar en el Arbol:").charAt(0);
                inOrderSeccion(raiz);
                JOptionPane.showMessageDialog(null, aux.toString());
            case 8:System.exit(0);break; 
        }      
        }
        while(seleccion != 8);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "------------------------------Opcion Invalida------------------------------\nFavor de Digitar un Numero Valido del Menu de Opciones!!");
            Menu();
        }
    }
    
    public static void main(String[] args) {
        Menu();
    }
    
}
