
package gestion_facultad;


public class Estudiante extends Persona {
    private String Curso;
    
    
    
    public Estudiante () {
        
    }
    
    public Estudiante(int ID, String Nombre, String Apellido, String Estd_Civil, String Curso){
       super(Nombre, Apellido,  ID, Estd_Civil);
       
       this.Curso = Curso;
       
    }

    public String getCurso() {
        return Curso;
    }

    public void CambioCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
   
    
    
    
    @Override
    public String mostrarInformacion() {
        return "ID= " + getID() + ", Nombre= " + getNombre() + ", Apellido= " + getApellido() + ", Estado civil= " + getEstd_Civil() + ", Curso= " + Curso ;
        
    
        }
        
    
}
