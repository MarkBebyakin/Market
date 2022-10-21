import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Seller extends JFrame {

        public Seller() {
            String orderNum = "789 323 228 1337";
            JFrame frame = new JFrame("Test frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            String[] columnNames = {
                    "№ Товара",
                    "Название товара",
                    "Цена твара"
            };

            String[][] data = {
                    {"1", "Шаурма маленькая", "100,00 руб."},
                    {"2", "Шаурма классическая", "160,00 руб."},
                    {"3", "Шаурма экстра", "210,00 руб."},
            };

            JTable table = new JTable(data, columnNames);

            JScrollPane scrollPane = new JScrollPane(table);

            frame.getContentPane().add(scrollPane);
            frame.setPreferredSize(new Dimension(450, 200));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            Scanner scan = new Scanner(System.in);
            System.out.println(" Выберите товар и укажите его номер. ");
            int numberItem = scan.nextInt();

            if (numberItem > 3) {
                    System.out.println(" Данной позиции не существует ");
                    return;
            } else if(numberItem == 2) {
                    System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            }else if (numberItem == 1) {
                    System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            }else if (numberItem == 3) {
                    System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            }


            System.out.println(" Укажите адрес доставки. ");
            System.out.println(" Улица: ");
            String street = scan.next();
            System.out.println(" Дом: ");
            String house = scan.next();
            System.out.println(" Квартира: ");
            String flat = scan.next();
            System.out.println(" Товар будет доставлен по адресу " + " Улица " + street + ", Дом " + house + ", Кв. " + flat + ".");


            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println(" Ваш заказ готов, передаем в доставку ");
        }
    }

