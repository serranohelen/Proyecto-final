/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helen.proyectofinalhelen;
 

//Autor:Helen Serrano - Proyecto Final - Julio 2025

//Esta clase Tarea tiene una descripcion y un estado (que avisa si esta completada o no)
public class Tarea {
    String descripcion;
    boolean completada;

    public Tarea (String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void marcaComoCompletada() {
        this.completada = true;
    }

//este metodo devuelve el texto que se va a mostrar en pantalla.
    // si esta completada aparece [x] , y sino con [ ]
    public String mostrar() {
        return (completada ? "[X]" : " [ ] ") + descripcion;
    }
}