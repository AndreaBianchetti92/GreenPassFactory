package Esercizio3.vaccine;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<GreenPass> greenPassList = new ArrayList<>();
    private String nome;
    private String cognome;

    public Person(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getFullName(){
        return getNome() + " " + getCognome();
    }
    public GreenPass vaccinate(){
        int durata;
        if(greenPassList.size()== 0){
            durata = -180;
        }else{
            durata = 270;
        }
        System.out.println("\n-------------");
        System.out.println("Vaccinazione n." + (greenPassList.size()+1) + " di " + getFullName());
        GreenPass gp = new GreenPass (durata){};
        greenPassList.add(gp);
        return gp;
    }

    public boolean isMine(GreenPass g){
        return greenPassList.contains(g);
    }
}
