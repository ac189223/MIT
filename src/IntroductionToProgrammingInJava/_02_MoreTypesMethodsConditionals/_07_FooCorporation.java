package IntroductionToProgrammingInJava._02_MoreTypesMethodsConditionals;

public class _07_FooCorporation {

    static class Employee {
        String name;
        double basePay;
        int hoursWorked;
        int regularHours;
        int overHours;

        Employee(String name, double basePay, int hoursWorked) {
            this.name = name;
            this.basePay = basePay;
            this.hoursWorked = hoursWorked;
            if (hoursWorked > 40) {
                this.regularHours = 40;
                this.overHours = hoursWorked - 40;
            } else {
                this.regularHours = hoursWorked;
                this.overHours = 0;
            }
        }
    }

    public static double calculateIncome(Employee employee){
        double income = employee.basePay * (employee.regularHours + employee.overHours * 1.5);
        return income;
    }

    public static void main(String[] args) {

        double minimumWage = 8.0;
        Employee employee1 = new Employee("Employee1", 7.50, 35);
        Employee employee2 = new Employee("Employee2", 8.20, 47);
        Employee employee3 = new Employee("Employee3", 10.00,73);

        Employee[] employees = {employee1, employee2, employee3};

        for (Employee employee : employees) {
            if (employee.basePay < minimumWage) {
                System.out.println(employee.name + " does not reach minimum wage - solve it!");
            } else if (employee.hoursWorked > 60) {
                System.out.println(employee.name + " worked too much - solve it!");
            } else {
                System.out.println(employee.name + " salary this month is " + calculateIncome(employee) + ".");
            }
        }

    }
}

//    Foo Corporation needs a program to calculate how much to pay their hourly employees.
//    Employees get paid times 1.5 for any hours over 40 that they work in a single week.
//    For example, if an employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay.
//
//    The State of Massachusetts requires that hourly employees be paid at least $8.00 an hour.
//    Foo Corp requires that an employee not work more than 60 hours in a week.
//
//    An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
//    For every hour over 40, they get overtime = (base pay) × 1.5.
//    The base pay must not be less than the minimum wage ($8.00 an hour), otherwise error.
//    If the number of hours is greater than 60, print an error message.
//
//    Create a new class called FooCorporation.
//    Write a method that takes the base pay and hours worked as parameters,
//    and prints the total pay or an error.
//    Write a main method that calls this method for each of these employees:
//                  Base Pay        Hours Worked
//    Employee 1    $7.50           35
//    Employee 2    $8.20           47
//    Employee 3    $10.00          73