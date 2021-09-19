package Work;

public class Employees {
    public String name;
    public int slno;
    public String surname;
    public int phNo;
    public int salary;
    public String id;


    public  Employees(int slno,String name,String surname,String id,int phNo,int salary) {
        this.name = name;
        this.id=id;
        this.slno=slno;
        this.salary=salary;
        this.phNo=phNo;
        this.surname=surname;
    }

    public Employees() {
        int slNo;
        String name;
        String surname;
        String id;
        int phNo;
        int salary;

    }

    public  String toString(){
     return  slno + " "+ name +" " + surname+ "-" + id;
}

    private void setName(String name) {
        this.name = name;
    }
    private void setSlno(int slno){
        this.slno=slno;
    }
    private void setSurname(String surname){
        this.surname=surname;
    }
    private void setPhNo(int phNo){
        this.phNo=phNo;
    }
    private void setSalary(int salary){
        this.salary=salary;}

private void setId(String id ){
        this.id=id;
}

    public int getPhNo() {
        return phNo;
    }
    public int getSlno(){
        return slno;
    }
    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
        public String getsurname(){
        return surname;
        }
    public String getid() {
        return id;
    }
    public void setEmloyeesInfo(int slNo,String name,String surname,String id,int phNo,int salary){
        this.name=name;
        this.id=id;
        this.slno=slNo;
        this.surname=surname;
        this.phNo=phNo;
        this.salary=salary;

    }
}



