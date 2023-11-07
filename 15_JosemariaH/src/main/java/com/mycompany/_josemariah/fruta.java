/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._josemariah;

/**
 *
 * @author Usuario
 */
public class fruta {
    private int cantidad;
  private String nombreProducto;
  private boolean perecedero;
  private double precioUnitario;

  public void venderProducto(int cantidadVendida) {
    cantidad -= cantidadVendida;
  }

  public int recibirInventario(int unidades) {
    cantidad += unidades;
    return cantidad;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public boolean esPerecedero() {
    return perecedero;
  }
}
