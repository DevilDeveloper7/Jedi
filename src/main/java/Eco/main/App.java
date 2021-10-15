package Eco.main;

import Eco.controllers.StaticController;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        StaticController sc = new StaticController();
        sc.radius();
        sc.types((trashTypes) -> {
            System.out.println(trashTypes);
        });
    }
}
