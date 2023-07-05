package creationalDP.prototypeDP;

public class PrototypeDemo {
    public static void main(String[] args) {
        //created soldier which is ready for fight
        Soldier availableSoldier = new Soldier(100, 45, 20,
                50, 60, 5, "Sward", true);
        System.out.println("**************** Available Soldier Prototype ******************");

        availableSoldier.showSoldierInfo();

        Soldier notAvailableSoldier = new Soldier(100, 45, 20,
                50, 60, 5, "Sward", false);
        System.out.println("****************Not Available Soldier Without Clone ******************");
        notAvailableSoldier.showSoldierInfo();

        //to clone the prototype class
        Soldier notAvailableSoldier2 =  availableSoldier.clone();
        notAvailableSoldier2.setAvailableToFight(false);
        notAvailableSoldier2.setWeapon("Gun");
        System.out.println("****************Not Available Soldier With Clone ******************");

        notAvailableSoldier2.showSoldierInfo();

    }
}
