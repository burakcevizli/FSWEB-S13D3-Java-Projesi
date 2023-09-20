public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe",13);
        System.out.println("First name : " + person.getFirstName());
        System.out.println("Last name : " + person.getLastName());
        System.out.println(" Age : " + person.getAge());
        System.out.println("isTeen : " + person.isTeen());
        System.out.println("*******************************");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        wall.setWidth(2.4);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());


    }
}