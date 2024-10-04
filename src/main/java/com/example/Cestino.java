package com.example;

public class Cestino extends Thread{
    int contatore;

    
    public Cestino(int contatore) {
        this.contatore = contatore;
    }

    public int getContatore() {
        return contatore;
    }
    
    public void aggiungiMoneta(){
        contatore++;
    }
}
