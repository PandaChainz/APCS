public class Chatbot {
  private static int age;
  private static String name;
  private static String place;
  private static String username;
  // More will be added

  public Chatbot() {
    age = 16;
    name = "Alex";
    place = "United States of America";
  }

  public String greeting() {
    return "Hello! I'm Alex. What is your name?";
  }

  public void setUsername(String n) {
    String username = n;
  }

  public String getUsername() {
    return username;
  }

   public static String whatResponse(String phrase) {
    if (phrase.contains("name")) {
      return name;
    }
    if (phrase.contains("age")) {
      return "I'm " + Integer.toString(age);
    }
      return ("I don't know.");
    }

  public String response(String phrase) {
    if ((phrase.contains("What")) || (phrase.contains("what"))) {
      return whatResponse(phrase);
    } else if ((phrase.contains("Where")) || (phrase.contains("where"))) 
    {
      return whereResponse(phrase);
      } else if ((phrase.contains("How")) || (phrase.contains("how"))) 
      {
      return howResponse(phrase);
      }
    return "Nice to meet you " + username;
  }

 

  public String howResponse(String phrase) {
    if (phrase.contains("old")) {
      return "I'm " + Integer.toString(age);
    } else {
      return "I am not sure.";
    }
  }

  public String whereResponse(String phrase) {
    if ((phrase.contains("from")) || (phrase.contains("live"))) {
      return "I'm from the " + place;
    } else {
      return "I am not sure.";
    }
  }

  
  
  
  
}