import java.util.*;
import java.time.*;


class Animal {

    int id;
    String name;
    String type;
    LocalDate dateOfBirth;
    int age;
    List<String> commands;
}
    

public Animal(int id, String name, LocalDate birthdate, List<String> commands) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.age = age_count();
    this.commands = new ArrayList<>();
}

public void CommandsList() {
    System.out.println("Список команд: " + commands);
}
public int age_count() {
//дописать подсчёт возраста от текущей даты
}



    // 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick',
    // 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'



class Cat extends Animal {
    public Cat (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Sit");
    }
}

class Dog extends Animal {
    public Dog (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Sit");
    }
}

class Hamster extends Animal {
    public Hamster (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Roll");
    }
}

class Horse extends Animal {
    public Horse (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Trot");
    }
}

class Donkey extends Animal {
    public Donkey (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Walk");
    }
}

class Camel extends Animal {
    public Camel (int id, String name, LocalDate dateOfBirth, List<String> commands) {
        super(id, name, dateOfBirth, commands);
        this.commands.add = ("Walk");
    }
}

public class AnimalList {
    private static List<Animal> animals = new ArrayList<>();
    public void main(String[] args) {
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
                CommandsList();
            }
            else if (menuscanner == 3) {
                newCommand(scanner);
            }
            else if (menuscanner == 4) {
                ListbyDate(scanner);
            }
            else return;


            }
        }
    }

    private static void newAnimal(Scanner scanner) {
        System.out.println("Выберите вид животного: ");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Хомяк");
        System.out.println("4. Лошадь");
        System.out.println("5. Верблюд");
        System.out.println("6. Осёл");
        int scantype = scanner.nextInt();
        System.out.println("Введите кличку животного: ");
        String scanname = scanner.next();
        System.out.println("Введите дату рождения животного: ");
        LocalDate scanbirthDate = LocalDate.parse(scanner.next());
        // дописать логику
        int newanimscanner = scanner.nextInt();
        if (newanimscanner == 1) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Dog;
        }
        else if (newanimscanner == 2) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Dog;
        }
        else if (newanimscanner == 3) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Hamster;
        }
        else if (newanimscanner == 4) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Horse;
        }
        else if (newanimscanner == 5) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Camel;
        }
        else if (newanimscanner == 6) {
            int id++;
            animal = new Animal(int id; String type; String name; LocalDate birthDate);
            String type = Donkey;
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
        For (int id = scanid) {
            animal.displayCommands();
            //чушь
        }
   

    }

    private static void ListbyDate(Scanner scanner) {
        System.out.println("Введите id животного: ");
        int scanid = scanner.nextInt();
        System.out.println("Введите команду: ");
        String command = scanner.next();
        For (int id = scanid) {
        animal.commands.add(command);
        //чушь 2
        }    
}