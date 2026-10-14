package uk.ac.westminster.products_api;

/**
 * Week 1 starter class.
 * <p>
 * Already provided:
 * - a private "name" field
 * - a no-argument constructor (required by Jackson later in the module)
 * - a full constructor
 * - a getter and setter for "name"
 */
public class Person {

    private String name;
    private String email;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
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

}
