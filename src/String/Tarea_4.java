package String;

import javax.swing.JOptionPane;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Tarea_4 extends JFrame implements MouseListener, MouseMotionListener {

    private static Character sopaLetras[][] = new Character[20][20];
    private static int respuestasCorrectas = 0;
    private static boolean iniciarGrafica = false,primerClick = false;
    private static int xRespuestaI[] = new int[10];
    private static int xRespuestaF[] = new int[10];
    private static int yRespuestaI[] = new int[10];
    private static int yRespuestaF[] = new int[10];
    private static String palabras[] = {"perro", "gato", "caballo", "pavo", "cerdo", "zorro", "burro", "vaca", "toro", "pato"};
    private static String abc = "abcdefghijklmnñopqrstouvwxyz";
    public static int anchoCuadro = 30;
    Canvas c;

    Tarea_4() {

        super("canvas");
        //setLayout(new FlowLayout());
        setTitle("Sopa letras");

        // create a empty canvas
        c = new Canvas() {
            public void paint(Graphics g) {
            }
        };

        // set background
        c.setBackground(Color.cyan);

        // add mouse listener
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
        //  add(label1);
        add(c);
        setSize(900, 800);
        show();
    }

    public static void SopaLetras() {
        for (int i = 0; i < 10; i++) {
            int alatorio = (int) (Math.random() * 3 + 1);
            switch (alatorio) {
                case 1:
                    Vertical(i);
                    break;
                case 2:
                    Horizontal(i);
                    break;
                case 3:
                    Diagonal(i);
                    break;
            }
        }
        Rellenar();
    }

    public static void Vertical(int n) {
        boolean espacioLibre = true;
        int columna = (int) (Math.random() * 20);
        int fila = (int) (Math.random() * (21 - palabras[n].length()));
        for (int i = 0; i < palabras[n].length(); i++) {
            if (sopaLetras[fila + i][columna] != null) {
                espacioLibre = false;
            }
        }

        if (espacioLibre) {
            for (int i = 0; i < palabras[n].length(); i++) {
                sopaLetras[fila + i][columna] = palabras[n].charAt(i);
                if (i == 0) {
                    xRespuestaI [n]= fila; 
                    yRespuestaI [n]= columna; 
                }
                if (i == (palabras[n].length()-1)) {
                    xRespuestaF [n]= fila+i; 
                    yRespuestaF [n]= columna;
                }
            }
        } else {
            Vertical(n);
        }
    }

    public static void Horizontal(int n) {
        boolean espacioLibre = true;
        int columna = (int) (Math.random() * (21 - palabras[n].length()));
        int fila = (int) (Math.random() * 20);

        for (int i = 0; i < palabras[n].length(); i++) {
            if (sopaLetras[fila][columna + i] != null) {
                espacioLibre = false;
            }
        }

        if (espacioLibre) {
            for (int i = 0; i < palabras[n].length(); i++) {
                sopaLetras[fila][columna + i] = palabras[n].charAt(i);
                if (i == 0) {
                    xRespuestaI [n]= fila; 
                    yRespuestaI [n]= columna; 
                }
                if (i == (palabras[n].length()-1)) {
                    xRespuestaF [n]= fila; 
                    yRespuestaF [n]= columna+i;
                }
            }
        } else {
            Horizontal(n);
        }
    }

    public static void Diagonal(int n) {
        boolean espacioLibre = true;
        int columna = (int) (Math.random() * (21 - palabras[n].length()));
        int fila = (int) (Math.random() * (21 - palabras[n].length()));
        int aux = columna;

        for (int i = 0; i < palabras[n].length(); i++) {
            if (sopaLetras[fila + i][aux] != null) {
                espacioLibre = false;
            }
            aux++;
        }

        if (espacioLibre) {
            for (int i = 0; i < palabras[n].length(); i++) {
                sopaLetras[fila + i][columna] = palabras[n].charAt(i);
                columna++;
                if (i == 0) {
                    xRespuestaI [n]= fila; 
                    yRespuestaI [n]= columna-1; 
                }
                if (i == (palabras[n].length()-1)) {
                    xRespuestaF [n]= fila+i; 
                    yRespuestaF [n]= columna-1;
                }
            }
        } else {
            Diagonal(n);
        }
    }

    private static Character[][] Rellenar() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaLetras[i][j] == null) {
                    sopaLetras[i][j] = abc.charAt((int)(Math.random()*27));
                }
            }
        }
        return sopaLetras;
    }

    public static void Menu() {
        try {
            int seleccion = 0;
            String menu = "--------------------Sopa de Letras--------------------\n"
                    + "Digite el Numero que Desee que el Codigo Ejecute:\n1.- Jugar \n2.- Salir del sistema";
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (seleccion) {
                case 1:
                    try {
                        SopaLetras();
                        Tarea_4 c = new Tarea_4();
//                        for (int i = 0; i < 10; i++) {
//                            System.out.println("fila I: "+xRespuestaI[i]+"columna I: "+yRespuestaI[i]+"\n"+"fila f: "+xRespuestaF[i]+"columna f: "+yRespuestaF[i]);
//                        }
                    } catch (Exception e) {
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            Menu();
        }
    }

    public static void main(String[] args) {
        Menu();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Timer timer = new Timer();
        Graphics g = c.getGraphics();
        int x = me.getX() / anchoCuadro, y = me.getY() / anchoCuadro;
        if (iniciarGrafica) {
            int xInicial = 0,xFinal = 0,yInicial = 0,yFinal = 0;
            if (primerClick) {
                xFinal = x;
                yFinal = y;
//                System.out.println(xFinal);
//                System.out.println(yFinal);
                for (int i = 0; i < 10; i++) {
                    if ((xInicial == xRespuestaI[i] && yInicial == yRespuestaI[i]) || (xFinal == xRespuestaF[i] && yFinal == yRespuestaF[i])) {
                        palabras[i] = "";
                        respuestasCorrectas++;
                        if (respuestasCorrectas == 10) {
                            JOptionPane.showMessageDialog(null, "Ganaste");
                            
                        }
                    }
                }
                primerClick = false;
            }
            else{
                xInicial = x;
                yInicial = y;
//                System.out.println(xInicial);
//                System.out.println(yInicial);
                primerClick = true;
            }
        }else{
            iniciarGrafica = true;
        }
//        System.out.println("el caracter es: " + sopaLetras[x][y]);
//        System.out.println(x + "-" + y);
        try {
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    g.clearRect(0, 0, c.getWidth(), c.getHeight());
                    crearMatriz(g);
                    dibujarPalabras(g);
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, (100000 / 1));
        } catch (Exception e) {

        }
    }

    public static void dibujarPalabras(Graphics g) {
        for (int i = 0; i < palabras.length; i++) {
            g.setColor(Color.black);
            Font myFont = new Font("Courier New", 1, 20);
            g.setFont(myFont);
            g.drawString((i+1 + ".-" + palabras[i]), (anchoCuadro * sopaLetras.length + 50), (i * 50 + 30));
        }
    }

    public static void crearMatriz(Graphics g) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                g.setColor(Color.black);
                Font myFont = new Font("Courier New", 1, 20);
                g.setFont(myFont);
                g.drawRect(i * anchoCuadro, j * anchoCuadro, anchoCuadro, anchoCuadro);
                g.drawString(Character.toString(sopaLetras[i][j]), i * anchoCuadro + (anchoCuadro / 2), j * anchoCuadro + (anchoCuadro / 2) + 10);
            }
        }
    }

    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

}
