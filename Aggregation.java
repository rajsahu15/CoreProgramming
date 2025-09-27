
class Sim {

    String serviceProvider;
    int gbPS;

    //specialtype multiline nonstatic initializer
    public Sim(String serviceProvider, int gbPS) {
        this.serviceProvider = serviceProvider;
        this.gbPS = gbPS;
    }

}

class Mobile {

    String company;
    String color;
    int price;
    Sim s;//aggregation

    public Mobile(String company, String color, int price) {
        this.company = company;
        this.color = color;
        this.price = price;
    }

    public void getSim(Sim s) {
        this.s = s;
    }

    public void getDetails() {
        System.out.println("\nMOBILE NAME IS: " + company);
        System.out.println("COLOR OF MOBILE IS " + color);
        System.out.println("Price OF MOBILE IS :-" + price);
        System.out.println("------------------------------------------------");
        if (s != null) {
            System.out.println("Service provide name :" + s.serviceProvider);
            System.out.println("Service Internet Speed :" + s.gbPS);
        } else {
            System.out.println("SIM CARD NOT INSERTED\n");
        }
    }

}

public class Aggregation //weak Association //weak bond
{

    public static void main(String[] args) {
        Mobile m = new Mobile("APPLE", "BLACK", 1000);
        Sim s = new Sim("Airtel", 100);
        m.getSim(s);
        m.getDetails();
    }

}
