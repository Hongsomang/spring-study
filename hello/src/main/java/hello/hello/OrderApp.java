package hello.hello;

import hello.hello.member.Grade;
import hello.hello.member.Member;
import hello.hello.member.MemberService;
import hello.hello.member.MemberServiceImpl;
import hello.hello.order.Order;
import hello.hello.order.OrderService;
import hello.hello.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        OrderService orderService=new OrderServiceImpl();
        Long memberId=1L;
        Member member=new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);
        Order order=orderService.createOrder(memberId,"itemA",10000);
        System.out.println("order:"+order);
        System.out.println("order:"+order.caculatorPrice());

    }
}
