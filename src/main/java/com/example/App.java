package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;

public class App {
    public static void main(String[] args) {
        System.out.println(ImmutableList.of("Apple", "Banana", "Cherry"));
        // Create a File object representing the source file
        File sourceFile = new File("source.txt");
        
        // Create a File object representing the destination file
        File destFile = new File("destination.txt");
        try {
            FileUtils.copyFile(sourceFile, destFile);
            System.out.println("Copied");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
