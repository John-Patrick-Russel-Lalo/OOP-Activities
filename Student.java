class Student extends Person{
    private String Program;
    private int year;

    public Student (String Name, String Address, String Program, int year){
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.year = year;
    }
    public void setProgram(String Program){
        this.Program = Program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getProgram(){
        return Program;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString(){
        return "Hello I am " + Name + " I lived in " + Address + ". I am " + year + " year of " + Program + ". ";
    }
}