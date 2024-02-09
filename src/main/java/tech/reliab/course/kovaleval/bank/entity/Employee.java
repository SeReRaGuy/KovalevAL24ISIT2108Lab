package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString

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
}
