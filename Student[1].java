public class Student {

  private String Name;
  private String Last;
  private int Age;
  private String Adres;
  
  public Student(String name, String last, int age, String adres) {
    Name = name;
    Age = age;
    Adres=adres;
    Last = last;
  }

  public String GetName() {return Name;}
  public String GetLast() {return Last;}
  public int GetAge() {return Age;}
  public String GetAdres() {return Adres;}
  
  public String ToString() {
    return Name + " " + Last + " " + Integer.toString(Age) + " " + Adres;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error", -1,"Parse Error");
    return new Student(data[0],data[1], Integer.parseInt(data[2]),data[3]);
  }
}