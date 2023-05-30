
package gestion_facultad;


public class Persona {
    
    private String Nombre;
    private String Apellido;
    private int ID;
    private String Estd_Civil;
    
    
    
    public Persona(){
  
}
    
    
    public Persona (String Nombre, String Apellido, int ID, String Estd_Civil){
        
        this.Nombre=Nombre;
        this.Apellido =Apellido;
        this.ID = ID;
        this.Estd_Civil = Estd_Civil;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEstd_Civil() {
        return Estd_Civil;
    }

    public void CambiarEstd_Civil(String Estd_Civil) {
        this.Estd_Civil = Estd_Civil;
    }
    
    
    
    
    
    
    
    
     public String mostrarInformacion() {
        return "ID= " + ID + ", Nombre= " + Nombre + ", Apellidos= " + Apellido + ", Estado civil= " + Estd_Civil;
    }
    
}


