package VaccineDateExercise.vaccine;


import VaccineDateExercise.Utilities.DataFormatter;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class GreenPass {
    private static long sequenceNumber;
    private final long id;
    private final int durata;
    private final Instant dataVaccinazione;

    protected GreenPass(int quantoDura) {
        this.durata = quantoDura;
        this.dataVaccinazione = Instant.now();
        this.id = sequenceNumber++;
        System.out.println("ID vaccino: "+ getId());
        System.out.println("Effettuato il vaccino in data "+ DataFormatter.format(getDataVaccinazione()));
        System.out.println("Il vaccino scade in data "+
                DataFormatter.format(getDataVaccinazione().plus(durata, ChronoUnit.DAYS)
        ));
        System.out.println("-------------");
    }

    public String getId() {
        return String.format("%09d", id);
    }

    public int getDurata() {
        return durata;
    }

    public Instant getDataVaccinazione() {
        return dataVaccinazione;
    }


    public boolean isValid(){
        return Instant.now().compareTo(getDataVaccinazione().plus(durata, ChronoUnit.DAYS)) < 0;
    }

    public boolean belongsTo(Person person){
        return person.isMine(this);
    }


}
