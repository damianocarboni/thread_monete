package com.example;

public class Persona extends Thread{
    Cestino c;
    int monete;
    public Persona(Cestino c, int monete){
        this.c = c;
        this.monete = monete;
    }
    
    public void run(){
        for(int i = 0; i < monete; i++)
            c.aggiungiMoneta();
    }
}
