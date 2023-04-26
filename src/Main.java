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
        boolean Stop = true;
        List<Toy> Store = new LinkedList<Toy>();
        Queue<Toy> Store1 = new LinkedList<Toy>();
        Store.add(new Toy(0, "Кролик", 3, 15));
        Store1.add(new Toy(0, "Кролик", 3, 15));
        File file = new File("Toy.txt");
        PrintWriter pw = new PrintWriter(file);
        while (Stop) {
            System.out.println("""
                     Меню
                    1. Добавить игрушку.
                    2. Получить игрушку для розыгрыша
                    3. Добавить игрушку в очередь розыгрыша
                    4. Выход""");
            System.out.print("Выберите пункт меню:  ");
            int Menu = Sc.nextInt();
            switch (Menu) {
                case 1:
                    Toy T = addToy(Store);
                    Store.add(T);
                    break;
                case 2:
                    pw.println(Store1.poll().getName());
                    pw.close();
                    break;
                case 3:
                    Toy D = getPrize(Store);
                    Store1.add(D);
                    break;
                case 4:
                    Stop = false;
            }
        }
    }
}