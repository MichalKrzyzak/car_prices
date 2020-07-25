package com.main.htmlparse;

import com.main.dto.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class GenerateFile {
    public static final String OPEN_TABLE_DATA = "<td>";
    public static final String CLOSE_TABLE_DATA = "</td>";
    public static final String OPEN_TABLE_ROW = "<tr>";
    public static final String CLOSE_TABLE_ROW = "</tr>";
    private StringBuilder sb;

    public void generateHtmlFileFrom(Map<String, Car> cars) {
        sb = new StringBuilder();
        createTableHeader();

        for (Map.Entry<String, Car> carEntry : cars.entrySet()) {
            addTableRowFor(carEntry);
        }

        sb.append("</tbody></table></body></html>");

        saveAsFile(sb);
    }

    private void createTableHeader() {
        sb.append("<html><body><table border=\"1\"><thead>");
        sb.append(OPEN_TABLE_ROW);
        sb.append(OPEN_TABLE_DATA).append("Image").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append("Link").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append("Brand").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append("Model").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append("Prize difference").append(CLOSE_TABLE_DATA);
        sb.append(CLOSE_TABLE_ROW);
        sb.append("</thead><tbody>");
    }

    private void addTableRowFor(Map.Entry<String, Car> carEntry) {
        Car car = carEntry.getValue();

        sb.append(OPEN_TABLE_ROW);

        sb.append(OPEN_TABLE_DATA).append("<img src=\"").append(car.getImageLink()).append("\" width=\"180\" height=\"90\">").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append("<a href=\"").append(carEntry.getKey()).append("\">Link</a>").append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append(car.getBrand()).append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append(car.getModel()).append(CLOSE_TABLE_DATA);
        sb.append(OPEN_TABLE_DATA).append(car.getPercentageDifference()).append(CLOSE_TABLE_DATA);

        sb.append(CLOSE_TABLE_ROW);
    }

    private void saveAsFile(StringBuilder tableAsString) {
        try {
            FileWriter myWriter = new FileWriter("car_insurance_diff.html");
            myWriter.write(tableAsString.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
