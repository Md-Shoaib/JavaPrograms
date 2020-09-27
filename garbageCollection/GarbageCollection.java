package garbageCollection;

public class GarbageCollection {

    public void finalize() {
        System.out.println("Garbage collection completed.");
    }


    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();

        // Dereferencing objects
        obj1 = null;
        obj2 = null;

        System.out.println("Garbage collection initiated");
        System.gc(); // Method call for garbage collection it is actually initialize finalize method
    }

}
