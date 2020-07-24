package example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class GetRandomAnswer {

    public String randNumber() {

        Set<Integer> set = new HashSet<>();

        Random random = new Random();

        while (set.size() < 4) {
            set.add(random.nextInt(10));
        }
        Iterator<Integer> iterator = set.iterator();
        StringBuilder answer = new StringBuilder();
        while (iterator.hasNext()) {
            answer.append(iterator.next());
        }
        return answer.toString();
    }
}
