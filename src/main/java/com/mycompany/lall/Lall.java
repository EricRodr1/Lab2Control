/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lall;
 import java.util.Scanner;
/**
 *
 * @author hyoyo
 */
public class Lall {

    public static void main(String[] args) {
 //Cadena
        Scanner sc = new Scanner(System.in);
        System.out.println("Favor ingresar cadena de texto: ");
        String cadena = sc.nextLine();
        
        int frecuencia[] = new int[256];
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            frecuencia[caracter]++;
        }
        
        char caracterRepetido = ' ';
        int maximaFrecuencia = 0;
        
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maximaFrecuencia) {
                maximaFrecuencia = frecuencia[i];
                caracterRepetido = (char) i;
            }
        }
        
        System.out.println("El carácter que más se repite es '" + caracterRepetido + "' con " + maximaFrecuencia + " repeticiones.");
        
        //Notas
        int totnotas;
        do {
            System.out.print("Ingresar la cantidad de notas (solo positivo): ");
            totnotas = sc.nextInt();
        } while (totnotas <= 0);

        double[] notas = new double[totnotas];
        double suma = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;

     
        for (int i = 0; i < totnotas; i++) {
            double nota;
            do {
                System.out.print("Nota #" + (i + 1) + ": ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 100) {
                    System.out.println("Solo acepta notas dentro del rango 0 a 100.");
                }
            } while (nota < 0 && nota > 100);
            notas[i] = nota;
            suma += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }

        double promedio = suma / totnotas;
        System.out.printf("Promedio: %.2f %%\n", promedio);
        System.out.printf("Nota mayor: %.2f\n", notaMayor);
        System.out.printf("Nota menor: %.2f\n", notaMenor);
        
        //CLASES
        System.out.println("Favor ingresar la fecha: ");
        String fechactual = sc.nextLine().toLowerCase();
        
        String[] partes = fechactual.split(", ");
        if (partes.length != 2) {
            System.out.println("No es el formato de fecha correcto.");
            return;
        }
        String diadesemana = partes[0];
        String[] diadelmes = partes[].split("/");
        
        if (diadelmes != 2) {
            System.out.println("No es el formato de fecha correcto.");
            return;
 //No pude seguirlo
        

        
    }
}

        





           
           
           
}
}



    

