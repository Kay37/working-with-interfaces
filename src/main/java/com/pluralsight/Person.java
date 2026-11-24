package com.pluralsight;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
                                    //! Returns a negative # if the name comes before other person's alphabetically.
                                    //! Returns a 0 if they match.
                                    //! Returns a positive # if the name comes AFTER other person's alphabeTically.
        int LastNameComparison =  this.lastName.compareTo(o.lastName);
        //! So, if not a match, return the sorted order.
        if(LastNameComparison != 0){
            return LastNameComparison;
        }
        //! Else, if it is a match, sort by first name. So forth, with age as last comparison filter.
        int firstNameComparison =  this.firstName.compareTo(o.firstName);
        if(firstNameComparison != 0){
            return firstNameComparison;
        }

        return Integer.compare(this.age, o.age);

    }
}
