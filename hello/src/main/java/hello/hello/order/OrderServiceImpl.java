package hello.hello.order;

import hello.hello.discount.DiscountPolicy;
import hello.hello.discount.FixDiscountPolicy;
import hello.hello.member.Member;
import hello.hello.member.MemberRepository;
import hello.hello.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    final  static MemberRepository memberRepository=new MemoryMemberRepository();
    final  static DiscountPolicy discountPolicy =new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
       Member member=memberRepository.findById(memberId);
       int discountPrice=discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
