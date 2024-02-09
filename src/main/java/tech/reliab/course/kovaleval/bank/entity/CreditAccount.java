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

public class CreditAccount {
    private long id;
    private User user;
    private String bankName;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int countMoth;
    private long loanAmount;
    private long monthlyPayment;
    private double interestRate;
    private String issuedEmployee;
    private PaymentAccount paymentAccount;
}
