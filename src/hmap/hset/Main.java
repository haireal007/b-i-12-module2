package hmap.hset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hải", 28, "HT");
        Student student2 = new Student("Tèo", 23, "NĐ");
        Student student3 = new Student("Hiếu", 24, "LC");
        Student student4 = new Student("Minh", 20, "HN");
        System.out.println("................HashMap");
        Map<String, Student> studentMap = new HashMap<String, Student>();
        studentMap.put("4", student1);
        studentMap.put("3", student2);
        studentMap.put("2", student3);
        studentMap.put("1", student4);

        for (Map.Entry<String, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("................SET");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student studentt : students) {
            System.out.println(studentt.toString());

        }
    }
}
