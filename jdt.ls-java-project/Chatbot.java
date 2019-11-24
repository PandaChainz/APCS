public class Chatbot {
  private static int age;
  private static String name;
  private static String place;
  private static String username;
  private static String school;
  // More will be added

  public Chatbot() {
    age = 16;
    name = "Alex";
    place = "United States of America";
    school = "The Bronx High School of Science";
  }

  public String greeting() {
    return "Hello! I'm Alex. What is your name?";
  }

  public void setUsername(String n) {
    username = n.substring(n.lastIndexOf(" ") + 1);
  }

  public String getUsername() {
    return username;
  }

  // FIX THE UPPERCASE OR LOWERCASE IDENTIFICATION FOR EACH METHOD
  public String areResponse(String phrase) {
    if ((phrase.contains("New York"))
        || (phrase.contains("new york") || (phrase.contains("Queens")) || (phrase.contains("The United States")))) {
      return "Yes, I am!";
    } else
      return "No, I'm not";
  }

  public static String canResponse(String phrase) {
    if (phrase.contains("name")) {
      return "Yes, my name is " + name;
    }
    return "Sorry, I don't understand what you mean";
  }

  public static String whatResponse(String phrase) {
    if (phrase.contains("name")) {
      return "My name is " + name;
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school;
    }
    if (phrase.contains("age")) {
      return "I'm " + Integer.toString(age);
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school;
    }
    return ("I don't know.");
  }

  public String response(String phrase) {
    if ((phrase.contains("What")) || (phrase.contains("what"))) {
      return whatResponse(phrase);
    } else if ((phrase.contains("Where")) || (phrase.contains("where"))) {
      return whereResponse(phrase);
    } else if ((phrase.contains("How")) || (phrase.contains("how"))) {
      return howResponse(phrase);
    } else if (phrase.contains("Can")) {
      return canResponse(phrase);
    } else if (phrase.contains("Are")) {
      return areResponse(phrase);
    } else
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
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school;
    }
    return "I'm not sure what you mean";
  }
}
