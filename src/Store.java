import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public  class Store extends Toy{
    Scanner Sc = new Scanner(System.in);
    Random Rand = new Random();
    public static Toy addToy(List<Toy> Store){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Введите имя новой игрушки: ");
        String Name = Sc.nextLine();
        int ID = Store.get(Store.size()-1).getID() + 1;
        System.out.print("Введите количество игрушек: ");
        int Amount = Sc.nextInt();
        System.out.print("Введите Частоту выпадения новой игрушки от 0 до 100%: ");
        int Chance = Sc.nextInt();
        return (new Toy(ID,Name,Amount,Chance));
    }

    public void changeChance(List<Toy> Store){
        System.out.print("Введите имя искомой игрушки: ");
        String Name = Sc.nextLine();
        for (Toy toy : Store) {
            if (toy.getName().equals(Name)) {
                System.out.print("Введите новое значения шанса для игрушки от 0 до 100%: ");
                int Chance = Sc.nextInt();
                toy.setChance(Chance);
            }
        }
    }
    public Toy getPrize(List<Toy> Store){
        int Range = 0;
        Toy T = null;
        int getRange=0;
        for(Toy toy : Store) {
            Range += toy.getChance();
        }
        int NumberRand =  Rand.nextInt(1, Range);
        Range = 0;
            for (Toy toy : Store){
                if(toy.getAmount()>0) {
                    Range += toy.getChance();
                    if (Range > NumberRand) {
                        T = toy;
                        T.setAmount(T.getAmount() - 1);
                    }
                }
            }
            return T;
        }
}
