package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class User {
    private long id;
    private String name;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String placeOfWork;
    private double profit;
    private List<Bank> banks;
    private List<CreditAccount> CreditAccounts;
    private List<PaymentAccount> PaymentAccounts;
    private double rating;
}
