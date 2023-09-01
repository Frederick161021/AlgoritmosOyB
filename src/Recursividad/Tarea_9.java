package Recursividad;

import javax.swing.JOptionPane;

public class Tarea_9 {
    private static int suma = 0;
    private static String aux = "";
    private static int[] numeros = {6,35,9,10,33,1,5};
    
    public static String Invertir(int nLetras, String texto){
        if (nLetras >= 0) {
            aux += texto.charAt(nLetras);
            Invertir(nLetras-1,texto);
        }
        return aux;
    }
    
    public static int Suma(int n){
        if (n>=10) {
            suma = (n%10)+ Suma(n/10);
        }else{
            suma = n%10;
        }
        return suma;
    }
    
    public static int Maximo(int[] numeros, int indice, int max){
        if (indice  != numeros.length-1) {
            if (numeros[indice] > max) {
                max = Maximo(numeros,indice+1,numeros[indice]);
            }
            else{
                max = Maximo(numeros,indice+1,max);
            }
        }
        return max;
    }
    
    public static int Minimo(int[] numeros, int indice, int min){
        if (indice  != numeros.length-1) {
            if (numeros[indice] < min) {
                min = Minimo(numeros,indice+1,numeros[indice]);
            }
            else{
                min = Minimo(numeros,indice+1,min);
            }
        }
        return min;
    }
    
    public static void Menu(){
        try{
            int seleccion = 0;
            do{
                String menu = "--------------------Menu--------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Maximo\n2.- Minimo\n3.- Suma\n4.- Invaretir String\n5.- Salir del sistema";
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(seleccion){
                case 1:
                    JOptionPane.showMessageDialog(null,"Maximo: " + Maximo(numeros,0,numeros[0]));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Minimo: " + Minimo(numeros,0,numeros[0]));
                    break;
                case 3:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que quiere sumar sus digitos:"));
                    JOptionPane.showMessageDialog(null, "La suma de sus digitos es igual a: "+Suma(n));
                    break;
                case 4:
                    aux = "";
                    String texto = JOptionPane.showInputDialog("Digite una palabra:");
                    JOptionPane.showMessageDialog(null, "El String invertido es igual a: "+Invertir(texto.length()-1,texto));
                    break;
                case 5:System.exit(0);break;
            }
            }while(seleccion != 5);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Opcion invalida!!");
            Menu();
        }
    }
    
    public static void main(String[] args) {
        Menu();
    }
}
