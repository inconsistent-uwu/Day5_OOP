
public class PassByReference {
    public static void main(String[] args) {
        int x = 10;

        ChangeValue(x);
        System.out.println(x);

        Person p = new Person();

        p.age = 10;
        p.name = "Harshit";

        ChangePerson(p, 12, "Rahul");
        System.out.println(p.age);
        System.out.println(p.name);

    }

    public static void ChangeValue(int x) {
        x *= 2;
    }

    public static void ChangePerson(Person x, int y, String z) {
        x.setName(z);
        x.setAge(y);

    }

    public static class Person {
        int age;
        String name = new String();

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
