public class Toy {
    private int ID;
    private String Name;
    private int Amount;
    private int Chance;
    Toy(){}
    Toy(int ID, String Name, int Amount, int Chance){
        setID(ID);
        setName(Name);
        setAmount(Amount);
        setChance(Chance);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int getChance() {
        return Chance;
    }

    public void setChance(int chance) {
        Chance = chance;
    }
}
