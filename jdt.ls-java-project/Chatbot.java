public class Chatbot {
  private static int age;
  private static String name;
  private static String place;
  private static String username;
  private static String school;
  private static int result;
  private static String userinput_age;
  private static String userinput_place;
  // More will be added

  public Chatbot() {
    age = 16;
    name = "Alex";
    place = "New York";
    school = "The Bronx High School of Science";
  }

  public String greeting() {
    return "Hello! I'm Alex. To get started with this Chatbot, please type: Hello, my name is <your name>.";
  }

  public void setUsername(String n) {
    if (n.contains("name is")) {
      username = n.substring(n.lastIndexOf(" ") + 1).replaceAll("[.,?!]", "");
    } else {
      username = n.substring(n.indexOf(" ") + 1);
    }
  }

  public String getUsername() {
    return username;
  }
  
  public String getArithmetic(String phrase) {
    String numberOnly= phrase.replaceAll("[^0-9]+", " ");
    String[] numbers = numberOnly.split(" ");
    if ((phrase.contains("+") || (phrase.contains("plus")))) {
      int result = Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
      return "The answer is " + Integer.toString(result)+" " +username+".";
    } else if ((phrase.contains("-")) || (phrase.contains("minus"))) {
      int result = Integer.parseInt(numbers[1]) - Integer.parseInt(numbers[2]);
      return "The answer is " + Integer.toString(result)+" " +username+".";
    } else if ((phrase.contains("divided")) || (phrase.contains("/"))) {
      int result = Integer.parseInt(numbers[1]) / Integer.parseInt(numbers[2]);
      return "The answer is " + Integer.toString(result)+" " +username+".";
    } else if ((phrase.contains("multiplied")) || (phrase.contains("times")) || (phrase.contains("*"))) {
      int result = Integer.parseInt(numbers[1]) * Integer.parseInt(numbers[2]);
      return "The answer is " + Integer.toString(result)+" " +username+".";
    } else if ((phrase.contains("%")) || (phrase.contains("module"))) {
      int result = Integer.parseInt(numbers[1]) % Integer.parseInt(numbers[2]);
      return "The answer is " + Integer.toString(result)+" " +username+".";
    }
    return "I don't know this operation, please use basic integers.";
  }


  // FIX THE UPPERCASE OR LOWERCASE IDENTIFICATION FOR EACH METHOD
  public String areResponse(String phrase) {
    if ((phrase.contains("New York"))
        || (phrase.contains("new york") || (phrase.contains("Queens")) || (phrase.contains("The United States")))) {
      return "Yes, I am!";
    } else
      return "No, I'm not. Im from "+place+".";
  }

  public String distract(String phrase) {
    if (phrase.contains("Can")) {
      return canResponse(phrase);
    } else if ((phrase.contains("Where")) || (phrase.contains("where"))) {
      return whereResponse(phrase);
    } else if ((phrase.contains("How")) || (phrase.contains("how"))) {
      return howResponse(phrase);
    } else if (phrase.contains("Can")) {
      return canResponse(phrase);
    } else if (phrase.contains("Are")) {
      return areResponse(phrase);
    }
    return "Let's talk about something else " + username+".";
  }

  public String canResponse(String phrase) {
    if (phrase.contains("name")) {
      return "Yes, my name is " + name+".";
    } else if ((phrase.contains("+") || (phrase.contains("plus")) || (phrase.contains("-")) || (phrase.contains("minus")) || (phrase.contains("divided")) || (phrase.contains("/")) || (phrase.contains("multiplied")) || (phrase.contains("times")) || (phrase.contains("*")) || (phrase.contains("%")))) {
      return "Yes, "+getArithmetic(phrase);
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "Yes "+username+", " + whatResponse(phrase);
    }
    return "No, I don't understand what you mean.";
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
    } else if ((phrase.contains("name is")) || (phrase.contains("is my name"))) {
      setUsername(phrase);
      return "Nice to meet you " + username+".";
    } else if ((phrase.contains("I am from")) || (phrase.contains("I'm from")) || (phrase.contains("am from")) || (phrase.contains("live in"))) {
      userinput_place = phrase.substring(phrase.lastIndexOf(" ") + 1).replaceAll("[.,?!]", ""); 
      if (phrase.contains("New")) {
        userinput_place = phrase.substring(phrase.lastIndexOf(" ") + 1).replaceAll("[.,?!]", "");
        return "Nice! You're from New "+userinput_place+".";
      } else if (phrase.contains("San")) {
        userinput_place = phrase.substring(phrase.lastIndexOf(" ") + 1).replaceAll("[.,?!]", "");
        return "Nice! You're from San "+userinput_place+".";
      }
      return "Nice! You're from "+userinput_place+".";
    } else if (phrase.contains("I am ^0-9]")) {
      userinput_age = phrase.substring(phrase.lastIndexOf(" ") + 1).replaceAll("[.,?!]", "");
      return "You're "+userinput_age;
    }
    return distract(phrase);
  }

  public String whatResponse(String phrase) {
    if (phrase.contains("name")) {
      return "My name is " + name+".";
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school+".";
    } else if (phrase.contains("age")) {
      return "I'm " + Integer.toString(age);
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school+".";
    } else if ((phrase.contains("Can")) && ((phrase.contains("+") || (phrase.contains("plus")) || (phrase.contains("-")) || (phrase.contains("minus")) || (phrase.contains("times")) || (phrase.contains("divided")) || (phrase.contains("/")) || (phrase.contains("multiplied")) || (phrase.contains("*")) || (phrase.contains("%"))))) {
      return "Yes, "+getArithmetic(phrase);
    } else if ((phrase.contains("+") || (phrase.contains("plus")) || (phrase.contains("-")) || (phrase.contains("minus")) || (phrase.contains("times")) || (phrase.contains("divided")) || (phrase.contains("/")) || (phrase.contains("multiplied")) || (phrase.contains("*")) || (phrase.contains("%")))) {
      return getArithmetic(phrase);
    }
      return distract(phrase);
    }

  public String howResponse(String phrase) {
    if (phrase.contains("old")) {
      return "I'm " + Integer.toString(age) +".";
    } else {
      return distract(phrase);
    }
  }

  public String whereResponse(String phrase) {
    if ((phrase.contains("from")) || (phrase.contains("live"))) {
      return "I'm from " + place+".";
    } else if ((phrase.contains("school")) || (phrase.contains("School"))) {
      return "I go to " + school+".";
    }
    return distract(phrase);
  }
}
