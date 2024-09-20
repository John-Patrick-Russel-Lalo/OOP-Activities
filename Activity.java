public class Activity{
    public static void main(String[] args) {
        
        Dog dogs = new Dog();
        dogs.setNumberPuppies(10);

        Dog dogFirst = new Dog();
        dogFirst.setName("John");
        dogFirst.isMale = true;
        dogs.setPuppies(dogFirst);

        Dog dogSecond = new Dog();
        dogSecond.setName("Patrick");
        dogSecond.isMale = true;
        dogs.setPuppies(dogSecond);

        Dog dogThird = new Dog();
        dogThird.setName("Russel");
        dogThird.isMale = true;
        dogs.setPuppies(dogThird);
        
        dogs.showNumberPuppies();

        dogFirst.bark();
        dogSecond.bark();
        dogThird.bark();

        dogFirst.showName();
        dogSecond.showName();
        dogThird.showName();

        dogs.showAllPuppies();

    }
}