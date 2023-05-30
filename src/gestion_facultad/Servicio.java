
package gestion_facultad;

public class Servicio extends Persona {
    
    private String Seccion;
    
    public Servicio (){
        
    }
    
    public Servicio(int ID, String Nombre, String Apellido, String Estd_Civil,String Seccion){
        super(Nombre, Apellido,  ID, Estd_Civil);
        
        this.Seccion = Seccion;
        
    }

    public String getSeccion() {
        return Seccion;
    }

    public void CambiodSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
     @Override
    public String mostrarInformacion() {
        return "ID=" + getID() + ", Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Estado civil= " + getEstd_Civil() + ", Seccion= " + Seccion ;
        
        }

    
    
}

