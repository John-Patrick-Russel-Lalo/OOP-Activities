class Dog {
    String name;
    boolean isMale;
    int numOfPuppies;
    String[] puppies = new String[numOfPuppies];
    Dog puppy;

    public void setName(String setN){
        name = setN;
    }

    public String[] showName(){
        return puppies;
    }

    public void bark(){
        System.out.println("Woof woof");
    }

    public void setNumberPuppies(int numP){
        numOfPuppies = numP;
    }

    public int showNumPuppies(){
        return numOfPuppies;
    }

    public void showPuppies(){

        for(int i = 0; i < puppies.length; i++){
            
        }
    }
}
