package Work;

public class Done<radhe> {

    public static void main (String [] args) {
    Employees worker1 = new Employees(1, "veeresh", "shah", "203a", 904563, 20000);
    Employees worker2 = new Employees(2, "radhe", "shyam", "204b", 90741, 30000);
    Employees worker3 = new Employees(3, "kiran", "bedi", "205c", 38721, 15000);
    Employees worker4 = new Employees(4, "priya", "roy", "206d", 33721, 50000);
    Employees worker5 = new Employees(5, "vedha", "shree", "207e", 9824, 10000);
    Employees worker6 = new Employees(6, "shrey", "tiwari", "208f", 5638721, 12000);
    Employees worker7 = new Employees(7, "sai", "teja", "209g", 904563832, 40000);

    //System.out.println(worker6);
    Employees e0 = new Employees();
    e0.setEmloyeesInfo(1,"remo","dezousa","2075e",76354,28777 );
    e0.setEmloyeesInfo(2,"emo","zousa","075e",6354,2877 );
    e0.setEmloyeesInfo(3,"mo","usa","25e",354,2777 );


    Employees e1=new Employees(1,"jaan","kumr","34e",30494,463555);
    Employees e2=new Employees(2,"krsihna","kjh","3874e",304976,47455);
    Employees e3=new Employees(3,"jee ee","kumar","3465e",345049,44655);
            Employees [] e={e1,e2,e3};
    for (int i=0;i<e.length;i++){
        String Employeesname =e[i].getname();
        String Employeessurname =e[i].getsurname();
        String Employeesid=e[i].getid();
        System.out.println(Employeesname+" "+Employeesid+" "+Employeessurname);

    }
}

}

