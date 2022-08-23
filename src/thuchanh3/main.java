package thuchanh3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student=new Student("kien",30,"hanoi");
        Student student1=new Student("Nam",26,"thai binh");
        Student student2=new Student("Tung",38,"nam dinh");
        Student student3=new Student("anh",38,"quang ninh");
        List<Student>list=new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for(Student st:list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi");
        for(Student st:list){
            System.out.println(st.toString());
        }
    }
}
