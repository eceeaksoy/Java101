package Odev.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours,hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary > 1000)
        {
            return this.salary * 0.03;
        }
        else {
            return 0;
        }
    }

    double bonus(){
        if (this.workHours > 40)
        {
            int x = workHours - 40;
            return 30.0*x;
        }
        else {
            return 0;
        }
    }

    double raiseSalary(){
        int raise = 2021 - this.hireYear;
        if (raise < 10)
        {
            return this.salary * 0.05;
        }
        else if ((raise > 9) && (raise < 20))
        {
            return this.salary * 0.1;
        }
        else
        {
            return this.salary * 0.15;
        }
    }

    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working Hour: " + this.workHours);
        System.out.println("Year of Hire: " + this.hireYear);
        System.out.println("Tax:: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Increment of Salary: " + raiseSalary());
        double salaryTaxBonus = this.salary - tax() + bonus();
        System.out.println("Salary With Tax and Bonus: " + salaryTaxBonus);
        System.out.println("Total Salary: " + (this.salary + raiseSalary()));
    }
}
