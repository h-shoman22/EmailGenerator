
public class Employee {
    private String firstName;
    private String lastName;
    private String department;


    public Employee(String firstname, String lastname, String dptmnt){
        firstName = firstname;
        lastName = lastname;
        department = dptmnt;
        

    }

    public String getFN(){
        return firstName;
    }
    public String getLN(){
        return lastName;
    }
    public String getDPT(){
        return department;
    }
}
