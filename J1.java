// Main.java
class ClassA {
    String sharedMethod() {
        return "Accessible within the same package";
    }
}

class ClassB {
    void accessClassA() {
        ClassA a = new ClassA();
        System.out.println(a.sharedMethod());
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.accessClassA();
    }
}
