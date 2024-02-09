package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
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
}
