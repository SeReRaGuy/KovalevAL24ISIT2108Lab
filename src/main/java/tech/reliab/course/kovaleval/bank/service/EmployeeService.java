package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    Employee createEmployee(long id, String name, String lastName, String middleName,
                            LocalDate dateOfBirth, String post, Bank bankPost,
                            boolean distantly, BankOffice officeWork, boolean giveCredit,
                            double salary);
    Employee getEmployee(long id);
    void updateEmployee(long id);
    void deleteEmployee(long id);
}
