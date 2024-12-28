package estructuraDeDatos;

import java.util.Scanner;

class Nodo {

    public Nodo Anterior;
    public Persona p;
    public Nodo Siguirnte;

    public Nodo(Persona p) {
        this.p = p;
    }

}

class Persona {

    private String curp;
    private int edad;

    public Persona() {

    }

    private Persona(String curp, int edad) {
        this.curp = curp;
        this.edad = edad;
    }

    public void SetCurp(String curp) {
        this.curp = curp;
    }

    public void Setedad(int edad) {
        this.edad = edad;
    }

    public String ToString() {
        return "Persona = ( curp =" + curp + " edad=" + edad + ")";
    }

}

class Lista {

    public Nodo Primero;
    public Nodo Ultimo;
    private int contador = 0;

    public void agregar(Nodo nuevo) {
        if (contador == 0) {
            Ultimo = nuevo;
            Primero = nuevo;
            contador++;
        } else if (contador > 0) {
            Ultimo.Siguirnte = nuevo;
            Ultimo = nuevo;
            contador++;
        }
        System.out.println("Persona agregada");
    }

    public void mostrar() {
        Nodo aux;
        aux= Primero;
        do {
            System.out.print(aux.p.ToString() + "->");
            aux = aux.Siguirnte;

        } while (aux != null);
    }
}

public class Nodos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        Persona p = null;
        int op = 1;
        do {
            System.out.println("seleccione una de las siguientes opciones");
            System.out.println("0 salir\n"
                    + "1 agregar\n"
                    + "2 mostrar");
            op = s.nextInt();

            switch (op) {
                case 0: {
                    break;
                }
                case 1: {
                    p = new Persona();
                    System.out.println("Cual es la curp");
                    p.SetCurp(s.next());
                    System.out.println("cual es tuedad");
                    p.Setedad(s.nextInt());

                    lista.agregar(new Nodo(p));
                    break;
                }
                case 2: {
                    lista.mostrar();
                    break;
                }
                default:
                    System.out.println("esa opcion no esta disponible");
            }
        } while (op != 0);

    }
}
