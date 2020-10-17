package exploring.stream.api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MappingStreamsExample {
    public static void main(String[] args){

        ArrayList<FullInfo> employee = new ArrayList<>();
        employee.add(new FullInfo("Ahmed","Mohamed","01098930028","ahmed11@gmail.com"));
        employee.add(new FullInfo("Rana","Mohamed","01169651189","rana204@gmail.com"));
        employee.add(new FullInfo("Fatma","Said","010851001105","fatmaElzahraa@gmail.com"));

        //Map from fullInfo stream to NameInfo Stream
        Stream<NameInfo> namesStream = employee.stream()
                .map(
                        (e) -> new NameInfo(e.getFirstName(),e.getLastName())
                );
        //use for each and toString to print the names
        namesStream.forEach((n)-> System.out.println(n));



    }
}

class FullInfo{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public FullInfo(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class NameInfo{
    private String firstName;
    private String lastName;


    public NameInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "NameInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
