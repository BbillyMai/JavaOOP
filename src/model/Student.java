package model;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String stuNo;

    public Student(String name,int age, String sex, String stuNo){
        this.name = name;
        this.age = age ;
        this.stuNo = stuNo;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", stuNo='" + stuNo + '\'' +
                '}';
    }
}
