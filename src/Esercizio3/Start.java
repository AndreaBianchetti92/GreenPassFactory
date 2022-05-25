package Esercizio3;

import Esercizio3.vaccine.GreenPass;
import Esercizio3.vaccine.Person;

public class Start {
    public static void main(String[] args) {
        Person andrea = new Person("Andrea", "Bianchetti");
        Person francesca = new Person("Francesca", "Lella");

        GreenPass primoVaccinoAndrea = andrea.vaccinate();
        System.out.printf("------------%n" +
                        "Il GreenPass con id: %s%n di %s è valido %s.%n" +
                        "------------%n",
                primoVaccinoAndrea.getId(),
                andrea.getFullName(),
                primoVaccinoAndrea.isValid()
        );


        andrea.vaccinate();
        andrea.vaccinate();

        francesca.vaccinate();
        francesca.vaccinate();

        GreenPass ultimoVaccinoAndrea = andrea.vaccinate();


        System.out.println("Il vaccino di Andrea appartiene ad Andrea: " + ultimoVaccinoAndrea.belongsTo(andrea));
        System.out.println("Il vaccino di Andrea appartiene a Francesca: " + ultimoVaccinoAndrea.belongsTo(francesca));

        System.out.printf("------------%n" +
                        "Il GreenPass con id: %s%n di %s è valido %s.%n" +
                        "------------%n",
                ultimoVaccinoAndrea.getId(),
                andrea.getFullName(),
                ultimoVaccinoAndrea.isValid()
        );

        System.out.println("La prima dose scade 180 giorni prima di averla fatta.\n" +
                "La seconda scade 270 giorni dopo averla fatta.");
    }
}
