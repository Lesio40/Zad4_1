/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Service s = new Service();
    try {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Dodaj nowego studenta");
      System.out.println("2.Wyswietl wszystkich studentow");
      System.out.println("0.Wyjscie");
      String opcje = sc.nextLine();
      switch(opcje){
        case "1":
          System.out.println("Podaj imie:");
          String name = sc.nextLine();
          System.out.println("Podaj nazwisko:");
          String last = sc.nextLine();
          System.out.println("Podaj wiek:");
          int age = sc.nextInt();
          s.addStudent(new Student(name,last, age));
          
          break;
        case "2":
          var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
        break;
        case "0":
          System.out.println("Wyjscie");
          break;
      }
      
      }
     catch (IOException e) {
      
    }
  }
}