package com.bichinhos.desafioArraySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre 'crescente' ou 'decrescente' qual lista voce ordenará ? ");
        String optionBetweenCrescenteAndDescrecente = scanner.nextLine();

        int[] inputFromUser = new int[5];

        if (optionBetweenCrescenteAndDescrecente.equals("Crescente") || optionBetweenCrescenteAndDescrecente.equals("crescente")){
            System.out.println("Insira a lista decrescente com 5 numeros no total, digite o numero e aperte enter: ");
            for (int i = 0; i < inputFromUser.length; i++){
                inputFromUser[i] = scanner.nextInt();
            }
            for (int i = 0; i < inputFromUser.length - 1; i++){
                for (int j = 0; j < inputFromUser.length - 1; j++){
                    if (inputFromUser[j] > inputFromUser[j + 1]){
                        int temp = inputFromUser[j + 1];
                        inputFromUser[j + 1] = inputFromUser[j];
                        inputFromUser[j] = temp;
                    }
                }
            }
        } else if(optionBetweenCrescenteAndDescrecente.equals("Decrescente") || optionBetweenCrescenteAndDescrecente.equals("decrescente")){
            System.out.println("Insira a lista crescente com 5 numeros no total, digite o numero e aperte enter: ");
            for (int i = 0; i < inputFromUser.length; i++){
                inputFromUser[i] = scanner.nextInt();
            }
            for (int i = 0; i < inputFromUser.length - 1; i++){
                for (int j = 0; j < inputFromUser.length - 1; j++){
                    if (inputFromUser[j] < inputFromUser[j + 1]){
                        int temp = inputFromUser[j + 1];
                        inputFromUser[j + 1] = inputFromUser[j];
                        inputFromUser[j] = temp;
                    }
                }
            }
        }
        System.out.println("Após a transformação a lista ficara dessa forma: ");
        for (int inputFromUsers: inputFromUser){
            System.out.println(inputFromUsers);
        }
    }
}
