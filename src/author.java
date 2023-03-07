import java.util.Objects;

public class author {
    public author(String firstName, String lastName) {
        this.firstName = "Oscar";
        this.lastName = "Wylde";

    }

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
