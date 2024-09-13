package com.xworkz.TextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRunner {
	
	public static void main(String[] args) {
        String filePath = "C:\\Users\\khand\\eclipse-workspace\\TextFile\\src\\com\\xworkz\\TextFile\\File"; // Replace with the path to your text file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
	
	






