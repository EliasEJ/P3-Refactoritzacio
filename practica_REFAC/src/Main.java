import java.util.List;
import java.util.Scanner;

public class Main {
    //REFACT0:
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //REFACT0: Extracció de mètode
        //Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
            //REFACT1: Extracció de mètode
            printMenu();

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //REFACT2: Extracció de mètode
                    printIntro();
                    break;
                case 2:
                    double a=2;
                    double b=3;
                    double c=1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    //REFACT1:
    public static void printMenu() {
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }
    //REFACT2:
    public static void printIntro() {
        System.out.println("intro: ");
        int num1 = scan.nextInt();
        System.out.println("intro: ");
        int num2 = scan.nextInt();

        if (max(num1, num2)) {
            System.out.println("aaa");
        } else System.out.println("bbb");

    }
    public static boolean max(int a, int b) {
        if(a > b) {
            return true;
        //REFACT3: Inline Code
        //} else if (a == b) {
        //    return false;
        } else {
            return false;
        }
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        //REFACT4: Extacció de mètode
        double d = calcularD(a, b, c);

        if (d > 0) {
            //REFACT5: Extacció de mètode
            printCalculA(a, b, d);
        } else if (d == 0) {
            //REFACT6: Extacció de mètode
            printCalculB(a, b);
        } else {
            System.out.println("Equation has no roots");
        }
    }

    //REFACT4:
    private static double calcularD(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    //REFACT5:
    private static void printCalculA(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    //REFACT6:
    private static void printCalculB(double a, double b) {
        double x = -b / (2 * a);
        System.out.println("x = " + x);
    }
    Human human = new Human();
    //REFACT7: Extacció de Classe
    //public static class Human {
    //    //REFACT: Inline Code
    //    private String name,age,country,city,street,house,quarter;
    //
    //    //private String age;
    //    //private String country;
    //    //private String city;
    //    //private String street;
    //    //private String house;
    //    //private String quarter;
    //    public String obtenirAdrecaCompleta() {
    //        StringBuilder result = new StringBuilder();
    //        return result
    //                .append(country)
    //                .append(", ")
    //                .append(city)
    //                .append(", ")
    //                .append(street)
    //                .append(", ")
    //                .append(house)
    //                .append(" ")
    //                .append(quarter).toString();
    //    }
    //}

    //REFACT8: Extacció de Classe
    //public static class Order {
    //    private List<OrderLineItem> lineItems;
    //    private double taxRate;
    //
    //    public Order(List<OrderLineItem> lineItems, double taxRate) {
    //        this.lineItems = lineItems;
    //        this.taxRate = taxRate;
    //    }
    //
    //    public double calculateTotalPrice() {
    //        double subtotal = 0.0;
    //        for (OrderLineItem item : lineItems) {
    //            subtotal += item.getPrice();
    //        }
    //        double tax = subtotal * taxRate;
    //        return subtotal + tax;
    //    }
    //}
    Order order = new Order(null, 5.5);

    //REFACT9: Extacció de Classe
    //public class OrderLineItem {
    //   private String productName;
    //   private int quantity;
    //   private double price;
    //
    //   public OrderLineItem(String productName, int quantity, double price) {
    //       this.productName = productName;
    //       this.quantity = quantity;
    //       this.price = price;
    //   }
    //   public double getPrice() {
    //       return price * quantity;
    //   }
    //}
    OrderLineItem orderLineItem = new OrderLineItem("asd", 5, 5.5);

    //REFACT10: Extacció de Classe
    //public class Customer {
    //    private String firstName;
    //    private String lastName;
    //
    //    public Customer(String firstName, String lastName) {
    //        this.firstName = firstName;
    //        this.lastName = lastName;
    //    }
    //
    //    public String getFullName() {
    //        return firstName + " " + lastName;
    //    }
    //}
    Customer customer = new Customer("asd", "asd");
}