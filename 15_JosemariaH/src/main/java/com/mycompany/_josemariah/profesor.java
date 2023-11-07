/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._josemariah;

/**
 *
 * @author Usuario
 */
public class profesor {
            
 private int numSalon;
  private String nombreMaestro;
  private boolean curso;
  private double precioMateriales;

  public void registrarCliente() {
    curso = true;
  }

  public int getNumHabitacion() {
    return numSalon;
  }

  public String getNombreHotel() {
    return nombreMaestro;
  }

  public boolean estaOcupada() {
    return curso;
  }

}

