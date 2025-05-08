public interface example {
    
    public void register();
 
}
 class EmployeeTask implements example{
    private String name;
    private String date;
    private int salary;
    
    public EmployeeTask(){
        name = null;
        date = null;
        salary = 0;
    }
    public EmployeeTask(String name, String date, int salary){
        this.name = name;
        this.date = date;
        this.salary = salary;
    }
    @Override
    public void register(){
        System.out.println("Employee is registered " + "Name " + name + " salary " + salary + " date " + date); 

    }
}


class studentTask implements example{

    private String name;
    private int age;
    private double gpa;
    
    public studentTask(){
        name = null;
        age = 0;
        gpa = 0;
    }

    public studentTask(String name, int age, double gpa){
        
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public void register(){
        System.out.println("Student is registered  " + "Student name " + name 
        + " gpa " + gpa); 
    }
}
