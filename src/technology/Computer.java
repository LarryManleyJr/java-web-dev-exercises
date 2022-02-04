package technology;

public class Computer {

    private String brand;
    private int modelYear;
    private boolean blueTooth = false;

    // All computers/laptops/SmartPhones were purchased at Amazon.
    private String placeOfPurchase = "Amazon";

    public Computer (String aBrand) {
        brand = aBrand;
    }

    // getters and setters


    public boolean isBlueTooth() {
        return blueTooth;
    }

    public void setBlueTooth(boolean aBlueTooth) {
        blueTooth = aBlueTooth;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = getBrand();
    }


    public String getPlaceOfPurchase(){
        return placeOfPurchase;
    }
    public String ringTone () {
        return "RingRing!!!!!";
    }
        public String operatingSystem () {
            return "iOS";

        }
    }

