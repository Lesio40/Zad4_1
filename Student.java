public class Student {

  private String Name;
  private String Last;
  private int Age;

  public Student(String name, String last, int age) {
    Name = name;
    Age = age;
    Last = last;
  }

  public String GetName() {return Name;}
  public String GetLast() {return Last;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Last + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error","Parse Error", -1);
    return new Student(data[0],data[1], Integer.parseInt(data[2]));
  }
}