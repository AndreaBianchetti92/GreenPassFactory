package Esercizio3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String nome;
    String cognome;
    List<GreenPass> greenPassList = new ArrayList<>();

    public Person(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public GreenPass vaccinate(){
        int durata;
        if(greenPassList.size()== 0){
            durata = -180;
        }else{
            durata = 270;
        }
        System.out.println("\n-------------");
        System.out.println("Vaccinazione n." + (greenPassList.size()+1) + " di " + nome + " " + cognome);
        GreenPass gp = new GreenPass (durata);
        greenPassList.add(gp);
        return gp;
    }

    public boolean isMine(GreenPass g){
        return greenPassList.contains(g);
    }
}
