import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = lectura.next();

        System.out.println("Ingrese su apellido");
        String lastname = lectura.next();

        System.out.println("Ingrese su edad");
        int age = lectura.nextInt();

        System.out.println("Ingrese un hobbie");
        String hobbie = lectura.next();

        System.out.println("Ingrese su editor de codigo preferido");
        String edcod = lectura.next();

        System.out.print("Ingrese el sistema operativo que utiliza habitualmente\n");
        String sistop = lectura.next();

        System.out.println("Usted ingresó: " + nombre + " " + lastname + " " +age+ " " +hobbie+ " " +edcod+" " + sistop);

    }
}
