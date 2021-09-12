package class_obj;

public class Duck {

    private int duckAge = 0;

    /**
     * @param distance flying distance in Kilo meters
     * @apiNote This methode is used for flying
     */
    public void fly(int distance) {
        System.out.println("fly " + distance + " km");

    }

    public void walk(int step) {
        System.out.println("Walked " + step + " steps");
    }

    public void setDuckAge(int age, String name) {

        if (name == "priya") {
            duckAge = age;
        } else {
            System.out.println("Unauthorized access failed");
        }
    }

    public int getAge() {
        return duckAge;
    }
}
