import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Employee("John", "Lennon", "Manager", 27045.78));
        list.add(new Employee("George", "Harrison", "Developer", 50000.00));

        list.add(new Student("Ringo", "Starr", 2.5));
        list.add(new Student("Paul", "McCartney", 3.8));

        Collections.sort(list);

        printData(list);
    }

    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.printf("%s earns %.2f tenge\n", payable.toString(), payable.getPaymentAmount());
        }
    }
}