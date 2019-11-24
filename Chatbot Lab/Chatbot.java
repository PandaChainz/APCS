public class Chatbot {
  private int age;
  private String name;
  private String place;
  private String username;
  // More will be added

  public Chatbot() {
    age = 16;
    name = "Alex";
    place = "USA";
  }

  public String greeting() {
    return (" Hello! What is your name?");
  }

  public void setUsername(String n) {
    String username = n;
  }

  public String getUsername() {
    return username;
  }

  public String whatResponse(String phrase) {
    if (phrase.contains("name")) {
      return name;
    } else {
      return ("I don't know.");
    }
    if (phrase.contains("age")) {
      return String.valueOf(age);
    } else {
      return ("I don't know.");
    }
  }

  public String response(String phrase) {
    return ("hi");
  }
}
