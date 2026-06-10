public class ProductManager {
    public void Add(Product productx) {
        //JDBC
        System.out.println("ürün eklendi: " + productx._name);

    }

    public void Mathem(DortIslem dortIslem) {
        //JDBC
        System.out.println("İşlem sonucu: " + dortIslem.carpma(11,23));

    }
}
