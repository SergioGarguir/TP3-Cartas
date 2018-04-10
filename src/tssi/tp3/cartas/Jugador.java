/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas;

import java.util.Stack;

/**
 *
 * @author TechMDQ
 */
public class Jugador implements Runnable{

    private String nombre;
    private Stack<Carta> cartas;
    private boolean juegoTerminado=false;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new Stack<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        int puntos=0;
        for(int i=0;i<this.cartas.size();i++){
            puntos+=this.cartas.get(i).getNumero();
        }
        return puntos;
    }

    public void addCarta(Carta carta) {
        this.cartas.push(carta);
    }

    public Carta verCarta() {
        return this.cartas.peek();
    }

    public boolean hayCarta() {
        return this.cartas.empty();
    }

    @Override
    public void run() { /// while el juego no termino
        while(juegoTerminado=false){
            System.out.println("El jugador " + this.nombre + " acumula " + this.getPuntos());
        }
    }

}
