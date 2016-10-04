import java.util.HashMap;

class Restaurant {

public static void main(String[] args) {
//Declaring and initializing menu HashMap
  HashMap<String, Integer> menu = new HashMap<String, Integer>();

//storing key:value pairs in a HashMap
  menu.put("ToFurkey Burger", 13);
  menu.put("Naan Pizza", 11);
  menu.put("Cranberry Kale Salad", 10);

  //retrieving items from HashMap

  System.out.println(menu.get("Naan Pizza"));
  System.out.println(menu.size());

  //foreach loop
  for(String item : menu.keySet())
  {
    System.out.println("A " + item + " costs " + menu.get(item) + " dollars.");
  }



}

}
