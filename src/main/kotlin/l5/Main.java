package l5;

public class Main {
    public static void main(String [] args) {
        Address address1 = new Address("Moscow", "Greeen", 150);
        Address address2 = new Address("Moscow", "Greeen", 150);

        if(address1.equals(address2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
