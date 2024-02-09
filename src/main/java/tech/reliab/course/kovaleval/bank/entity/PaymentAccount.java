package tech.reliab.course.kovaleval.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PaymentAccount {
    private long id;
    private User user;
    private String bankName;
    private double money;
}
