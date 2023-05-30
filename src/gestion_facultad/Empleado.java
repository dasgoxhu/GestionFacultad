
package gestion_facultad;


public class Empleado extends Persona {
    
    private String Despacho;
    private int Año;
    
    
    public Empleado(){
        
    }
    public Empleado (int ID, String Nombre, String Apellido, String Estd_Civil, String Despacho, int Año){
       super(Nombre, Apellido,  ID, Estd_Civil);
       this.Año = Año;
       this.Despacho = Despacho;  
    }

    public String getDespacho() {
        return Despacho;
    }

    public void CambiarDespacho(String Despacho) {
        this.Despacho = Despacho;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
    @Override
    public String mostrarInformacion() {
        return "ID= " + getID() + ", Nombre= " + getNombre() + ", Apellido= " + getApellido() + ", Estado civil= " + getEstd_Civil() +", Año incorporación= "+ Año + ", Despacho= " + Despacho ;
        
    
        }
    
    
    
}
