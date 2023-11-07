/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._josemariah;

/**
 *
 * @author Usuario
 */
public class carro {
    private int numCarros;
  private String nombreEmpresa;
  private boolean abierta;
  private double capital;

  public void abrirEmpresa() {
    abierta = true;
    System.out.println("Abriendo empresa "+nombreEmpresa);
  }

  public int contratarEmpleados(int cantidad) {
    numCarros += cantidad;
    return numCarros;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public boolean estaAbierta() {
    return abierta;
  }
}
