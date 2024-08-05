package org.example.laptop;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        LStore store = new LStore();

        List<Laptop> laptops = LStore.createLaptops();
        for (Laptop laptop : laptops) {
            store.addLaptop(laptop);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Магазин ноутбуков =====");
            System.out.println("1. Показать все ноутбуки");
            System.out.println("2. Отфильтровать ноутбуки");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.displayAllLaptops();
                    break;
                case 2:
                    store.filterLaptops();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный ввод.");
            }

        } while (choice != 0);
        scanner.close();
    }
}