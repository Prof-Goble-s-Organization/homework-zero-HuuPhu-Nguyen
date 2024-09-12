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

    @Override
    public String doSlimeZap(int numHumans){
        if (numHumans < 2){
            return "Squelch";
        }
        else {
            return "SQUELCHHH!!";
        }
    }

    @Override
    public String slimeWholeEarth(){
        return "Tooitsch";
    }

    public static void main(String[] args) {
        CoolerSpaceAlien a1 = new CoolerSpaceAlien("Mars", 2000.0, 10);
        a1.doGreeting();
        System.out.println(a1.doSlimeZap(1));
        System.out.println(a1.doSlimeZap(2));
        System.out.println(a1.slimeWholeEarth());
    }

}
