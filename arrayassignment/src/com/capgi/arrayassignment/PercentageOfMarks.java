package com.capgi.arrayassignment;

public class PercentageOfMarks {
    public static void main(String[] args)
    {
        int total_marks = 0;
        float percentage;
  
        int marks[] = { 89, 75, 82, 60, 95 };
  
        for (int i = 0; i < marks.length; i++) {
            total_marks += marks[i];
        }
        System.out.println("Total Marks : " + total_marks);
  
        percentage = (total_marks /(float)marks.length);
        System.out.println("Total Percentage : " + percentage + "%");
    }
}
