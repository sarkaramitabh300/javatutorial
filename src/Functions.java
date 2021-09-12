public class Functions {
    public static void main(String[] args) {

//        int first = 10;
//        int second = 30;
//        int result = add(first, second);
//
//        int multAsn = mult(30, 100);
//
//        int ans = add(40, 80);
//
//        System.out.println(result);
//        System.out.println(ans);
//        System.out.println(multAsn);
//        int arr[] = {500, 33, 69, 100, 400};
//        printArray(arr);
        switchExample(0);
    }

    private static void switchExample(int i) {

        switch (i) {
            case 0:
                System.out.println("first case executed");
                break;
            case 1:
                System.out.println("Second case executed");
                break;

            default:
                System.out.println("default is executed");
        }


    }

    //Integer =2^32;
    public static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }

    }

}
