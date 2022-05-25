package comparable.comparator;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hải", 28, "HT");
        Student student2 = new Student("Hiếu", 25, "LC");
        Student student3 = new Student("Tèo", 24, "NĐ");
        Student student4 = new Student("Minh", 24, "HN");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        SortAge sortAge = new SortAge();
        Collections.sort(lists, sortAge);
        System.out.println(" so sánh theo tuôi:");
        for (Student st : lists
        ) {
            System.out.println(st.toString());

        }
    }

}
