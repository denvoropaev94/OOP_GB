import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        product water = new product("vine", 12);
//        System.out.println(water);
        vendingMachine machine1 = new vendingMachine();
        System.out.println(machine1);

        List<product> tovars = new ArrayList<>();
        tovars.add(water);
        tovars.add(new product("wine", 55.99));
        tovars.add(new product("pepsi", 7.44));
        tovars.add(new sodaWater("bonaqua", 12.3, "crimson"));
        tovars.add(new milk("Savushkin",2,"fat-free",1));
        tovars.add(new milk("prostokvashino",17,"cream",0.5));


        vendingMachine machine2 = new vendingMachine(tovars);
        System.out.println(machine2);

        System.out.println(machine2.findByName("pep"));
        System.out.println(machine2.findByPrice(12));
        System.out.println(machine2.findByPriceRange(15,20));
    }
}