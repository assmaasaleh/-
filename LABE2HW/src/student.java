public class student {

      private   String name;
     private    int age;


    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override

    public String toString() {
        return "student{" + "name = " +name+ '\'' + " ,age=" + age + '}';
    }
    public static void main(String[] args) {
        student[]  students=new student[2];
        students[0]=new student("asma",20);
        students[1]=new student("saleh",30);
        for (int i = 0; i <students.length ; i++) {
            System.out.println("name student:"+students[i].getName());
            System.out.println("age student:"+students[i].getAge());
            System.out.println();

        }

    }


}




