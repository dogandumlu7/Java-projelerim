public class Product {
    //attribute | field
    int _id;
    String _name;
    String _description;
    double _price;
    int _stockAmount;


    //getter
    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public double getPrice() {
        return _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public String getKod() {

        return _name.substring(0, 1) + _id;
    }


    //setter
    public void setId(int id) {
        _id = id;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }
}

