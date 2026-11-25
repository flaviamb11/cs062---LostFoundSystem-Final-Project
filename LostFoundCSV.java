
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LostFoundCSV {
    // List to store all reports
    private ArrayList<Report> reports = new ArrayList<>();
    // Scanner to read user input
    private Scanner scanner = new Scanner(System.in);

    // Report Class
    static class Report {
        String id;
        String type;
        String itemName;
        String category;
        String description;
        String location;
        String date;
        String contact;

        // Constructor for Report 
        Report(String id, String type, String itemName, String category,
              String description, String location, String date, String contact) {

            this.id = id;
            this.type = type;
            this.itemName = itemName;
            this.category = category;
            this.description = description;
            this.location = location;
            this.date = date;
            this.contact = contact;
        }

        // Display report info as chart
        public String toString() {
            return id + " | " + type + " | " + itemName + " | " + category
                    + " | " + description + " | " + location + " | " + date;
        }
    }

    // Load reports from CSV file
    private void loadReports() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("lost_found_100_records.csv"));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",", -1);

                Report report = new Report(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[5],
                        data[6],
                        data[7]
                );

                reports.add(report);
            }

            reader.close();

            System.out.println("Reports loaded");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    // Main method
    public static void main(String[] args) {
        LostFoundCSV program = new LostFoundCSV();

        program.loadReports();

        System.out.println("Welcome to the 5C Lost and Found System!");
        System.out.println("This program helps students find lost items.");
        System.out.println("Number of reports loaded: " + program.reports.size());
    }
}
