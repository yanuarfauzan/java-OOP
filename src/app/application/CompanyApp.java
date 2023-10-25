package app.application;

import app.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        // Akses Inner Class Employee di Class Company
        Company company = new Company();
        company.setName("Programmer");

        Company.Employee employee = company.new Employee();
        employee.setName("Employee Fauzan");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
