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
        Store1.add(new Toy(0, "Кролик", 3, 15));
        File file = new File("Toy.txt");
        PrintWriter pw = new PrintWriter(file);
        while (true) {
            System.out.println(" Меню\n" +
                    "1. Добавить игрушку.\n" +
                    "2. Получить игрушку для розыгрыша\n" +
                    "3. Добавить игрушку в очередь розыгрыша\n" +
                    "4. Изменить вероятность получения игрушки\n" +
                    "5. Выход");
            System.out.print("Выберите пункт меню:  ");
            int Menu = Sc.nextInt();
            switch (Menu) {
                case 1:
                    Toy T = addToy(Store);
                    Store.add(T);
                case 2:
                    pw.println(Store1.poll().getName());
                case 3:
                    Toy D = getPrize(Store);
                    Store1.add(D);
                case 4:
                    changeChance(Store);
                case 5:
                    break;
                }
            }
        }
    }