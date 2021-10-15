package Eco.dto;

public class Receiver {
    public int latitude;
    public int longitude;
    public int radius;
    public String type;

    @Override
    public String toString() {
        return "latitude" + " " + latitude + " " + "longitude" + " " + longitude + "radius:" + radius;
    }


}
