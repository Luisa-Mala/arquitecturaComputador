
import java.util.Scanner;

public class Primalidad {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa encuentra si un numero es primo o no");
        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();

        boolean primo =true;
        if (numero>1){
            for (int contador = 2 ; contador != numero-1 ; contador++){
                if (numero % contador == 0) {
                    if (numero != 2) {
                        primo = false;
                    }
                    break;
                }
            }
            if (primo){
                System.out.println("El numero "+numero+" es primo");
            }
            else {
                System.out.println("El numero "+numero+" no es primo");
            }
        }
        else {
            System.out.println("El numero "+numero+" no es primo");
        }

    }
}
