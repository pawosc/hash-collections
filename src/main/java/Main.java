import com.git.pawosc.hash.collections.HashSet;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            hashSet.add(UUID.randomUUID().toString());
        }

        System.out.println(hashSet);
    }
}
