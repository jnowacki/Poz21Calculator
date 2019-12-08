package jnowacki;

public class Car {

    private String manufacturer;
    private int productionYear;

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer, int productionYear) {
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
