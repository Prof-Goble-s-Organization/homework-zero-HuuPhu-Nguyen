package hw0;

public class CoolerSpaceAlien extends SpaceAlien implements ZapsWithSlime{

    private int size;

    public CoolerSpaceAlien(String homePlanet, double distanceFromEarth, int size) {
        super(homePlanet, distanceFromEarth);
        this.size = size;
    }

    @Override
    public void doGreeting() {
        System.out.println("hi there");
    }

    public String doSlimeZap(int numHumans){
        if (numHumans < 2){
            return "Squelch";
        }
        else {
            return "SQUELCHHH!!";
        }
    }
    public String slimeWholeEarth(){
        return "Tooitsch";
    }

}
