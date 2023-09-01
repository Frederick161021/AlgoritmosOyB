package Audio_Numeros;
import javax.swing.JOptionPane;
import java.applet.AudioClip;

public class Tarea_6 {
    private static double numero;
    private static int v = 0, c = 0;
    private AudioClip audio;
    private static String Numero = "",vocales = "AEIOUaeiou";
    private static String especiales[] = {"","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
    private static String unidades[] = {"","","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    private static String decenas[] = {"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
    private static String centenas[] = {"","ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","sietecientos","ochocientos","novecientos"};
    
    public void Numero() throws InterruptedException{
        Numero = "";
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero: "));
        int aux = (int)(numero/1000000);
        if (aux > 1) {
            Miles(aux);
            Numero += " millones";
        }
        if (aux == 1) {
            Numero += "un millon";
        }
        aux = (int)(numero%1000000);
        aux /= 1000;
        if (aux > 1) {
            Centenas(aux);
            Numero += " mil";
        }
        if (aux == 1) {
            Numero += " mil";
        }
        aux = (int)(numero%1000);
        if (aux > 1) {
            Centenas(aux);
        }
        aux = (int)((numero%1)*100);
        if (aux > 1) {
            Numero += " punto";
            if (aux > 10 && aux < 20) {
                Especiales(aux);
            }
            else{
                Decenas(aux);
            }
        }
        if (numero == 0) {
            Numero = "cero";
        }
        Audio();
    }
    
    public void Miles(int m) throws InterruptedException{
        int aux = m /1000;
        if ( aux > 0) {
            if (aux == 1) {
                Numero += " mil";
            }
            else{
                Numero += " "+unidades[aux]+" mil";
            }
        }
        Centenas(m%1000);
    }
    
    public void Centenas(int c) throws InterruptedException{
        int aux = c /100;
        if ( aux > 0) {
            if (c == 100) {
                Numero += " cien";
   
            }else{
                Numero += " "+centenas[aux];
   
            }
        }
        if ((c%100) > 10 && (c%100) < 20) {
            Especiales(c%100);
        }
        else{
            Decenas(c%100);
        }
    }
    
    public void Decenas(int d) throws InterruptedException{
        boolean unidad = false;
        int aux = d /10;
        if (d > 20 && d < 30) {
            Numero += " venti";
            }
        else{
            if ( aux > 0) {
                Numero += " "+decenas[aux];
                if (d%10 > 0) {
                    Numero += " y";
                    Unidades(d%10);
                    unidad = true;
                }
            }
        }
        if (!unidad) {
            Unidades(d%10);
        }
    }
    
    public void Especiales(int e) throws InterruptedException{
        int aux = e %10;;
        Numero += " "+especiales[aux];
    }
    
    public void Unidades(int u) throws InterruptedException{
        if ( u> 1) {
            Numero += " "+unidades[u];
        }
        if (u ==1) {
            Numero += " uno";
        }
    }
    
    public static void Vocales(){
        v = 0;
        c = 0;
        boolean esVocal = false;
        for (int i = 0; i < Numero.length(); i++) {
            esVocal = false;
            if (Character.isAlphabetic(Numero.charAt(i))) {
                for (int j = 0; j < vocales.length(); j++) {
                    if (Numero.charAt(i) == vocales.charAt(j)) {
                        v++;
                        esVocal = true;
                    }
                }
                if (!esVocal) {
                    c++;
                }
            }
        } 
    }
    
    public void Audio() throws InterruptedException{
        StringBuilder n = new StringBuilder();
        n.append(Numero);
        StringBuilder aux = new StringBuilder();
        do {
            if (n.charAt(0) != ' ') {
                aux.append(n.charAt(0));
            }
            else{
                if (aux.length() != 0) {
                    audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio_Numeros/"+aux+".wav"));
                    audio.play();
                    Thread.sleep(1000);
                }
                aux.delete(0, n.length());
            }
            n.deleteCharAt(0);
        } while (n.length() > 0);
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio_Numeros/"+aux+".wav"));
        audio.play();
        Thread.sleep(1000);
        JOptionPane.showMessageDialog(null, Numero);
    }
    
    public static void Menu(){
        try{
            int seleccion = 0;
            do{
                String menu = "----------------------------------------Menu----------------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Nuevo numero\n2.- Contar digitos\n3.- Contar vocales\n4.- Contar consonantes\n5.-Salir del sistema";
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(seleccion){
                case 1:Tarea_6 N = new Tarea_6(); N.Numero();Vocales();break;
                case 2:JOptionPane.showMessageDialog(null,"El numero de digitos es de: "+String.valueOf(numero).length());break;
                case 3:JOptionPane.showMessageDialog(null,"El numero de vocales es de: "+v);break;
                case 4:JOptionPane.showMessageDialog(null,"El numero de consonates es de: "+c);break;
                case 5:System.exit(0);break;
            }
            }while(seleccion != 6);
        }catch(Exception e){
            Menu();
        }
    }
    public static void main(String[] args) {
        try{
            Menu();
        }catch(Exception e){
        }
        
    }
    
}
//audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio_Numeros/1.wav"));
//audio.play();
//Thread.sleep(100);
//audio.stop();
// Erick Toledo