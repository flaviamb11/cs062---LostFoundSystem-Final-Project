# 5C Lost and Found System

## Project Overview

The 5C Lost and Found System is a Java-based application designed to help students across the Claremont Colleges report, organize, and locate lost and found items.

The project aims to make it easier to identify potentially matching lost and found reports by organizing information such as item names, categories, descriptions, locations, and dates.

## Current Implementation

The initial implementation includes:

- A `Report` class representing individual lost and found records.
- Eight attributes for each report: ID, type, item name, category, description, location, date, and contact information.
- CSV file reading using Java's `BufferedReader` and `FileReader`.
- An `ArrayList` to store loaded reports.
- A console interface displaying a welcome message and the total number of reports loaded.

## Dataset

The project currently uses a pilot dataset named `lost_found_100_records.csv`.

The dataset contains 100 sample records of lost and found items across the Five Claremont Colleges:

- Pomona College
- Claremont McKenna College
- Scripps College
- Harvey Mudd College
- Pitzer College

Each record includes an item ID, report type, item name, category, description, location, date, and contact information.

## Technologies

- Java
- ArrayList
- BufferedReader
- FileReader
- CSV

## Running the Program

1. Clone the repository.
2. Ensure that `LostFoundCSV.java` and `lost_found_100_records.csv` are in the same directory.
3. Compile the Java file:

   `javac LostFoundCSV.java`

4. Run the program:

   `java LostFoundCSV`

## Future Development

Planned improvements include:

- Searching and filtering reports.
- Implementing a matching algorithm to identify possible lost and found item matches.
- Ranking potential matches based on item attributes.
- Improving CSV parsing and handling invalid or incomplete records.
- Expanding testing with a larger dataset.

## Course

CS062: Data Structures and Advanced Programming

Final Project
