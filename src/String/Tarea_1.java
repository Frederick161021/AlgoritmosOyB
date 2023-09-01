package String;
import javax.swing.JOptionPane;

public class Tarea_1 {
    private static String s = null;
    
    public static void String (){
        if (s == null) {
            s = JOptionPane.showInputDialog("Digite algo en el objeto String");
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    public static void Caracter(){
        try{
            int  c = Integer.parseInt(JOptionPane.showInputDialog("Digite el número del caracter que desea:"));
            String caracter = String.valueOf(s.charAt(c));
            Boolean cNumerico = caracter.matches("[+-]?\\d*(\\.\\d+)?");
            String Numerico;
            if (cNumerico) {
                Numerico = " es númerico";
            }else{
                Numerico = " es alfabetico";
            }
            JOptionPane.showMessageDialog(null,"El caracter "+caracter+Numerico);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Digite un numero valido!!");
        }
    }
    
    public static void Comparacion(){
        int seleccion = 0;
        try{
            String s2 = JOptionPane.showInputDialog("Digite un nuevo String para comparar:");
            Boolean Iguales = false, Iguales2 = false;
            if (s.compareTo(s2)== 0) {
                Iguales = true;
            }
            if (s.compareToIgnoreCase(s2)==0) {
                Iguales2 = true;
            }
            
            do{
                String menu = "------------------------------------Menu de Comparaciones--------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Equals\n2.- Equalsignorecase\n3.-Compareto\n4.-Comparetoignorecase\n5.-Regresar al menu"; 
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(seleccion){
                    case 1:JOptionPane.showMessageDialog(null, "El String "+s+ "es igual al String"+s2+":"+s.equals(s2));break;
                    case 2:JOptionPane.showMessageDialog(null, "El String "+s+ "es igual al String"+s2+":"+s.equalsIgnoreCase(s2));break;
                    case 3:JOptionPane.showMessageDialog(null, "El String "+s+ "es igual al String"+s2+":"+Iguales);break;
                    case 4:JOptionPane.showMessageDialog(null, "El String "+s+ "es igual al String"+s2+":"+Iguales2);break;
                    case 5:Menu();break;
                }
                
            }while(seleccion !=5);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Opcion Invalida");
            Menu();
        }
    }
    
    public static void Busqueda(){
        int seleccion = 0;
        try{
            String s2 = JOptionPane.showInputDialog("Digite un nuevo String que se desea buscar:");
            
            do{
                String menu = "------------------------------------Menu de Comparaciones--------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Endswith\n2.- Startswith\n3.-Indexof\n4.-Lastindexof\n5.-Regionmatches\n6.-Regresar al menu"; 
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(seleccion){
                    case 1:JOptionPane.showMessageDialog(null, "El String "+s+" termina con el String "+s2+" :"+s.endsWith(s2));break;
                    case 2:JOptionPane.showMessageDialog(null, "El String "+s+" empieza con el Stirng "+s2+" :"+s.startsWith(s2));break;
                    case 3:JOptionPane.showMessageDialog(null, "El String "+s+" empieza con el Stirng "+s2+" :"+s.indexOf(s2));break;
                    case 4:JOptionPane.showMessageDialog(null, "El String "+s+" termina con el String "+s2+" :"+s.lastIndexOf(s2));break;
                    case 5:
                        int iRango = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del caracter del inicio del rango de busqueda:"));
                        int fRango = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del caracter del final del rango de busqueda:"));
                        JOptionPane.showMessageDialog(null, "El String "+s2+" se encuentra en el  rango del "+iRango+" al "+fRango+" : "+s.regionMatches(iRango, s2, 0, fRango));
                        break;
                    case 6:Menu();
                }
                
            }while(seleccion !=6);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Opcion Invalida");
            Menu();
        }
    }
    
    public static void Transformacion(){
        int seleccion = 0;
        try{
            String s2 = JOptionPane.showInputDialog("Digite un nuevo String que se desea buscar:");
            
            do{
                String menu = "------------------------------------Menu de Comparaciones--------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Endswith\n2.- Startswith\n3.-Indexof\n4.-Lastindexof\n5.-Regionmatches\n6.-Regresar al menu"; 
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(seleccion){
                    case 1:JOptionPane.showMessageDialog(null, "El String "+s+" termina con el String "+s2+" :"+s.endsWith(s2));break;
                    case 2:JOptionPane.showMessageDialog(null, "El String "+s+" empieza con el Stirng "+s2+" :"+s.startsWith(s2));break;
                    case 3:JOptionPane.showMessageDialog(null, "La primera aparicion del String "+s2+" en el Stirng "+s+" :"+s.indexOf(s2));break;
                    case 4:JOptionPane.showMessageDialog(null, "La ultima aparicion del String "+s2+" en el String "+s+" :"+s.lastIndexOf(s2));break;
                    case 5:
                        int iRango = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del caracter del inicio del rango de busqueda:"));
                        int fRango = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del caracter del final del rango de busqueda:"));
                        JOptionPane.showMessageDialog(null, "El String "+s2+" se encuentra en el  rango del "+iRango+" al "+fRango+" : "+s.regionMatches(iRango, s2, 0, fRango));
                        break;
                    case 6:Menu();
                }
                
            }while(seleccion !=5);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Opcion Invalida");
            Menu();
        }
    }
    
    public static void Menu(){
        int seleccion = 0;
        try{
            do{
                String menu = "----------------------------------------Menu----------------------------------------\n"
                + "Digite el Numero que Desee que el Codigo Ejecute:\n"
                + "1.- Leer String\n2.- Obtener longitud\n3.- Obtener tipo de caracter\n"
                + "4.- Metodos de Comparacion\n5.- Metodos de Busqueda\n"
                + "6.- Metodos de transformación\n7.-Salir del Sistema";
                
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(seleccion){
                    case 1:String();break;
                    case 2:JOptionPane.showMessageDialog(null,"La longitud de " + s + " es de "+ s.length()+" caracteres");break;
                    case 3:Caracter();break;
                    case 4:Comparacion();break;
                    case 5:Busqueda();break;
                    case 6:;break;
                    case 7:System.exit(0);
                }
                
            }while(seleccion !=7);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "------------------------------Opcion Invalida------------------------------\nFavor de Digitar un Numero Valido del Menu de Opciones");
            Menu();
        }
    }

    public static void main(String[] args) {
        Menu();
    }
    
}
