package class_obj;

public class Student {
    private String name;
    private String rollNum;
    private int id;
    private String teacher;

    public Student(String name, String roll_num, int id) {
        this.name = name;
        this.rollNum = roll_num;
        this.id = id;

    }

    @Override
    public String toString() {
        return name + rollNum + id;
    }

    public void setTeacher(String tname) {
        this.teacher = tname;
    }

    public void setStudentInfo(String name, String rollNum, int id) {
        this.name = name;
        this.rollNum = rollNum;
        this.id = id;
    }


    //
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setRollNum(String rollNum) {
//        this.rollNum = rollNum;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
    public void setStdId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public int getId() {
        return id;
    }
}

