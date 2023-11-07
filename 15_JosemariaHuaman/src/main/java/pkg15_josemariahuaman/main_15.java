/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pkg15_josemariahuaman;

/**
 *
 * @author Usuario
 */
public class main_15 {

  private int capacidadMaxima;
  private String modeloCoche;
  private boolean enMarcha;
  private double kmsRecorridos;

  public void arrancarCoche() {
    enMarcha = true;
  }

  public int recorrerKMs(int kms) {
    kmsRecorridos += kms;
    return kmsRecorridos;
  }

  public String getModeloCoche() {
    return modeloCoche;
  }

  public boolean estaEnMarcha() {
    return enMarcha;
  }

}

