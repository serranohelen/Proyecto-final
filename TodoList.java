/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helen.proyectofinalhelen;
 
/**
 *
 * @author dario
 */
import java.util.ArrayList;

//esta clase guarda todas las tareas en una lista.
//y tambien tiene metodos para verlas, agregarlas completarlas o eliminarlas.
public class TodoList {
    ArrayList<Tarea> lista = new ArrayList<>();


    public void verTareas() {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas.");

            //se asegura de que el numero que escribioel usuario corresponda a una tarea que si existe
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i).mostrar());
            }
        }
    }

    public void agregarTarea (String desc) {
        lista.add(new Tarea(desc));
        System.out.println("Tarea agregada.");
    }

    public void marcarComoCompletada(int indice) {
        if (indice >=0 && indice < lista.size()) {
            lista.get(indice).marcaComoCompletada();
            System.out.println("Tarea completada.");

        }else {
            System.out.println("Numero invalido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println(" Tarea eliminada.");

        }else {
            System.out.println("Numero invalido.");
        }
    }
}