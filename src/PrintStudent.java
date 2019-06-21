import model.Student;

public class PrintStudent {

    public static void main(String[] args){
        Student stu = new Student("小明",21,"男","150202102529");
        System.out.println(stu.toString());
    }
}
