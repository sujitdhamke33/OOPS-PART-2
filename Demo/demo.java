package OOPS1.Demo;

public class demo {
    public static void main(String[] args) {

    }

    class Developer {
        String name;
        int salary;

        int age;

        public Developer(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
        public Developer(String name, int salary,int age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        void eating(){
            System.out.println(name + " " + " is eating.");
        }
    }

    class Tester extends Developer{


        public Tester(String name, int salary) {
            super(name, salary);
        }

        public Tester(String name, int salary, int age) {
            super(name, salary, age);
        }

        void eating() {
            System.out.println("Eating");
        }
    }
}
