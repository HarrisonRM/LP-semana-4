package com.example;

import java.util.Scanner;

public class semanacuatrolp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCuenta, porcentajePropina, valorPropina, valorTotal;
        System.out.println("----Ingresa el valor de tu cuenta:----");
        valorCuenta = scanner.nextDouble();
        System.out.println("----¿Que porcentaje de propina vas a dejar ?----");
        porcentajePropina = scanner.nextDouble();

        valorPropina = valorCuenta * porcentajePropina / 100;
        valorTotal = valorPropina + valorCuenta;
        System.out.println("----------FACTURA----------");
        System.out.println("El valor de tu cuenta es: " + valorCuenta + " COP ");
        System.out.println("El porcentaje de tu propina es: " + porcentajePropina + "%");
        System.out.println("El valor de tu propina es: " + valorPropina + " COP");
        System.out.println("El total a pagar es:" + valorTotal + " COP ");
        System.out.println("gracias por visitarnos, regresa pronto.<3");
        System.out.println("/////////////////////////////////////////////////////");

        Scanner scanner2 = new Scanner(System.in);
        double distancia, tiempoEspera, precioTotal, precioDistancia, precioTiempo;
        System.out.println("Ingresa la distancia recorrida en kilometros: ");
        distancia = scanner2.nextDouble();
        System.out.println("Ingresa el tiempo de espera en minutos: ");
        tiempoEspera = scanner2.nextDouble();
        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;
        precioDistancia = distancia * valorKilometro;
        precioTiempo = tiempoEspera * valorMinuto;
        precioTotal = precioDistancia + precioTiempo + tarifaBase;
        String precio = "precioTotal";
        double valor = precioTotal;
        String mensaje = String.format("----El precio de tu viaje es $%.2f COP----", valor);

        System.out.println(mensaje);
        System.out.println("/////////////////////////////////////////////////////");

        scanner2.close();

        scanner.close();

    }
}