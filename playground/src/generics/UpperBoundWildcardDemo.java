package generics;

import java.util.ArrayList;

public class UpperBoundWildcardDemo {

    //static void printStudents(ArrayList<Student> students) { // will get compile time error at line 23 and 24
    // --> need to use UPPER BOUND WILDCARD
    static void printStudents(ArrayList<? extends Student> students){
        for (Student student : students)
            student.print();
    }

    public static void main(String[] args) {

        ArrayList<EngineeringStudent> engineeringStudents= new ArrayList<>();
        engineeringStudents.add(new EngineeringStudent());
        engineeringStudents.add(new EngineeringStudent());

        ArrayList<ManagementStudent> managementStudents = new ArrayList<>();
        managementStudents.add(new ManagementStudent());
        managementStudents.add(new ManagementStudent());

        printStudents(engineeringStudents);
        printStudents(managementStudents);
    }
}