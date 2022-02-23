public class PhoneDriver {
    public static void main(String[] args) {
        Phone myPhone = new Phone("89635558706", "Nokia", 150.7 );

        System.out.println(myPhone);

        myPhone.recieveCall("Misha");

        myPhone.recieveCall("Misha", "89567898899");

        System.out.println("Номер телефона: " + myPhone.getNumber());

        myPhone.sendMessage(new String[] {"89633211627", "89998745541", "89217743427"});

    }
}
