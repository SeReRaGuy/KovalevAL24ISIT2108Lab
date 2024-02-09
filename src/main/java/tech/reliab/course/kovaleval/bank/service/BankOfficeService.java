package tech.reliab.course.kovaleval.bank.service;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;

public interface BankOfficeService {
    BankOffice createBankOffice(long id, String name, String address, boolean status, boolean placeAtm,
                                int countAtm, boolean getCredit, boolean getMoney, boolean giveMoney,
                                double money, double rent, Bank bank);
    BankOffice getBankOffice(long id);
    void updateBankOffice(long id);
    void deleteBankOffice(long id);
}
