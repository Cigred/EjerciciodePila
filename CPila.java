package ejercicio;

import java.util.Scanner;

public class CPila {
    int tope;
    int max;
    Alumno [] pila;
    Alumno Alum = new Alumno();
    static Scanner teclado = new Scanner (System.in);  
    public CPila( int max){
        this.tope = 0;
        this.max = max;
        this.pila = new Alumno [this.max + 1];   
        for (int i = 0; i<this.max+1; i++ ){
            pila[i] = new Alumno();
        }
    }
    public CPila (){
        this.tope = 0;
        this.max = 100;
        this.pila = new Alumno[this.max + 1];      
    }
    public int getTope(){
        return tope = 0;        
    }
    public boolean IsPilaLlena(){
        if (this.max == this.tope){
            return true;   
        }else {
            return false;
        }
    }
    public boolean IsPilaVacia(){
        if(this.tope== 0) {
            return true;
        }else {
            return false ;
        }
    }
     public void InsertarPila(int pos, String codigo, String nombre, int nota1, int nota2){
         pila[pos].registrar(codigo,nombre,nota1,nota2);
         tope++;
        }
    public void MostrarPila() {
       if (this.IsPilaVacia()){
        System.out.println( "pila esta vacia");
     }else {
          for (int i=0; i<tope; i++){
              System.out.println(pila[i].Cadena());
          }
       }
    }
    public void EliminarPila(){    
        if (this.IsPilaVacia()){
        System.out.println( "pila esta vacia");
     }else {
            this.tope--;
    System.out.println( "Eliminacion correcta");  
    }
}
}
            

