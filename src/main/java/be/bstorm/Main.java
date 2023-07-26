package be.bstorm;

import be.bstorm.demoPizza.Pizza;
import be.bstorm.demoPizza.PizzaHaway;
import be.bstorm.demoPizza.PizzaKefta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //region Permutation

//        String jules = "Jules";
//        String edouard = "Edouard";
//        String temp;
//
//        temp = jules;
//        jules = edouard;
//        edouard = temp;
//
//        System.out.println("jules : " + jules);
//        System.out.println("edouard : " + edouard);

        //endregion

        //region Iteration tableau

//        int[][] ints = new int[3][3];
//        ints[0][0] = 1;
//        ints[0][1] = 2;
//        ints[0][2] = 3;
//        ints[1][0] = 4;
//        ints[1][1] = 5;
//        ints[1][2] = 6;
//        ints[2][0] = 7;
//        ints[2][1] = 8;
//        ints[2][2] = 9;
//
//        for(int i = 0; i < ints.length; i++){
//
//            for(int j = 0; j < ints[i].length - 1 ; j++){
//
//                int temp = ints[i][j];
//                ints[i][j] = ints[i][j+1];
//                ints[i][j+1] = temp;
//            }
//        }
//
//        for(int[] tab : ints){
//
//            for (int i : tab){
//
//                System.out.print(i + " | ");
//            }
//            System.out.println();
//        }

        //endregion

        Pizza pizza = new PizzaKefta();
        System.out.println(pizza.getPrix());

        try {
            Pizza pasCool = new PizzaHaway();

        }catch (IllegalStateException ex){
            System.out.println(ex.getMessage());
            System.out.println("Fallait pas...");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println();



        System.out.println("Finito");
    }
}