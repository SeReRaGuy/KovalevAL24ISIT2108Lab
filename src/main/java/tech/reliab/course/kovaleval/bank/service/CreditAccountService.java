package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.CreditAccount;
import tech.reliab.course.kovaleval.bank.entity.PaymentAccount;
import tech.reliab.course.kovaleval.bank.entity.User;

import java.time.LocalDate;

public interface CreditAccountService {
    CreditAccount createCreditAccount(long id, User user, LocalDate dateStart, LocalDate dateEnd,
                                      int countMoth, long loanAmount, long monthlyPayment,
                                      double interestRate, String issuedEmployee,
                                      PaymentAccount paymentAccount);
    CreditAccount getCreditAccount(long id);
    void updateCreditAccount(long id);
    void deleteCreditAccount(long id);
}
