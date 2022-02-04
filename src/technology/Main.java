package technology;

public class Main {
    public static void main(String[] args) {
        Laptop macBookPro = new Laptop(420, "Apple");
        System.out.println(macBookPro.operatingSystem());

        SmartPhone note8 = new SmartPhone(3, "Samsung");
        System.out.println(note8.ringTone());

    }
}


