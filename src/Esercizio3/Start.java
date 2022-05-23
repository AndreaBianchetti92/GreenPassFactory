package Esercizio3;

public class Start {
    public static void main(String[] args) {
        Person andrea = new Person("Andrea", "Bianchetti");
        Person francesca = new Person("Francesca", "Lella");

        System.out.println(andrea.vaccinate().isValid());
        System.out.println("-------------");

        andrea.vaccinate();
        andrea.vaccinate();

        francesca.vaccinate();
        francesca.vaccinate();

        GreenPass gpa = andrea.vaccinate();
        GreenPass gpf = francesca.vaccinate();

        System.out.println(gpa.belongsTo(andrea));
        System.out.println(gpa.belongsTo(francesca));

        System.out.println(gpf.belongsTo(andrea));
        System.out.println(gpf.belongsTo(francesca));

        System.out.println(andrea.vaccinate().isValid());

    }
}
