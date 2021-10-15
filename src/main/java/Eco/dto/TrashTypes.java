package Eco.dto;

public class TrashTypes {
    public String id;
    public String icon;
    @Override
    public String toString() {
        return "id:" + " " + id + " " + " name:" +" "+ getName(icon);
    }

    static String getName(String icon) {
        String[] data = icon.split("/");
        String[] name = data[4].split("\\.");
        return name[0];
    }
}
