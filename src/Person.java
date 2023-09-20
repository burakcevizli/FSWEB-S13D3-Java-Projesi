public class Person {

    String firstName;
    String lastName;
    int age;
    String education;
    int id;
    int heigth;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person( String firstName, String lastName, int age,String education, int id, int heigth){
        this(firstName,lastName,age);
        this.education=education;
        this.id=id;
        this.heigth=heigth;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen (){
        return age < 20 && age > 12;
    }

}
