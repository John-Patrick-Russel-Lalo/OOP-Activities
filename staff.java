package activity2;

class staff extends person {
    private String school;
    private double salary;

    public staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public double getSalary() {
        return salary;
    }
}