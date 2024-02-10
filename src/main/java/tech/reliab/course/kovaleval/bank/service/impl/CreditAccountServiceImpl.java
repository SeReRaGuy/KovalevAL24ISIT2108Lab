package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.CreditAccount;
import tech.reliab.course.kovaleval.bank.entity.PaymentAccount;
import tech.reliab.course.kovaleval.bank.entity.User;
import tech.reliab.course.kovaleval.bank.service.CreditAccountService;

import java.time.LocalDate;
import java.util.Random;

public class CreditAccountServiceImpl implements CreditAccountService {
    @Override
    public CreditAccount createCreditAccount(long id, User user, LocalDate dateStart,
                                             LocalDate dateEnd, int countMoth, long loanAmount,
                                             long monthlyPayment, double interestRate,
                                             String issuedEmployee, PaymentAccount paymentAccount,
                                             Bank bank) {
        CreditAccount creditAccount = CreditAccount.builder()
                .id(id)
                .user(user)
                .bankName(bank.getName())
                .dateStart(dateStart)
                .dateEnd(dateEnd)
                .countMoth(countMoth)
                .loanAmount(loanAmount)
                .monthlyPayment(monthlyPayment)
                .interestRate(Math.max(bank.getInterestRate() - new Random().nextDouble(5),0))
                .issuedEmployee(issuedEmployee)
                .paymentAccount(paymentAccount)
                .build();
        return creditAccount;
    }

    @Override
    public CreditAccount getCreditAccount(long id) {
        return null;
    }

    @Override
    public void updateCreditAccount(long id) {

    }

    @Override
    public void deleteCreditAccount(long id) {

    }
}
