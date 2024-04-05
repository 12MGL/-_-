package IKR_1;

import java.util.*;
import java.time.*;


public class Animal {

    int id;
    string name;
    string type;
    LocalDate birthdate;
    int age;
    List<string> commands;
    int count_obshii = 0;

public Animal(int id, String name, LocalDate birthdate, Map<String, String> commands) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.age = calculateAge();
    this.commands = new ArrayList<>();
}


    public int age_count() {
//дописать подсчёт возраста от текущей даты
}
    public void listofcommands() {
//вывод списка команд для экземпляра. дописать
}

public void addCommand(String command) {
    commands.add(command);
}

public void newAnimal() {
//новое животное
}

    // 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick',
    // 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'

}

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

