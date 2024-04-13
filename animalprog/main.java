package animalprog;

import java.time.*;
import java.util.*;

class Animal {

    int id;
    String name;
    String type;
    LocalDate dateOfBirth;
    int age;
    List<String> commands;
    

    public Animal(int id, String name, LocalDate birthdate, List<String> commands) {
        this.id = id;
        this.name = name;
//        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    public void CommandsList() {
        System.out.println("Список команд: " + commands);
    }
}


    // 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick',
    // 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'



class Cat extends Animal {
    public Cat (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Sit");
    }
}

class Dog extends Animal {
    public Dog (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Sit");
    }
}

class Hamster extends Animal {
    public Hamster (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Roll");
    }
}

class Horse extends Animal {
    public Horse (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Trot");
    }
}

class Donkey extends Animal {
    public Donkey (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Walk");
    }
}

class Camel extends Animal {
    public Camel (int id, String name, LocalDate dateOfBirth) {
        super(id, name, dateOfBirth, new ArrayList<>());
        this.commands.add("Walk");
    }
}

