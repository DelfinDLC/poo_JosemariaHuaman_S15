/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._josemariah;

/**
 *
 * @author Usuario
 */
public class bombero {
    private int salvados;
  private String nombreBombero;
  private boolean Cargo;
  private double sueldo;

  public void salvadosPersonas() {
    salvados++; 
  }
  
  public int totalGoles() {
    return salvados;
  }

  public String getNombreJugador() {
    return nombreBombero;
  }

  public boolean esTitular() {
    return Cargo;
  }
}
