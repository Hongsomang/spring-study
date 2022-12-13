package hello.hello.discount;

import hello.hello.member.Member;

public interface DiscountPolicy {
    int discount(Member member,int price);

}
