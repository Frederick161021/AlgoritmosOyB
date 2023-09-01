package Examen_Parcial1;
import javax.swing.JOptionPane;
import java.applet.AudioClip;

public class NumeroLetra {
    private AudioClip audio;
    private static String Numero = "",vocales = "AEIOUaeiou";
    private static String especiales[] = {"","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
    private static String unidades[] = {"","","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    private static String decenas[] = {"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
    private static String centenas[] = {"","ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","sietecientos","ochocientos","novecientos"};
    
    NumeroLetra(double numero) throws InterruptedException{
        Numero = "";
        setNumero(numero);
    }
    
    public void Numero(double numero) throws InterruptedException{
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
                    audio = java.applet.Applet.newAudioClip(getClass().getResource("/Examen_Parcial1/"+aux+".wav"));
                    audio.play();
                    Thread.sleep(1000);
                }
                aux.delete(0, n.length());
            }
            n.deleteCharAt(0);
        } while (n.length() > 0);
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Examen_Parcial1/"+aux+".wav"));
        audio.play();
        Thread.sleep(1000);
    }

    public String getNumero() throws InterruptedException {
        Audio();
        return Numero;
    }

    public void setNumero(double numero) throws InterruptedException {
        Numero(numero);
    }
    
}
