public class UserInfo {
    // Declare instance variables
    public String name;
    private String userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;
  
    // Constructor
    public UserInfo(String name, String userid, String companyname, String place, int age, String position) {
      this.name = name;
      this.userid = userid;
      this.companyname = companyname;
      this.place = place;
      this.age = age;
      this.position = position;
    }
  
    // Create user method
    public static UserInfo createUser(String name, String userid, String companyname, String place, int age, String position) {
      return new UserInfo(name, userid, compnyname, place, age, position);
    }
  
    // Display user method
    public void displayUser() {
      System.out.println("Name: " + name);
      System.out.println("User ID: " + userid);
      System.out.println("Company Name: " + companyname);
      System.out.println("Place: " + place);
      System.out.println("Age: " + age);
      System.out.println("Position: " + position);
    }
  }
  