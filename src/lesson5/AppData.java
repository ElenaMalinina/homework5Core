package lesson5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] type;
    private Integer[][] distance;

    public AppData() {
        type = new String[] {"Бег", "Плавание", "Прыжки"};
        distance = new Integer[][] {{1500, 300, 3}, {700, 500,2}};
    }

    public String[] getType() {
        return type;
    }
    public Integer[][] getDistance() {
        return distance;
    }
    private <T> String rowToString(T[] row) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row.length; i++) {
            if (i < row.length - 1) {
                result.append(row[i]).append(";");
            } else {
                result.append(row[i]);
            }
        }
        result.append("\n");
        return result.toString();
            }
    public void save (String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(type));
            for (Integer[] arrayData : distance) writer.write(rowToString(arrayData));
            writer.flush();
        }
    }
    public void load (String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            type = new String[]{};
            distance = new Integer[][]{};

            String tempString;
            tempString = reader.readLine();
            if (tempString != null) {
                type = tempString.split(";");
                ArrayList<Integer[]> arrayList = new ArrayList<>();
                while ((tempString = reader.readLine()) != null) {
                    String[] arr = tempString.split(";");
                    Integer[] intArray = new Integer[arr.length];
                    arrayList.add(intArray);}
                    distance = arrayList.toArray(new Integer[][]{});
                }
            }
        }
    }