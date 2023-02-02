package diversos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        // Usando Predicate para filtrar pessoas com idade >= 30
        Predicate<Person> ageFilter = p -> p.getAge() >= 30;
        people.stream().filter(ageFilter).forEach(System.out::println);

        // Usando Consumer para imprimir o nome das pessoas
        Consumer<Person> namePrinter = p -> System.out.println(p.getName());
        people.forEach(namePrinter);

        // Usando Function para transformar Person em String
        Function<Person, String> nameExtractor = p -> p.getName();
        people.stream().map(nameExtractor).forEach(System.out::println);
    }
}