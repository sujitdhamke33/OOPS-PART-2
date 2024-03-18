package OOPS1.sum;

public class Sum {

    public static int sum (int a, int b){
        return a + b ;
    }
    public static int sum (int a, int b, int c){
        return a + b + c ;
    }
    public static int sum (int a, int b, int c ,int d){
        return a + b + c + d;
    }
    public static void main(String[] args) {

        int result = sum(2,6);
        System.out.println(result);
        int result1 = sum(2,6,8,90);
        System.out.println(result1);
        int result2 = sum(2,6,65);
        System.out.println(result2);
    }
}
