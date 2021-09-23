package lesson5;

import java.io.IOException;
import java.util.Arrays;
//1. Реализовать сохранение данных в csv файл;
//2. Реализовать загрузку данных из csv файла. Файл читается целиком.

public class  Main {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData();
        appData.save("Sportchallenge.csv");
        appData.load("Sportchallenge.csv");

        System.out.println(Arrays.toString(appData.getType()));
        System.out.println(Arrays.deepToString(appData.getDistance()));
    }
}
