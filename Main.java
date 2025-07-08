/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helen.proyectofinalhelen;
 
/**
 *
 * @author helen
 */
//Autor:Helen Serrano - Proyecto Final - Julio 2025

import java.util.Scanner;

//esta es la clase principal, la que ejecuta todo el programa.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList miLista = new TodoList();
        int opcion;

//este bloque se repite sucesivamente hasta que el usuario decida salirse.
        do {
            System.out.println("\n----------------------");
            System.out.println("      TO-DO LIST");
            System.out.println("----------------------");
            System.out.println("1.Ver Tareas:");
            System.out.println("2.Agregar Tareas:");
            System.out.println("3.Marcar Tarea completada.");
            System.out.println("4.Eliminar tarea.");
            System.out.println("5.Salir.");
            System.out.println("Elige una opcion: ");

            //este metodo asegura de que el usuario escriba un numero de opcion.
            while (!sc.hasNextInt()) {
                System.out.println("Ingresa un numero valido: ");
                sc.next(); //esto descarta lo que escribio mal.
            }

            opcion = sc.nextInt(); //Guardamos la opcion elegida
            sc.nextLine(); // esto limpia el enter pendiente

            switch (opcion) {

                case 1:
                    miLista.verTareas();
                    break;

                case 2:
                    System.out.println( " Descripcion de la tarea: ");
                    String desc = sc.nextLine();
                    miLista.agregarTarea(desc);
                    break;

                case 3:
                    System.out.println("Numero de tarea a marcar: ");
                    int completar= sc.nextInt() -1;
                    miLista.marcarComoCompletada(completar);
                    break;

                case 4:
                    System.out.println("Numero de tarea a eliminar: ");
                    int eliminar = sc.nextInt() -1;
                    miLista.eliminarTarea(eliminar);
                    break;

                case 5:
                    System.out.println("bye bora la tambora.");
                    break;

                default:
                    System.out.println("Opcion no valida. ");
            }
        }  while (opcion != 5); //el programa sigue hasta que el usuario decida salir.

        sc.close();
    }
}
