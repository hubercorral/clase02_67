package co.edu;
import java.net.SocketPermission;
import java.util.Scanner;

public class ejercicio1 {

public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int dia, mes, año, suerte, suma, calc1, calc2, calc3, calc4;

    System.out.println(x: "Introduzca su fecha de nacimiento para obtener su dia de la suerte");
    System.out.print(s: "dia: " );
    dia =sc.nextInt();
    System.out.print(s: "mes: " );
    mes =sc.nextInt();
    System.out.print(s: "año: " );
    año =sc.nextInt();

    suma = dia + mes + año;

    calc1 = suma/1000;
    calc2 = suma /100%10;
    calc3 = suma /10%10;
    calc4 = suma %10;

    suerte = calc1 +calc2 +calc3 + calc4;

    System.out.println("su numero de suerte es : " + suerte);
    }
    
}
