package class_obj;

<<<<<<< HEAD

=======
import java.util.Random;
>>>>>>> 7fb8d60301bc7c90cdb38bd66709689d91369d5b

public class Main {

    public static void main(String[] args) {

//        Dog dog=new Dog();
//        dog.walk(10);
//        dog.speak();

<<<<<<< HEAD
        //Duck myDuck = new Duck();
//        System.out.println(myDuck.hashCode());
//        myDuck.f//  Duck yourDuck = new Duck();
=======
//        Duck myDuck = new Duck();
//        System.out.println(myDuck.hashCode());
//        myDuck.fly(5);

//        Duck yourDuck = new Duck();
>>>>>>> 7fb8d60301bc7c90cdb38bd66709689d91369d5b
//        yourDuck.walk(20);
//        System.out.println(yourDuck.hashCode());
//        yourDuck.duckAge = 3;

//        System.out.println(yourDuck.duckAge);
//        System.out.println(myDuck.duckAge);

//        yourDuck.setDuckAge(6,"Priya");
//        int myDuckAge = yourDuck.getAge();
//        System.out.println(myDuckAge);
<<<<<<< HEAD
        Snail SmallSnail=new Snail();
        SmallSnail.waited(20);
    SmallSnail.moved(30);
        Snail BigSnail=new Snail();
        BigSnail.waited(30);
        System.out.println(BigSnail.PasswordToOpen);
        System.out.println(SmallSnail.PassworrdToOpen);
        BigSnail.setPasswordToOpen(wed4,"priya");
        int SmallSnail=BigSnail.getPasswordToOpen();
        System.out.println(SmallSnail);
=======


//        Duck d1 = new Duck();
//        Duck d2 = new Duck();
//        Duck d3 = new Duck();
//        Duck d4 = new Duck();


//        d1.setDuckAge(2, "priya");
//        d2.setDuckAge(5, "priya");
//        d3.setDuckAge(7, "Amitabh1");
//        d4.setDuckAge(30, "priya");
//
//        System.out.println(d1.getAge());
//        System.out.println(d2.getAge());
//        System.out.println(d3.getAge());
//        System.out.println(d4.getAge());

        Random dfasdfas = new Random();
        Duck[] abc = new Duck[5];

        for (int i = 0; i < 5; i++) {
            Duck temp = new Duck();
            temp.setDuckAge(dfasdfas.nextInt(150), "Amitabh");
            abc[i] = temp;
        }


        for (int i = 0; i < abc.length; i++) {
            Duck tempDuck = abc[i];
            System.out.println(tempDuck.getAge());
        }



>>>>>>> 7fb8d60301bc7c90cdb38bd66709689d91369d5b

    }
}
