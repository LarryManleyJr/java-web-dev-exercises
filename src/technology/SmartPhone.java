package technology;

public class SmartPhone extends Computer{
    private int numberOfCameras;
    private String carrier = "Verizon";

    public SmartPhone (int aNumberOfCameras, String aBrand) {
        super(aBrand);
        numberOfCameras = aNumberOfCameras;
    }


}
