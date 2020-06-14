package ejercicio;

import java.util.Scanner;

public class AplicaPila {
    
    static Scanner teclado = new Scanner(System.in);
    public static CPila Pila;
    static CPila p1 = new CPila();
public static void main (String [] args )   {
    MenuPila();
}

static void creaPila() {
    int tam;
    System.out.print("Ingrese tamaño de la pila :");
    tam = teclado.nextInt();
    Pila = new CPila(tam);
    System.out.println("pila creada .... \n");
}

public static void MenuPila() {
    int opcion;
    do{
     System.out.println("\n Menu de Opciones");
            System.out.println("=====================");
            System.out.println("[1] Crea Pila"); 
            System.out.println("======================");
            System.out.println("[2] Ingresar Datos ");
            System.out.println("[3] Mostrar Datos ");
            System.out.println("[4] Eliminar Datos");
            System.out.println("=======================");        
            System.out.println("0<- Salir");    
  System.out.print("\nIngrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            switch (opcion) {
                case 0:
                System.out.println("Saliendo del Sistema.....");
                 System.exit(0);
                break;
                
                case 1: 
                    creaPila();
                    break;
                case 2:
                    insertarPila();
                    break;
                
                case 3:
                    Pila.MostrarPila();
                    break;
                case 4: 
                    Pila.EliminarPila();
                    break;
                default:
                 System.out.println("Ingrese Opcion Correcta.....");
                 System.out.println("\n");
            }
        }while (opcion!=0);
        }
    static int pos = 0;
   static void insertarPila(){
         String codigo = "";
         String nombre = "";
         int n1 = 0,n2 = 0;
         
         
        if (p1.IsPilaLlena()) {
            System.out.println("La pila esta llena");      
     }else {
            System.out.print("Ingrese codigo: ");
            teclado.nextLine();
            codigo = teclado.nextLine();
            System.out.print("Ingrese nombre :");
            nombre=teclado.nextLine();
           do {
             System.out.print("Ingrese nota 1:"); 
             n1=teclado.nextInt();
             
             if(n1>20 || n1<0)
               System.out.println("Error al ingresar la nota");
           }
             while   
             (n1>20 || n1<0);
        }
        do {
             System.out.print("Ingrese nota 2:"); 
             n2=teclado.nextInt();
             
             if(n2>20 || n2<0)
               System.out.println("Error al ingresar la nota");
           }
             while(n2>20 || n2<0);
        
        Pila.InsertarPila(pos,codigo,nombre,n1,n2);
        pos++;
        }
    
}
           