public class Main {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        Calculator calculator = new Calculator();
        System.out.println("Two plus one equals: " + calculator.add(2,1));
        System.out.println("Four minus two equals: " + calculator.subtract(4,2));
    }


}
