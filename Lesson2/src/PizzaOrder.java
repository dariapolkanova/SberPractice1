public class PizzaOrder {
    private String name;
    private String adress;
    private boolean sauce;
    private boolean order_accept;
    private Size size;

    PizzaOrder(String name, String adress, boolean sauce, Size size) {
        this.name = name;
        this.adress = adress;
        this.sauce = sauce;
        this.size = size;
    }

    public void order() {
        if (order_accept) {
            System.out.println("Заказ уже принят");
        }
        else {
            order_accept = true;
            String size_pizza = "Средняя";

            if (size == Size.BIG) {
                size_pizza = "Большая";
            }
            else if (size == Size.SMALL) {
                size_pizza = "Маленькая";
            }

            if (sauce) {
                System.out.println(String.format("Заказ принят. %s '%s' c соусом на адрес %s", size_pizza, name, adress));
            }
            else {
                System.out.println(String.format("Заказ принят. %s '%s' без соуса на адрес %s", size_pizza, name, adress));
            }
        }
    }

    public void cancel() {
        if (order_accept) {
            order_accept = false;
            System.out.println("Заказ отменен");
        }
        else {
            System.out.println("Отменять нечего");
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAdress() { return adress; }

    public void setAdress(String adress) { this.adress = adress; }

    public String getSauce() {
        if (sauce) {
            return "с соусом";
        }
        else {
            return "без соуса";
        }
    }

    public void setSauce(String sauce) {
        if (sauce == "с соусом") {
            this.sauce = true;
        }
        else {
            this.sauce = false;
        }
    }

    public String getSize() {
        if (size == Size.BIG) {
           return "Большая";
        }
        else  if ((size == Size.MEDIUM)) {
            return "Средняя";
        }
        else {
            return "Маленькая";
        }
    }

    public void setSize (String size) {
        if (size == "Маленькая") {
            this.size = Size.SMALL;
        }
        else if (size == "Средняя") {
            this.size = Size.MEDIUM;
        }
        else if (size == "Большая") {
            this.size = Size.BIG;
        }
    }
}
