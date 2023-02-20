import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private Set<String> set;

    public WordsChecker(String text) {
        set = new HashSet<>();
        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
