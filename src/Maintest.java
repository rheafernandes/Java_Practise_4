import java.util.*;

public class Maintest {
    public static void main(String[] args) {
        List<Student> userList= new ArrayList<>();
        userList.add(new Student("129417","Rhea",29));
        userList.add(new Student("129418","Hazel",22));
        userList.add(new Student("129489","Bud",21));
        userList.add(new Student("129490","Shane",22));
        userList.add(new Student("129423","Anna",23));
        for(Student obj:userList){
            System.out.println(obj.getAge()+" "+obj.getName()+" "+obj.getId());
        }
        Collections.sort(userList,new StudentSorter());
        for(Student obj:userList){
            System.out.println(obj.getAge()+" "+obj.getName()+" "+obj.getId());
        }

    }
}
