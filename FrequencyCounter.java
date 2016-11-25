import java.util.*;

class FrequencyCounter {

  public static int toInt(String aValue) {
    int convertedValue = 0;
    try {
      convertedValue = Integer.parseInt(aValue);
    } catch(NumberFormatException e) {
      System.out.println("Not an integer.");
      System.exit(0);
    }
    return convertedValue;
  }

  public static void getFrequency(String[] args, HashMap<Integer, Integer> map) {
    for(int i = 0; i < args.length; i++) {
      if(!(map.containsKey(toInt(args[i])))) {
        map.put(toInt(args[i]), 1);
      } else {
        map.put(toInt(args[i]), map.get(toInt(args[i])) + 1);
      }
    }
  }

  public static void printFrequencies(HashMap<Integer, Integer> map) {
    System.out.println("List of integer frequencies below <Integer, Frequency>:");
    for(int key : map.keySet()) {
      System.out.println(String.valueOf(key) + ", " + String.valueOf(map.get(key)));
    }
  }

  public static void main(String[] args) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
    getFrequency(args, frequencyMap);
    printFrequencies(frequencyMap);
  }
}
