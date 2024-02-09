package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class BankAtm {
    private long id;
    private String name;
    private String address;
    private String status;
    private Bank belongBank;
    private BankOffice belongOffice;
    private Employee serviceEmployee;
    private boolean getMoney;
    private boolean giveMoney;
    private double money;
    private double serviceMoney;
}
