package org.lexicon;

public class Person {

    private int id;
    private String firstname;
    private String lastName;
    private String email;


    public Person(int id,String firstname,String lastName,String email) {

        if (firstname == null || firstname.isEmpty()) {
            throw new RuntimeException("Not allowed to be null");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new RuntimeException("Not allowed to be null");
        }
        if (email == null || email.isEmpty()) {
            throw new RuntimeException("Not allowed to be null");
        }
    }

    //Getter

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //Setter


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
