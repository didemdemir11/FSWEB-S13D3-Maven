package org.example;

public class Person {
        String firstName;
        String lastName;
        int age;
        int grade;
        String[] gender;
        String address;

        public Person(String firstName,String lastName, int age){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;

        }
        public Person(String firstName,String lastName, int age,int grade,String[] gender,String address){
            this(firstName,lastName,age);
            this.grade = grade;
            this.gender = gender;
            this.address=address;
        }
        public  String getFirstName(){
            return firstName;
        }
        public  String getLastName(){
            return lastName;
        }

        public int getAge() {
            return age;
        }
        public boolean isTeen(){
            return age >= 13 && age <=19;
        }
    }

