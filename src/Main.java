import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main extends Store {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner Sc = new Scanner(System.in);
        List<Toy> Store = new LinkedList<Toy>();
        Queue<Toy> Store1 = new LinkedList<Toy>();
        Store.add(new Toy(0, "Кролик", 3, 15));
        File file = new File("Toy.txt");
        PrintWriter pw = new PrintWriter(file);
        while (true) {
            System.out.println(" Меню" +
                    "1. Добавить игрушку." +
                    "2. Получить игрушку для розыгрыша" );
            System.out.print("Выберите пункт меню:  ");
            int Menu = Sc.nextInt();
            switch (Menu) {
                case 1:
                    Toy T = addToy(Store);
                    Store.add(T);
                    Store1.add(T);
                case 2:
                    Toy Buff = Store1.poll();
                    pw.println(Buff.getName());
                    }
            }
        }
    }