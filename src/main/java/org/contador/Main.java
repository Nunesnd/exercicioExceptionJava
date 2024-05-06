package org.contador;

import org.contador.classes.ExcessaoNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lerNumero = new Scanner(System.in);
        try {

            System.out.printf("Digite o primeiro número: ");
            int numero1 = Integer.parseInt(lerNumero.next());

            System.out.printf("Digite o segundo número: ");
            int numero2 = Integer.parseInt(lerNumero.next());

            conta(numero1, numero2);

        } catch (ExcessaoNumeros e) {
            System.out.println("Primeiro número deve ser menor que o segundo");
        }
    }

    static void conta(int num1, int num2) throws ExcessaoNumeros{
        if (num1<num2){

            System.out.println("Contagem regressiva.");
            for (int diferenca = num2-num1; diferenca!=0; diferenca--){
                System.out.println(diferenca);
            }

        } else {
            throw new ExcessaoNumeros();
        }

    }
}
