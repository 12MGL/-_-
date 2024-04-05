import java.util.*;
import java.time.*;


class Animal {

    int id;
    string name;
    string type;
    LocalDate birthdate;
    int age;
    List<string> commands;
}
    

public Animal(int id, String name, LocalDate birthdate, Map<String, String> commands) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.age = age_count();
    this.commands = new ArrayList<>();
}

public void CommandsList() {
    // для вывода списка команд 
}
public int age_count() {
//дописать подсчёт возраста от текущей даты
}



    // 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick',
    // 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'



class Cat extends Animal {
    public Cat (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

class Dog extends Animal {
    public Dog (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

class Hamster extends Animal {
    public Hamster (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

class Horse extends Animal {
    public Horse (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

class Donkey extends Animal {
    public Donkey (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

class Camel extends Animal {
    public Camel (int id, String name, LocalDate birthDate, Map<String, String> commands) {
        super(id, name, birthDate, commands);
    }
}

public class AnimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить животное");
            System.out.println("2. Показать команды животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Список животных по дате рождения");
            System.out.println("5. Выход");
            // дальше-то что?
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
