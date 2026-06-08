package com.oops.practice;

import com.collections.practice.Employeetask;

interface Data{
      void dataEmployee(String name);
}

interface Salary{
    void salaryExpected(int salary);
}

interface Company extends Salary, Data{

}
class Employees implements Company
{

    public void dataEmployee(String name) {
        System.out.println(name);
    }

    public void salaryExpected(int salary) {
        System.out.println(salary);
    }
}


public class ContractAllocationInterface {
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        emp1.dataEmployee("Ashwin");
        emp1.salaryExpected(50000);
    }
}
