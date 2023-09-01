package Examen_Parcial1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nodo {
    private int numeroNodo,vocales,conson,letras,espacios,digitos,especiales,palabras;
    private String texto,textoEncriptado, numLetra, v = "aeiouáéíóú";
    private char seccion;
    private double cantidad;
    public Nodo izquierda = null, derecha = null;
    
    Nodo(String texto, String textoEncriptado, char secccion, int numeroNodo, double cantidad ) throws InterruptedException{
        setTexto(texto);
        setTextoEncriptado(textoEncriptado);
        setNumeroNodo(numeroNodo);
        setSeccion(secccion);
        setCantidad(cantidad);
        setNumLetra(cantidad);
    }
    
    Nodo(String texto, String textoEncripado, char seccion, int numeroNodo, double cantidad, Nodo izqierda, Nodo derecha){
        setTexto(texto);
        setTextoEncriptado(textoEncriptado);
        setNumeroNodo(numeroNodo);
        setSeccion(seccion);
        setCantidad(cantidad);
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTextoEncriptado() {
        return textoEncriptado;
    }

    public void setTextoEncriptado(String textoEncriptado) {
        this.textoEncriptado = textoEncriptado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumeroNodo() {
        return numeroNodo;
    }

    public void setNumeroNodo(int numeroNodo) {
        this.numeroNodo = numeroNodo;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
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
            if (Character.isWhitespace(texto.charAt(i))) {
                palabras++;
            }
        }
        palabras++;
        return palabras;
    }

    public NumeroLetra getNumLetra() throws InterruptedException {
        NumeroLetra nl = new NumeroLetra(cantidad);
        return nl;
    }

    public void setNumLetra(double cantidad) throws InterruptedException {
        NumeroLetra nl = new NumeroLetra(cantidad);
        this.numLetra = nl.getNumero();
    }
    
    
    
    public String toString(){
        String st = "";
        try {
             st ="Numero del texto: "+getNumeroNodo()+" Seccion: "+getSeccion()+" Cantidad: "+getCantidad()+" Numero a letras: "+getNumLetra().getNumero()+" Letras: "+getLetras()+" texto: "+getTexto()+" Vocales: "+getVocales()+" Consonantes: "+getConson()+" Digitos: "+getDigitos()+" Espacios: "+getEspacios()+" Especiales: "+ getEspeciales()+" Palabras: "+getPalabras()+"\n";
        } catch (InterruptedException ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
    
}
