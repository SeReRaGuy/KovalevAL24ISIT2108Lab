package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Builder

public class Employee {
    private long id;
    private String name;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String post;
    private Bank bankPost;
    private boolean distantly;
    private BankOffice officeWork;
    private boolean giveCredit;
    private double salary;

    @Override
    public String toString()
    {
        return "Id сотрудника: " + id
                + "\nИмя сотрудника: " + name
                + "\nФамилия сотрудника: " + lastName
                + "\nОтчество сотрудника: " + middleName
                + "\nДата рождения: " + dateOfBirth
                + "\nДолжность: " + post
                + "\nБанк, в котором работает (id): " + bankPost.getId()
                + "\nРаботает дистанционно: " + distantly
                + "\nОфис, в котором работает (id): " + officeWork.getId()
                + "\nМожет выдать кредит: " + giveCredit
                + "\nЗарплата: " + salary;
    }
}
