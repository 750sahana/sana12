public class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee (int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent)
    {
        if (percent >0)
        {
            double raise=salary*(percent/100);
            salary+=raise;
            System.out.println(name+"salaryraised by"+percent+"%.Newsalary:"+salary);
        }
        else{
            System.out.println("Please provid a positive percent for salaryraise.");
        }
    }
    public void displayInfo()
{
    System.out.println("EmployeeId:"+id);
    System.out.println("EmployeeName:"+name);
    System.out.println("EmployeeSalary:"+salary);
}
public static void main(String[] args)
{
    Employee emp=new Employee(1001,"JohnDoe",50000);
System.out.println("Initial Information:");
emp.displayInfo();
double raisePercentage=10;
emp.raiseSalary(raisePercentage);
System.out.println("\nInformation after salary raise:");
emp.displayInfo();

}
}