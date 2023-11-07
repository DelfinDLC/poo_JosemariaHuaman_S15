/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._josemariah;

/**
 *
 * @author Usuario
 */
public class main {
    
  private int horasEstudio;
  private String nombreMateria;
  private boolean aprobada;
  private double notaFinal;

  public void estudiar(int horas) {
    horasEstudio += horas;
  }

  public int getHorasEstudio() {
    return horasEstudio; 
  }

  public String getNombreMateria() {
    return nombreMateria;
  }

  public void aprobarMateria() {
    aprobada = true;
  }

  public void setNotaFinal(double nota) {
    notaFinal = nota;
  }

  public double getNotaFinal() {
    return notaFinal;
  }

  public boolean estaAprobada() {
    return aprobada;
  }

}

