package com.example;
import java.util.Scanner;
public class semanacuatrolp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double valorCuenta, porcentajePropina, valorPropina, valorTotal;
System.out.println("----Ingresa el valor de tu cuenta:----");
valorCuenta= scanner.nextDouble();
System.out.println("----¿Que porcentaje de propina vas a dejar ?----");
porcentajePropina= scanner.nextDouble();

valorPropina=  valorCuenta * porcentajePropina /100;
valorTotal= valorPropina + valorCuenta;
System.out.println("----------FACTURA----------");
System.out.println("El valor de tu cuenta es: " + valorCuenta + " COP " );
System.out.println("El porcentaje de tu propina es: " + porcentajePropina + "%");
System.out.println("El valor de tu propina es: " + valorPropina + " COP");
System.out.println("El total a pagar es:" + valorTotal + " COP ");
System.out.println("gracias por visitarnos, regresa pronto.<3");

scanner.close();
    

       
    }
}