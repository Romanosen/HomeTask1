package romanosen.reflectionAnnotation.task3;

public class Car {

    public Car() {

    }
    public Car(String brand, String model, int price) {

        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    @Save
    public String brand;
    @Save
    public String model;

    public int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


}
