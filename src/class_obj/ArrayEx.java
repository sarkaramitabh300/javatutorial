package class_obj;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = {23, 44, 66, 788};

//        System.out.println(arr[2]);

//        Student student1 = new Student("priya", "a1212", 1);
//        Student student2 = new Student("sonu", "a1213", 2);
//        Student student3 = new Student("amitabh", "a1214", 3);
//        Student student4 = new Student("dipti", "a1215", 4);
//        Student student5 = new Student("atharv", "a1216", 5);
//        Student student6 = new Student("rahul", "a1217", 6);

//        Student student44 = new Student();
//        student44.setTeacher("Amir");
//
//        student44.setStudentInfo("priya", "a1212", 1);
//
//        Student s1 = new Student();
////        s1.setTeacher("Amir");
//
//        s1.setStudentInfo("Sonu", "a1213", 2);


//        int id=student44.getId();
//        String name=student44.getName();
//        String roll= student44.getRollNum();

//        System.out.println(roll);
//        System.out.println(id);
//        System.out.println(name);
//
//        System.out.println(s1.getId());
//        System.out.println(s1.getRollNum());
//        System.out.println(s1.teacher);
//        System.out.println(s1.getName());

        Student s1 = new Student("priya", "a1212", 1);
        Student s2 = new Student("sonu", "a1213", 2);
        Student s3 = new Student("amitabh", "a1214", 3);
        Student s4 = new Student("dipti", "a1215", 4);
        Student s5 = new Student("atharv", "a1216", 5);
        Student s6 = new Student("rahul", "a1217", 6);

        Student[] st = {s1, s2, s3, s4, s5, s6};
//        String nam = st[0].getName();
//        System.out.println(nam);

        for (int i = 0; i < st.length; i++) {
            String studentName = st[i].getName();
            String studentRoll = st[i].getRollNum();
            int studentId = st[i].getId() * 20;
            st[i].setStdId(studentId);
            System.out.println(studentName + " , " + studentRoll + " , " + studentId);
        }

        System.out.println("-----------");
        System.out.println(st[0].getName() + " , " + st[0].getRollNum() + " , " + st[0].getId());
        System.out.println(st[1].getName() + " , " + st[1].getRollNum() + " , " + st[1].getId());


        findStudentById(st, 120);

    }

    public static void findStudentById(Student[] stud, int id) {
        for (int i = 0; i < stud.length; i++) {
            if (stud[i].getId() == id) {
                System.out.println("Searched");
                System.out.println(stud[i].getName() + " , " + stud[i].getRollNum() + " , " + stud[i].getId());
            }
        }
    }

}
