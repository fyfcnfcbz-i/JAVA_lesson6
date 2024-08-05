package org.example.laptop;

import java.util.*;

public class LStore {

    public static List<Laptop> createLaptops() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Asus", 8, 256, "Windows", 10000));
        laptops.add(new Laptop("Asus", 32, 256, "Windows", 20000));
        laptops.add(new Laptop("Apple", 16, 512, "MacOS", 50000));
        laptops.add(new Laptop("Lenovo", 8, 1024, "Linux", 30000));
        laptops.add(new Laptop("Huawei", 16, 2048, "Windows", 70000));
        laptops.add(new Laptop("HP", 16, 1024, "Windows", 40000));
        laptops.add(new Laptop("Apple", 64, 2048, "MacOS", 100000));
        return laptops;
    }

    private Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void displayAllLaptops() {
        System.out.println("Все доступные ноутбуки:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
        System.out.println("Всего ноутбуков: " + laptops.size());
    }

    public void filterLaptops() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("1 - Бренд");
            System.out.println("2 - ОЗУ");
            System.out.println("3 - HDD");
            System.out.println("4 - Операционная система");
            System.out.println("5 - Цена");
            System.out.println("9 - Вывести список");

            int choice = scanner.nextInt();

            if (choice == 9) break;

            switch (choice) {
                case 1:
                    System.out.println("Введите Бренд: ");
                    filters.put("brand", scanner.next());
                    break;
                case 2:
                    System.out.println("Введите ОЗУ(GB): ");
                    filters.put("ram", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Введите  HDD(GB): ");
                    filters.put("storage", scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Введите ОС: ");
                    filters.put("os", scanner.next());
                    break;
                case 5:
                    System.out.println("Введите Цену: ");
                    filters.put("price", scanner.nextDouble());
                    break;
                default:
                    System.out.println("Неверный выбор.");

            }
        }

        Set<Laptop> filteredLaptops = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {
            if (filters.containsKey("brand") && !laptop.getBrand().equalsIgnoreCase((String) filters.get("brand"))) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("storage") && laptop.getStorage() < (int) filters.get("storage")) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                filteredLaptops.remove(laptop);
            }
            if (filters.containsKey("price") && laptop.getPrice() > (double) filters.get("price")) {
                filteredLaptops.remove(laptop);
            }
        }

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}
