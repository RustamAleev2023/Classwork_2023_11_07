import entity.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
        task4();
    }

    //Task1
    public static void task1(){
        Person person = new Person("Иванов Иван Иванович",
                "15.11.2000",
                "322-223-322",
                "Kaliningrad",
                "Russia",
                "Mira 23 - 11");
        System.out.println(person);
    }

    //Task2
    public static void task2(){
        City city = new City("Kaliningrad",
                "Kaliningrad reg",
                "Russia",
                500_000L,
                236000,
                4012);
        System.out.println(city);
    }

    //Task3
    public static void task3(){
        Country country = new Country("Russia",
                "Eurasia",
                180_000_000L,
                007,
                "Moscow",
                new String[]{"Moscow", "Kaliningrad", "Samara", "Novgorod", "Krasnodar"});

        System.out.println(country);
    }


    //Task4
    public static void task4(){
        Fraction fraction1 = new Fraction(10, 2, Operation.add);
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(10, 2, Operation.subtract);
        System.out.println(fraction2);
        Fraction fraction3 = new Fraction(10, 2, Operation.multiply);
        System.out.println(fraction3);
        Fraction fraction4 = new Fraction(10, 2, Operation.division);
        System.out.println(fraction4);
    }



}