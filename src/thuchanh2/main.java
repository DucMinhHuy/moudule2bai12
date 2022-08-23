package thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Student student=new Student("nam",20,"hn");
        Student student1=new Student("huy",23,"tb");
        Student student2=new Student("ha",22,"HN");
        Map<Integer,Student>studentMap=new HashMap<Integer,Student>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        studentMap.put(4,student1);
        for(Map.Entry<Integer,Student> studentMain:studentMap.entrySet()){
            System.out.println(studentMain.toString());
        }
        System.out.println("......Set");
        Set<Student>students=new HashSet<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student);
        for(Student studentHe:students){
            System.out.println(studentHe.toString());
        }
    }
}
