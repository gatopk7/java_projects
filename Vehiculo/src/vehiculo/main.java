/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import java.util.Scanner;

/**
 *
 * @author gatopk
 */
public class main {
    private Scanner s = new Scanner(System.in);
    private int e = 0;
    String [] TestEstacionamiento = {"0","0","0","0","0","0","0"};
        
    public static void main(String[] args) {
        main m = new main();
        m.menu();
    }

    
    public void menu(){
        int op =1;
        
        do{
            System.out.println("seleccione una de las siguinetes opcipnes ");
            System.out.println("0 Salir");
            System.out.println("1 Abrir estacionamiento");
            System.out.println("2 Asiganar lugar");
            System.out.println("3 Mover de lugar");
            System.out.println("4 Cambiar datos");
            System.out.println("5 Retirar vehiculo");
            System.out.println("6 mostrar datos");
            System.out.println("7 Cerrar estacionamiento");
            
            op = s.nextInt();
            
            switch (op) {
                case 0: Salir();break;
                case 1: Abrir();break;
                case 2: Asignar();break;
                case 3: Mover();break;
                case 4: Cambiar();break;
                case 5: Retirar();break;
                case 6: Mostrar();break;
                case 7: Cerrar();break;
                default: System.out.println("Opcion no valida");
            }

        }while(op!=0);
    }

    private void Salir() {
        System.out.println("Saliendo");
    }

    private void Abrir() {
        if(e==0){
            System.out.println("Abiriendo estacionamiento");
            e++;
        }else if(e==1){
            System.out.println("Ya esta abierto");
        }else{
            System.out.println("Error");
        }
    }
    
    public void Mostrar(){
        if(e==1){  
            for(int i=0; i<TestEstacionamiento.length; i++){
                System.out.println(TestEstacionamiento[i]);
            }
            

        }else{
            System.out.println("El estacionamiento esta cerrado");
        }

    }
    
    public void Asignar(){
        if(e==1){
            int lugar;
            String marca, color, kilometraje, matricula;
            
            System.out.println("en que lugar");
            lugar =s.nextInt();
            
            if(TestEstacionamiento[lugar].contains("0")){
                System.out.println("cual es la marca");
                marca = s.next();
                System.out.println("cual es el color");
                color = s.next();
                System.out.println("cual es el kilometraje");
                kilometraje = s.next();
                System.out.println("cual es la matricula");
                matricula =s.next();

                TestEstacionamiento[lugar]= marca + " " + color + " " + kilometraje + " " + matricula;
                System.out.println("se ha asigando el lugar");
            }else{
                System.out.println("El ligar ya esta ocupado");
            }
    
        }else{
            System.out.println("El estacionamiento es cerrado");
        }
        
    }
    
    public void Retirar(){
        if(e==1){

            int l;
            System.out.println("En que lugar esta su carro");
            l = s.nextInt();
            if(!(TestEstacionamiento[l].contains("0"))){
                TestEstacionamiento[l] = "0";
            }else{
                System.out.println("El lugar esta vacio");
            }

        }else{
            System.out.println("El estacionamiento esta cerrado");
        }
    
    }
    
    public void Cambiar(){
        if(e==1){
            int l;
            String marca, color, kilometraje, matricula;
            System.out.println("En que lugar esta el carro a modicar");
            l = s.nextInt();
            if(!(TestEstacionamiento[l].contains("0"))){
                System.out.println("cual es la marca");
                marca = s.next();
                System.out.println("cual es el color");
                color = s.next();
                System.out.println("cual es el kilometraje");
                kilometraje = s.next();
                System.out.println("cual es la matricula");
                matricula =s.next();

                TestEstacionamiento[l]= marca + " " + color + " " + kilometraje + " " + matricula;
                System.out.println("se ha modicado correctamente");
            }else{
                System.out.println("No hay ningun carro");
            }
        }else{
            System.out.println("El estacionamiento esta cerrado");
        }
    
    }

    public void Mover(){
        if(e==1){
            int m;
            int m2;
            String aux;
            System.out.println("En que lugar esta el carro a mover");
            m = s.nextInt();
            if(!(TestEstacionamiento[m].contains("0"))){
                System.out.println("A que lugar lo quieres mover");
                m2 = s.nextInt();
                if(TestEstacionamiento[m2].contains("0")){
                    aux = TestEstacionamiento[m];
                    TestEstacionamiento[m2] = aux;
                    TestEstacionamiento[m] = "0";
                }else{
                    System.out.println("El lugar esata ocupado");
                }
            }else{
                System.out.println("No hay ningun carro");
            }
        
        }else{
            System.out.println("El estacionamiento esta cerrado");
        }
    }
    
    private void Cerrar() {
        if(e==1){
            System.out.println("Cerrando estacionamiento");
            e--;
        }else if(e==0){
            System.out.println("Ya esta cerrado");
        }else {
            System.out.println("Error");
        }
    }
    
}