package hello.hello.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MemoryMemberRepository  implements MemberRepository{
    private static Map<Long, Member> store= new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
