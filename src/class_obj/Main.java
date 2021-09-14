package class_obj;



public class Main {

    public static void main(String[] args) {

//        Dog dog=new Dog();
//        dog.walk(10);
//        dog.speak();

        //Duck myDuck = new Duck();
//        System.out.println(myDuck.hashCode());
//        myDuck.f//  Duck yourDuck = new Duck();
//        yourDuck.walk(20);
//        System.out.println(yourDuck.hashCode());
//        yourDuck.duckAge = 3;

//        System.out.println(yourDuck.duckAge);
//        System.out.println(myDuck.duckAge);

//        yourDuck.setDuckAge(6,"Priya");
//        int myDuckAge = yourDuck.getAge();
//        System.out.println(myDuckAge);
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

    }
}
