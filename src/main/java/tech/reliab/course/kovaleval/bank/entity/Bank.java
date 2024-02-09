package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Bank {
    private long id;
    private String name;
    private int countOffice;
    private int countAtm;
    private int countEmployee;
    private int countUser;
    private int rating;
    private double money;
    private double interestRate;
}

