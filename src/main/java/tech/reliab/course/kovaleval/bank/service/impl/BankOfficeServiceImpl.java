//На будущее: смысл передавать кол-во банкоматов, если их можно создать отдельно и
//сказать, где и в каком банке будут. Может легко возникнуть путаница из-за того,
//как сделано сейчас
package tech.reliab.course.kovaleval.bank.service.impl;

import tech.reliab.course.kovaleval.bank.entity.Bank;
import tech.reliab.course.kovaleval.bank.entity.BankOffice;
import tech.reliab.course.kovaleval.bank.service.BankOfficeService;
public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public BankOffice createBankOffice(long id, String name, String address,
                                       boolean status, boolean placeAtm, int countAtm,
                                       boolean getCredit, boolean getMoney, boolean giveMoney,
                                       double money, double rent, Bank bank) {
        BankOffice bankOffice = BankOffice.builder()
                .id(id)
                .name(name)
                .address(address)
                .status(status)
                .placeAtm(placeAtm)
                .getCredit(getCredit)
                .getMoney(getMoney)
                .giveMoney(giveMoney)
                .rent(rent)
                .build();
        if (bank.getCountAtm() < countAtm) throw new
                IllegalArgumentException("Банк не распоряжается таким количеством банкоматов");
        else bankOffice.setCountAtm(countAtm);
        if (bank.getMoney() < money) throw new
                IllegalArgumentException("Такого количества денег нет в банке");
        else bankOffice.setMoney(money);
        bank.setCountOffice(bank.getCountOffice() + 1);
        return null;
    }

    @Override
    public BankOffice getBankOffice(long id) {
        return null;
    }

    @Override
    public void updateBankOffice(long id) {

    }

    @Override
    public void deleteBankOffice(long id) {

    }
}
