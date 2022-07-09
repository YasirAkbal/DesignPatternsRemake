/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory.Bloch;

/**
 *
 * @author yasir
 * Bloch factory metotundan farklı olarak nesnelerin oluşturulmasından kendisinin sorumlu olmasını ama bunu public yapılandırıcılar aracılığıyla değil static, örnek oluşturup döndüren...
 * metotlar ile yapılması fikrini ortaya atmıştır. Bu metotlar farklı isimlerde olup yapılandırıcıların veremediği bazı bilgileri vererek farklı durumları temsil ederek yapılandırma...
 * esnasında dışarıdan verilmesi gereken parametre sayısını azalttığı için nesne oluşturmayı kolaylaştıracaktırç
 */
public class Employee {

    protected int no;
    protected String name;
    protected int year;
    protected String department;
    protected double salary;

    public static final int BASE_SALARY = 500;

    private Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public static Employee createNewEmployee(int no, String name, String department) {
        return new Employee(no, name, 0, department);
    }

    public static Employee createNewTemporaryEmployee(int no, String name) {
        return new Employee(no, name, 0, "Temp");
    }

    public void work() {
        System.out.println("Employee is working!");
    }

    public double calculateSalary() {
        salary = year * BASE_SALARY;
        return salary;
    }

    public void printInfo() {
        System.out.println("\nEmployee Info");
        System.out.println("No: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + ", salary="
                + salary + "]";
    }
}
