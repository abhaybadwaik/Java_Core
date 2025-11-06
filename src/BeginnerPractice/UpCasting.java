package BeginnerPractice;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Animal a = new Dog();  // 🔼 Upcasting
        a.sound();             // Dog barks

        Dog d = (Dog) a;       // 🔽 Downcasting
        d.wagTail();           // Dog wags tail
    }
}
