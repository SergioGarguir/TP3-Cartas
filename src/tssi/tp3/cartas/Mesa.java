/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas;

import java.util.Stack;

/**
 *
 * @author TechMDQNet
 */
public class Mesa {

    private Stack<Carta> cartaEnMesa;
    private Baraja baraja = new Baraja();

    public Mesa() {
        this.cartaEnMesa = new Stack<>();
        this.baraja.mezclarBaraja();
    }

    public Stack<Carta> getCartaEnMesa() {
        return cartaEnMesa;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setCartaEnMesa(Stack<Carta> cartaEnMesa) {
        this.cartaEnMesa = cartaEnMesa;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public synchronized Carta get() {
        while (this.cartaEnMesa.empty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Mesa - Error en get!!!!->" + e.getMessage());
            }
        }
        notify();
        return this.cartaEnMesa.pop();
    }

    public synchronized void put() {
        while (!this.cartaEnMesa.empty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Mesa - Error en put!!!! ->" + e.getMessage());
            }
        }
        this.cartaEnMesa.push(baraja.darCarta());
        notify();
    }
}
