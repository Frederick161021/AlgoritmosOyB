package Arboles;

public class Nodo {
    private int vocales,conson,letras,espacios,digitos,especiales,palabras;
    public int numero;
    private String texto,v = "aeiou";
    private char estatus;
    public Nodo derecha = null;
    public Nodo izquierda = null;

    public Nodo(String texto, char estatus,int numero) {
        setTexto(texto);
        setEstatus(estatus);
        this.numero = numero;
        derecha = null;
        izquierda = null;
    }

    public Nodo(String texto, char estatus,int numero, Nodo i, Nodo d) {
        setTexto(texto);
        setEstatus(estatus);
        this.numero = numero;
        izquierda = i;
        derecha = d;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getVocales() {
        vocales = 0;
        String aux = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < v.length(); j++) {
                if (aux.charAt(i) == v.charAt(j)) {
                    vocales++;
                }
            }
        }
        return vocales;
    }

    public int getConson() {
        conson = getLetras() - getVocales();
        return conson;
    }

    public int getLetras() {
        letras = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                letras++;
            }
        }
        return letras;
    }

    public int getEspacios() {
        espacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                espacios++;
            }
        }
        return espacios;
    }

    public int getDigitos() {
        digitos = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                digitos++;
            }
        }
        return digitos;
    }

    public int getEspeciales() {
        especiales = texto.length()-(getDigitos()+getLetras()+getEspacios());
        return especiales;
    }

    public int getPalabras() {
        palabras = 0;
        for (int i = 1; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.length())) {
                palabras++;
            }
        }
        palabras++;
        return palabras;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
    
    public String toString(){
        return  texto+"/"+estatus+"/"+numero+"\n";
    }
}
