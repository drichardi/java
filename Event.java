import java.util.HashMap;
import java.util.ArrayList;

public class Event {

  int yearIntroduced;
  String description;
  boolean active;

  //medalWinners 1 = gold, 2 = silver, 3 = bronze
  HashMap<Integer, String> medalWinners;
  ArrayList<HashMap<Integer, String>> winnerHistory;

  public Event(int introduced, String descrip, boolean act){
    yearIntroduced = introduced;
    description = descrip;
    active = act;
    medalWinners = new HashMap<Integer, String>();
    winnerHistory = new ArrayList<HashMap<Integer, String>>();
  }


  public static void main(String[] args) {
    Event swimButterfly = new Event(1900, "Swim like a butterfly!", true);
    swimButterfly.medalWinners.put(1, "Phelps");
    swimButterfly.medalWinners.put(2, "Lochte");
    swimButterfly.medalWinners.put(3, "Wilson");
    swimButterfly.winnerHistory.add(swimButterfly.medalWinners[0]);
    swimButterfly.winnerHistory.add(swimButterfly.medalWinners[1]);
    swimButterfly.winnerHistory.add(swimButterfly.medalWinners[2]);
  }
}
