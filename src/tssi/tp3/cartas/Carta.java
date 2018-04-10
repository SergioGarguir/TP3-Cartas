/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas;

import java.util.HashMap;

/**
 *
 * @author TechMDQ
 */
public class Carta {

    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String cad = (numero < 10) ? " " : "";
        return "Carta: " + cad + numero + " de " + palo;
    }
}
