/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author TechMDQ
 */
public class Baraja {

    private Stack<Carta> cartasEnJuego;
    private ArrayList<Carta> cartasUsadas;

    public Baraja() {
        cartasEnJuego = new Stack<Carta>();
        cartasUsadas = new ArrayList<Carta>();
        armoMazo();
    }

    public void mezclarBaraja() {
        int i;
        while (cartasUsadas.size() > 0) {
            i = randomRango(0, cartasUsadas.size());
            cartasEnJuego.push(cartasUsadas.get(i));
            cartasUsadas.remove(i);
        }
        //Collections.shuffle(cartasUsadas);
    }

    private void armoMazo() {
        String[] palos = {Util.ESPADA, Util.ORO, Util.BASTO, Util.COPA};

        for (String palo : palos) {
            for (int j = 1; j < 13; j++) {
                Carta carta = new Carta(palo, j);
                guardarCartaUsada(carta);
            }
        }
    }

    public void guardarCartaUsada(Carta carta) {
        cartasUsadas.add(carta);
    }

    public Boolean hayCarta() {
        return !cartasEnJuego.empty();
    }

    public void descarto() {
        guardarCartaUsada(cartasEnJuego.pop());
    }

    public Carta darCarta() {
        return cartasEnJuego.pop();
    }

    public String mostrarBaraja() {
        return cartasEnJuego.peek().toString();
    }

    private int randomRango(int min, int max) {
        int n = (int) (Math.random() * (max - min) + min);
        return n;
    }
}
