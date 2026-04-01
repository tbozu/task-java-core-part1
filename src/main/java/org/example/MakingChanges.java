package org.example;

 public class MakingChanges {


    public static String changeIdentities(Person personOne, Person personTwo){

        int tempAgePersoneOne = personOne.getAge();
        int tempAgePersoneTwo = personTwo.getAge();

        personOne.setAge(tempAgePersoneTwo);
        personTwo.setAge(tempAgePersoneOne);

        String tempNamePersoneOne = personOne.getName();
        String tempNamePersoneTwo = personTwo.getName();

        personOne.setName(tempNamePersoneTwo);
        personTwo.setName(tempNamePersoneOne);

        return personOne.getName()+ personOne.getAge() + personTwo.getName() + personTwo.getAge();
    }
}
