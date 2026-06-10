public class NewProduct {
    public NewProduct(int id, String name, String description, double pricde, int stockAmount) {
        System.out.println("Yapıcı blok çalıştı.");
        int _id = id;
        String _name = name;
        String _description = description;
        double _pricde = pricde;
        int _stockAmount = stockAmount;


        System.out.println(_id);
        System.out.println(_name);
        System.out.println(_description);
        System.out.println(_pricde);
        System.out.println(_stockAmount);
    }
}
