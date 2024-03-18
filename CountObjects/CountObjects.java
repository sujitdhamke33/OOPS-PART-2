package OOPS1.CountObjects;

public class CountObjects {
    private static int objectCount = 0;
    public CountObjects() {
        objectCount++;
    }
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {

        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
        CountObjects obj4 = new CountObjects();
        CountObjects obj5 = new CountObjects();
        CountObjects obj6 = new CountObjects();

        int count = CountObjects.getObjectCount(); // we can call static method by the name of class

        System.out.println("Number of objects created: " + count);
    }
}

