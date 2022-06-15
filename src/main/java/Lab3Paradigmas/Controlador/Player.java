package Lab3Paradigmas.Controlador;

import java.util.ArrayList;
import java.util.List;

public class Player implements Jugador {
    String nombre;
    List<Card> mano;
    List<Card> cartasGanadas;
    int ID;

    public Player(String nombre){
        this.nombre = nombre;
        this.cartasGanadas = new ArrayList<Card>();
        this.mano = new ArrayList<>();
    }

    @Override
    public void recogerCarta(Card carta) {
        this.mano.add(carta);
    }

    @Override
    public void jugar() {

    }

    @Override
    public void verJugadas() {

    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + mano +
                '}';
    }
    @Override
    public Card verCartasGanadas() {
        return null;
    }
}

