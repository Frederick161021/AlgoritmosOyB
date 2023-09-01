package Arboles;
import javax.swing.JOptionPane;

public class Tarea_10 {
    private static int numero =0, contadorNodos = 0,profundidad = 0;
    private static String texto, prnt, t;
    private static Nodo nNodo, raiz, aux;
    
    public static void inicializarArbol(){
        nNodo = new Nodo("", ' ',0);
    }
    
    public static void nNodoAB(){
        try{
            int numNodos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de parrafos que quiera agregar"));
            for (int i = 0; i < numNodos; i++) {
                texto = JOptionPane.showInputDialog("Digite el texto del nodo:");
                numero = texto.length();
                nNodo = new Nodo(texto,'a',numero);
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
        if (numero < r.numero) {
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
                prnt= "";
                inOrder(raiz);
                JOptionPane.showMessageDialog(null,prnt);
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
            if (r.getEstatus() != 'b') {
                prnt += r.toString();
            }
            preOrder(r.izquierda);
            preOrder(r.derecha);
        }
    }
    
    public static void posOrder(Nodo r){
        if (r != null) {
            posOrder(r.izquierda);
            posOrder(r.derecha);
            if (r.getEstatus() != 'b') {
                prnt += r.toString();
            }
        }
    }
    
    public static void inOrder(Nodo r){
        if (r != null) {
            inOrder(r.izquierda);
            if (r.getEstatus() != 'b') {
                prnt += r.toString();
            }
            inOrder(r.derecha);
        }
    }
    
    public static void bTexto(int d){
        aux = raiz;
        System.out.println(t);
        System.out.println(aux.getTexto().equalsIgnoreCase(t));
        while(aux.numero != d){
            if (d < aux.numero) {
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
                +"1.- Inicializar ArbolBinario\n 2.- Agregar Nodos \n3.- Vocales\n4.- Consonantes\n"
                +"5.- Digitos\n6.- Espacios\n7.- Caracteres especiales\n8.- Recorridos\n9.- Cantidad de nodos\n"
                +"10.- Profundidad\n11.- Eleminar nodo\n12.- Buscar texto\n13.- Salir del Programa";
        seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch(seleccion){
            case 1:inicializarArbol();break;
            case 2:nNodoAB();break;
            case 3:
                prnt = "";
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado tiene "+ aux.getVocales()+" vocales.");
                break;
            case 4:
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado tiene "+ aux.getConson()+" consonantes.");
                break;
            case 5:
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado tiene "+ aux.getDigitos()+" digitos.");
                break;
            case 6:
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado tiene "+ aux.getEspacios()+" espacios.");
                break;
            case 7:
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado tiene "+ aux.getEspeciales()+" cararcteres especiales.");
                break;
            case 8:Recorridos();break;
            case 9:JOptionPane.showMessageDialog(null, "La cantidad de nodos del arbol es de: "+contadorNodos);break;
            case 10:JOptionPane.showMessageDialog(null, "La prodfundidad del arbol es de: "+profundidad);break;
            case 11:
                t = JOptionPane.showInputDialog("Digite el texto que quiere eleminar del Arbol:");
                bTexto(t.length());
                aux.setEstatus('b');
                JOptionPane.showMessageDialog(null, "El nodo cambio su estatus a: "+ aux.getEstatus());
                break; 
            case 12:
                t = JOptionPane.showInputDialog("Digite el texto que quiere buscar en el Arbol:");
                bTexto(t.length());
                JOptionPane.showMessageDialog(null, "El nodo buscado es:"+ aux.toString());
                break; 
            case 13:System.exit(0);break; 
        }      
        }
        while(seleccion != 13);
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
