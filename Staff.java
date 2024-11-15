public class Staff extends Person{
    protected String School;
    protected int Salary;

    public Staff(String Name, String Address, String School, int Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public String getSchool(){
        return School;
    }
    public int getSalary(){
        return Salary;
    }
    @Override
    public String toString() {
        return "Hello I am " + Name + " I work at " + School + " with a salary of " + Salary + ".";
    }
}