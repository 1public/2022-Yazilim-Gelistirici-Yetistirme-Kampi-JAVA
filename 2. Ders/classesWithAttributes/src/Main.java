public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "siyah");
//        product1.setName("Laptop");
//        product1.setId(1);
//        product1.setDescripton("Asus Laptop");
//        product1.setPrice(5000);
//        product1.setStockAmount(3);

        System.out.println(product1.getKod());
        System.out.println(product1.getPrice());

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);

        //System.out.println(product.name);


    }
}