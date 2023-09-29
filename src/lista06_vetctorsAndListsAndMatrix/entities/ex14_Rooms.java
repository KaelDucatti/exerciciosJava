package lista06_vetctorsAndListsAndMatrix.entities;

public class ex14_Rooms {
    private String name;
    private String email;

    public ex14_Rooms(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name
                + ", "
                + email;
    }
}
