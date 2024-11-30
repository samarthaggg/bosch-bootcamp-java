// In the same package
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
}
