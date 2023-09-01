package String;

public class Nombres {
    String nombre;
    String apellido;
    String nombreCompleto;
    
    public Nombres(String nombre,String apellido){
        setNombre(nombre);
        setApellido(apellido);
        this.nombreCompleto = nombre+" "+apellido;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
}

