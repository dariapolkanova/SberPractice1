public class Phone {

    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {}

    public void recieveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void recieveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public String getNumber() { return number; }


    public void sendMessage(String[] contacts) {
        System.out.print("Сообщение отправлено номерам: ");
        for (int i = 0; i < contacts.length; i++) {
            System.out.print(contacts[i] + " ");
        }
    }

    public String toString() {
        return String.format("Информация о телефоне: номер %s, модель %s, вес %s",
                number, model, weight);
    }

}
