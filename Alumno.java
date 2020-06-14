
package ejercicio;

public class Alumno {
    
private String codigo,nombre;
private int nota1, nota2 ;

public Alumno(){
    
}
public void registrar (String cod, String nom, int n1, int n2) {
    this.nombre = nom;
    this.codigo = cod;
    this.nota1 = n1;
    this.nota2 = n2;           
}  
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    
    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public double hallarPromedio(){
        double prom;
        prom =(nota1+nota2)/2.0;
        return prom;
    }
   public void mostrarPromedio(){
       System.out.println("Promedio" + hallarPromedio());
   }
    public String Cadena(){
        return("\ncodigo :"+ codigo + 
               "\nnombre :"+ nombre + 
               "\nnota 1 :"+ nota1+
               "\nnota 2 :"+ nota2 +
               "\npromedio : "+ hallarPromedio());
    }       

}

