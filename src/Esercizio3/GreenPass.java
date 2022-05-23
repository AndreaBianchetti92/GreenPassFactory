package Esercizio3;


import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class GreenPass {
    private static long sequenceNumber;
    long id;
    int durata;
    Instant dataVaccinazione;

    public GreenPass(int quantoDura) {
        this.durata = quantoDura;
        this.dataVaccinazione = Instant.now();
        this.id = sequenceNumber++;
        System.out.println("ID vaccino: "+ id);
        System.out.println("Effettuato il vaccino in data "+ dataVaccinazione.toString());
        System.out.println("Il vaccino scade in data "+ (dataVaccinazione.plus(durata, ChronoUnit.DAYS)));
        System.out.println("-------------");
    }


    public boolean isValid(){

        return Instant.now().compareTo(dataVaccinazione.plus(durata, ChronoUnit.DAYS)) < 0;
    }

    public boolean belongsTo(Person person){
        return person.isMine(this);
    }


}
