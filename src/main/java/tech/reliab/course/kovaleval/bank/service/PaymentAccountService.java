package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.PaymentAccount;
import tech.reliab.course.kovaleval.bank.entity.User;

public interface PaymentAccountService {
    PaymentAccount createPaymentAccount(long id, User user, Bank bank);
    PaymentAccount getPaymentAccount(long id);
    void updatePaymentAccount(long id);
    void deletePaymentAccount(long id);
}
