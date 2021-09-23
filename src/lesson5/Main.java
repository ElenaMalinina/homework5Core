package lesson5;

import java.io.IOException;
import java.util.Arrays;

public class  Main {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData();
        appData.save("Sportchallenge.csv");
        appData.load("Sportchallenge.csv");

        System.out.println(Arrays.toString(appData.getType()));
        System.out.println(Arrays.deepToString(appData.getDistance()));
    }
}
