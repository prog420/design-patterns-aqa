package patterns.creational.prototype.v1;


import patterns.creational.prototype.v1.npc.Swordsman;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.setLocation(1, 1);
        swordsman.attack();
        Swordsman newSwordsman = (Swordsman) swordsman.clone();
        System.out.println(swordsman);
        System.out.println(newSwordsman);
    }
}
