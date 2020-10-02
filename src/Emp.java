public class Emp {

    int empId;
    String name;
    int salary;

    public void Emp(int empId,String name,int salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;


    }
    public void Display(){

        System.out.println(empId+" "+name+" "+salary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
