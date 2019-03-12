/*Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.*/
package by.bsu.student.run;

import by.bsu.student.utils.Person;
import by.bsu.student.utils.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student1 = new Student(1722193, "Petrov", "Petr", "Petrovich",
                2000, "Malinina 10", "+375292015419",
                "MMF", 2, 2);
        Student student2 = new Student(1722194, "Ivanov", "Ivan", "Ivanovich",
                2001, "Kalinina 8", "+375292578418",
                "MMF", 3, 2);
        Student student3 = new Student(1722195, "Sidorov", "Sidr", "Petrovich",
                2000, "Kazina 7", "+375292478124",
                "GEO", 3, 2);
        Student student4 = new Student(1722196, "Abramovich", "Albert", "Petrovich",
                2000, "Suvorova 5", "+375292536719",
                "MMF", 2, 3);
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Enter name facultet ");
        String enterfacultet = input.next();
        System.out.println(enterfacultet);
        for (int i=0; i<4; i++){
            if (students.get(i).getFacultet().equals(enterfacultet)){
                System.out.println(students.get(i).toString());
            }
        }
        System.out.print("Enter kurs and facultet ");
        int numberkurs = input.nextInt();
        enterfacultet = input.next();
        for (int i=0; i<4; i++){
            if (students.get(i).getFacultet().equals(enterfacultet) && students.get(i).getKurs() == numberkurs){
                System.out.println(students.get(i).toString());
            }
        }
        System.out.print("Enter year = ");
        int year = input.nextInt();
        for (int i=0; i<4; i++){
            if (students.get(i).getDatabirthday() > year){
                System.out.println(students.get(i));
            }
        }
        System.out.println("Enter facultet, kurs, group ");
        enterfacultet = input.next();
        numberkurs = input.nextInt();
        int numbergroup = input.nextInt();
        for (int i=0; i<4; i++){
            if (students.get(i).getFacultet().equals(enterfacultet) && students.get(i).getKurs() == numberkurs &&
                    students.get(i).getGroup() == numbergroup){
                System.out.println(students.get(i));
            }
        }
    }
}
