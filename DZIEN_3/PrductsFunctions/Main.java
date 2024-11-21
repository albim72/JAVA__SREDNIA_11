import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop",8790.8,false),
                new Product("Smartphone",3199.0,true),
                new Product("Tablet",1450.0,false),
                new Product("Smartwatch",1800.0,true),
                new Product("Headphones",245.99,true)
        );

        //1. Predicate: filtorwanie produktów w promocji
        Predicate<Product> isOnSale = Product::isOnSale;

        //2. Function: oblicz cenę z rabatem 10%
        Function<Product,Product> applyDiscount = product ->
                new Product(product.getName(),product.getPrice()*0.9,product.isOnSale());
        //3. Consumer: wyświetl produkt
        Consumer<Product> printProduct = product ->
                System.out.println("Product: " + product);

        //4. Supplier: Twórzymy domyślny produkt
        Supplier<Product> defaultProductSupplier = () ->
                new Product("Default product",50.0,false);

        //5.Przetwarzanie produktów z wykorzystaniem Stream API
        System.out.println("Produkty w promocji z rabatem!");
        List<Product> discountedProducts = products.stream()
                .filter(isOnSale) //Filtrowanie produktów w promocji
                .map(applyDiscount) //Zastosuj rabat 10%
                .peek(printProduct) //wyświetl produkt
                .collect(Collectors.toList()); //zbierz do listy

        System.out.println("\nProdukty przetworzone z rabatem!");
        discountedProducts.forEach(printProduct);

        Product defaultProduct = defaultProductSupplier.get();
        System.out.println("\nDomyślny produkt: " + defaultProduct);

        // Funkcja złożona: filtruj i modyfikuj listę produktów
        Function<List<Product>,List<Product>> processProducts =
                productList -> productList.stream()
                        .filter(product -> product.getPrice()>300)
                        .map(applyDiscount)
                        .collect(Collectors.toList());

        System.out.println("\nPrzetworzone produkty (droższe niż 300");
        List<Product> expensiveDiscountedProducts = processProducts.apply(products);
        expensiveDiscountedProducts.forEach(printProduct);

    }
}
