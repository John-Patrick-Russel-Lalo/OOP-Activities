public class Dog{
    String name;
    boolean isMale;
    int numberOfPuppies;
    Dog[] listOfPuppies;

    public int setPuppies(Dog puppy){
        listOfPuppies[numberOfPuppies] = puppy;
        return numberOfPuppies++;
    }

    /*
    public void setPuppies(String namez, boolean isMale){
        Dog Names = new Dog();
        Names.name = setName(namez);
        Names.isMale = isMale;
        listOfPuppies[numberOfPuppies] = Names;
        numberOfPuppies++;
    }
    */

    public String setName(String names){
        name = names;
        return names;
    }

    public String showName(){
        System.out.println("My name is "+name);
        return name;
    }

    public void setNumberPuppies(int x){
        listOfPuppies = new Dog[x];
    }

    public void bark(){
         System.out.println(name+" - arf arf!");
    }

    public int showNumberPuppies(){
        System.out.println("Number of puppies: "+numberOfPuppies);
        return numberOfPuppies;
    }

    public void showAllPuppies(){
        for(int i = 0; i < numberOfPuppies; i++){
            System.out.println("\n"+"Num Puppy: "+i);
            System.out.println("Name: "+listOfPuppies[i].name);
            System.out.println("Is Male: "+listOfPuppies[i].isMale);
        };
    }
}