package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BankOffice {
    private long id;
    private String name;
    private String address;
    private boolean status;
    private boolean placeAtm;
    private int countAtm;
    private boolean getCredit;
    private boolean getMoney;
    private boolean giveMoney;
    private double money;
    private double rent;

    @Override
    public String toString()
    {
        return "Id офиса: " + id
                + "\nНазвание офиса: " + name
                + "\nАдрес офиса: " + address
                + "\nСтатус: " + status
                + "\nМожно разместить банкомат: " + placeAtm
                + "\nКоличество банкоматов: " + countAtm
                + "\nМожет выдать кредит: " + getCredit
                + "\nМожет положить деньги: " + getMoney
                + "\nМожет выдать деньги: " + giveMoney
                + "\nКол-во денег: " + money
                + "\nАренда: " + rent;
    }
}
