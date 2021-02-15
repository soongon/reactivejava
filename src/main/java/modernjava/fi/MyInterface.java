package modernjava.fi;

public interface MyInterface {

    void sort();

    default void invert() {
        System.out.println("inverted");
    }

    static void sampleStatic() {
        System.out.println("static method");
    }
}
