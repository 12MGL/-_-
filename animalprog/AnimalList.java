package animalprog;

import java.time.*;
import java.util.*;




public class AnimalList {
    private static int animalCount = 0;
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить животное");
            System.out.println("2. Показать команды животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Список животных по дате рождения");
            System.out.println("5. Выход");
            int menuscanner = scanner.nextInt();
            if (menuscanner == 1) {
                newAnimal(scanner);
            }
            else if (menuscanner == 2) {
                CommandsList(scanner);
            }
            else if (menuscanner == 3) {
                newCommand(scanner);
            }
            //else if (menuscanner == 4) {
            //    ListbyDate(scanner);
            //}
            else return;
        }
    }
//}

    private static void newAnimal(Scanner scanner) {
        System.out.println("Выберите вид животного: ");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Хомяк");
        System.out.println("4. Лошадь");
        System.out.println("5. Верблюд");
        System.out.println("6. Осёл");
        int newanimscanner = scanner.nextInt();
        System.out.println("Введите кличку животного: ");
        String scanname = scanner.next();
        System.out.println("Введите дату рождения животного в формате ГГГГ ММ ДД: ");
        LocalDate scanbirthDate = LocalDate.parse(scanner.next());
        if (newanimscanner == 1) {
            animals.add(new Dog(animalCount++, scanname, scanbirthDate));
        }
        else if (newanimscanner == 2) {
            animals.add(new Cat(animalCount++, scanname, scanbirthDate));
        }
        else if (newanimscanner == 3) {
            animals.add(new Hamster(animalCount++, scanname, scanbirthDate));
        }
        else if (newanimscanner == 4) {
            animals.add(new Horse(animalCount++, scanname, scanbirthDate));
        }
        else if (newanimscanner == 5) {
            animals.add(new Camel(animalCount++, scanname, scanbirthDate));
        }
        else if (newanimscanner == 6) {
            animals.add(new Donkey(animalCount++, scanname, scanbirthDate));
        }
        else return;
        }
    

    private static void CommandsList(Scanner scanner) {
        System.out.println("Введите id животного: ");
        int id = scanner.nextInt();
        for (Animal animal : animals) {
            if (animal.id == id) {
                animal.CommandsList();
                break;
            }
        }
    }

    private static void newCommand(Scanner scanner) {
        System.out.println("Введите id животного: ");
        int scanid = scanner.nextInt();
        System.out.println("Введите команду: ");
        String command = scanner.next();
        for (Animal animal : animals) {
            if (animal.id == scanid) {
                animal.commands.add(command);
                break;
            }
        }
    }
/* 
    private static void ListbyDate(Scanner scanner) {
        System.out.println("Введите id животного: ");
        int scanid = scanner.nextInt();
        System.out.println("Введите команду: ");
        String command = scanner.next();
        Ffor (int id = scanid) {
        animal.commands.add(command);
        //чушь 2
        }    
*/
    }