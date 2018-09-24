import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//4. Create a Student class that represents the following information of a student: id, name, and age all the member variables should be private .
//
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.
public class StudentSorter implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student studentA=(Student)o1;
        Student studentB=(Student)o2;
        if(studentA.getAge()==studentB.getAge()){
            if(studentA.getName().equals(studentB.getName())){
                return studentA.getId().compareTo(studentB.getId());
            }
            else
                return studentA.getName().compareTo(studentB.getName());
        }
        else
            return studentB.getAge()-studentA.getAge();
    }
}

