/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TechMDQ
 */
public class TSSITP3Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant_jug;
        String nombreJugador;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Jugador> jug = new ArrayList<>();
        System.out.println("Ingrese cantidad de Jugadores: ");
        cant_jug = entrada.nextInt(); // limitar ingreso de 2 a 4
        entrada = new Scanner(System.in);
        Jugador jugador = null;
        for (int i = 1; i <= cant_jug; i++) {
            System.out.println("Ingrese Nombre del Jugador " + i + ": ");
            nombreJugador = entrada.nextLine();
            jugador = new Jugador(nombreJugador);
            jug.add(jugador);
        }

    }

}
