package hello.hello.member;

public class MemberServiceImpl implements  MemberService{
    final static MemberRepository memberRepository=new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
