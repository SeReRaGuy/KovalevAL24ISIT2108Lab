package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.entity.Employee;
import tech.reliab.course.kovaleval.bank.service.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee createEmployee(long id, String name, String lastName,
                                   String middleName, LocalDate dateOfBirth,
                                   String post, Bank bankPost, boolean distantly,
                                   BankOffice officeWork, boolean giveCredit,
                                   double salary) {
        Employee employee = Employee.builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .middleName(middleName)
                .dateOfBirth(dateOfBirth)
                .post(post)
                .bankPost(bankPost)
                .distantly(distantly)
                .officeWork(officeWork)
                .giveCredit(giveCredit)
                .salary(salary)
                .build();
        bankPost.setCountEmployee(bankPost.getCountEmployee() + 1);
        return employee;
    }

    @Override
    public Employee getEmployee(long id) {
        return null;
    }

    @Override
    public void updateEmployee(long id) {

    }

    @Override
    public void deleteEmployee(long id) {

    }
}
