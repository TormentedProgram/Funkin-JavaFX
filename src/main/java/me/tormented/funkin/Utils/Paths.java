package me.tormented.funkin.Utils;

import me.tormented.funkin.Main;

public class Paths {
    public static String image(String path) {
        return String.valueOf(Main.class.getResource("images/" + path));
    }
}
