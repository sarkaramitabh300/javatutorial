package ds;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[3];
        int abc = 10;

//        ArrayList<Integer> al=new ArrayList<>();
//        ArrayList<Integer> al=new ArrayList<Integer>();
//        System.out.println("initial size : "+al.size());
//        al.add(0,100);
//        al.add(1,200);
//        al.add(500);
//        al.add(600);
//        al.add(10,123);
//        al.set(3,300);
//        System.out.println("end size : "+al.size());
////     al.toString();
//
//
//        System.out.println(al.toString());

//        for(int i=0;i<12;i++){
//            int position=i;
//            if(i<10){
//                 position=i;
//            }else{
//                position=10;
//            }
//
//
//            al.add(position,i);
//        }

//        System.out.println(al.toString());


        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            al.add(i * 20);
        }
        System.out.println(al.toString());
        int n = al.size();
        for (int i = 0; i < n; i++) {

//            System.out.println(n - i - 1);
//            6-0-1=5;
//            6-1-1=4;
            int index = n - i - 1;
            int val = al.get(index);
            System.out.println(val);


        }

    }
}
