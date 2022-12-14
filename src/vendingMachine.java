import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vendingMachine {
    private List<product> products;
    private static List<product> DEFAULT = new ArrayList<>(Arrays.asList(new product("snikers", 5)));

    public vendingMachine(List<product> products) {
        this.products = products;
    }

    public vendingMachine() {
        this(DEFAULT);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<product> findByName(String name) {
        List<product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getName().contains(name))
                result.add(i);
        });
        return result;
    }
    public List<product> findByPrice(double price) {
        List<product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice() == price)
                result.add(i);
        });
        return result;
    }
    public List<product> findByPriceRange(double p1, double p2) {
        List<product> result = new ArrayList<>();
        products.forEach(i -> {
            if (i.getPrice()>p1 && i.getPrice()<p2)
                result.add(i);
        });
        return result;
    }
}
