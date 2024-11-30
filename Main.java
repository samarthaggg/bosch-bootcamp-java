// Main.java
class ClassA {
    String sharedMethod() {
        return "Accessible within the same package";
    }
}

class ClassB {
    void accessClassA() throws InterruptedException {
        ClassA a = new ClassA();
        System.out.println(a.sharedMethod());
        Thread.sleep(5000);  // Sleep for 5 seconds
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        try {
            b.accessClassA();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception occurred: " + e.getMessage());
        }
    }
}
