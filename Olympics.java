import java.util.*;

class Olympics {

  

  public static void main(String[] args) {

    ArrayList<String> olympicSports = new ArrayList<String>();

    olympicSports.add("Archery");
    olympicSports.add("Boxing");
    olympicSports.add("Cricket");
    olympicSports.add("Diving");

    System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

    for(String sport : olympicSports){
      System.out.println(sport);
    }

    //Host cities and the year they hosted the Summer Games

    HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

    hostCities.put("Beijing", 2008);
    hostCities.put("London", 2012);
    hostCities.put("Rio de Janeiro", 2016);
    hostCities.put("Tokyo", 2020);

    for(String city : hostCities.keySet()){
      if(hostCities.get(city) < 2020){
        System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");
      } else {
        System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");
      }

    }
  }
}
