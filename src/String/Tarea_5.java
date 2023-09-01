package String;
import javax.swing.JOptionPane;

public class Tarea_5 {
    private static String palabras[] ={"perro","gato","caballo","pavo","cerdo","zorro","burro","gallina","vaca","toro"};
    
    public static void Juego(String palabra){
        int vida = 5, letrasAcertadas = 0;
        char caracteres [] = new char[palabra.length()];
        char pista [] = new char[palabra.length()];
        String aux = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            caracteres[i] = palabra.charAt(i);
            pista[i] = '_';
        }
        
        do {
            boolean pertenece = false;
            aux ="";
            for (int i = 0; i < palabra.length(); i++) {
                aux += pista[i]+" ";
            }
            char seleccion = JOptionPane.showInputDialog("Vida restante: "+vida+"\n"+aux+"\nDigite un caracter que cree que pertenece a la palabra:").toLowerCase().charAt(0);
            
            for (int i = 0; i < palabra.length(); i++) {
                if (seleccion == caracteres[i]) {
                    pista[i] = seleccion;
                    letrasAcertadas++;
                    pertenece = true;
                }
            }
            if (!pertenece) {
                vida--;
            }
        } while (vida !=0 && letrasAcertadas != palabra.length());
        
        if (vida == 0) {
            GameOver();
        }else{
            Winner();
        }
            
    }
    
    public static void GameOver(){
        try{
            int seleccion = 0;
            String palabra = palabras[(int)(Math.random()*9)];
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("----------Game Over----------\n1.- Volver a jugar\n2.-Salir del juego"));
            switch(seleccion){
                case 1:Juego(palabra);break;
                case 2: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null, "Opcion no valida!!");
            }
        }catch(Exception e){
            GameOver();
        }
    }
    
    public static void Winner(){
        try{
            int seleccion = 0;
            String palabra = palabras[(int)(Math.random()*9)];
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("----------You won!!----------\n1.- Volver a jugar\n2.-Salir del juego"));
            switch(seleccion){
                case 1:Juego(palabra);break;
                case 2: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null, "Opcion no valida!!");
            }
        }catch(Exception e){
            Winner();
        }
    }
    
    public static void main(String[] args) {
        int seleccion = 0;
        String palabra = palabras[(int)(Math.random()*9)];
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("----------Horcado----------\n1.- Jugar\n2.-Salir del juego"));
        switch(seleccion){
            case 1:Juego(palabra);break;
            case 2: System.exit(0);break;
            default: JOptionPane.showMessageDialog(null, "Opcion no valida!!");
        }
    }
    
}
