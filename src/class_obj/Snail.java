package class_obj;

public class Snail {
    public int PasswordToOpen=0;

    public void moved (int space){
        System.out.println("distance of"+space+"meters");
    }
    public void waited (int time){
        System.out.println("almost of"+time+ "minutes");
    }
    public void setPasswordToOpen(int code, String name){
        if(name=="remo"){
            PasswordToOpen=code;
        }
        else{
            System.out.println("unauthorised system failed");
        }
    }

    public int getPasswordToOpen() {
        return PasswordToOpen;
    }
}
