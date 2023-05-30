
package gestion_facultad;


public class Profesores extends Persona{
    private  String Depart;
    
    
    public Profesores(){
        
    }
    public Profesores(int ID, String Nombre, String Apellido, String Estd_Civil,String Depart){
        super(Nombre, Apellido,  ID, Estd_Civil);
        
        this.Depart = Depart;
        
       } 

    public String getDepart() {
        return Depart;
    }

    public void CambioDepart(String Depart) {
        this.Depart = Depart;
    }
    
      @Override
    public String mostrarInformacion() {
        return "ID= " + getID() + ", Nombre= " + getNombre() + ", Apellido=" + getApellido() + ", Estado civil= " + getEstd_Civil() + ", Departamento= " + Depart ;
        
    
        }

   
    
    
    
    }
       
       
       
     