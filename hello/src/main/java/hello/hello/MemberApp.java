package hello.hello;

import hello.hello.member.Grade;
import hello.hello.member.Member;
import hello.hello.member.MemberService;
import hello.hello.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember=memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember:"+findMember.getName());

    }
}
