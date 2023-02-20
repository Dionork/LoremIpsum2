import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        set = new HashSet<>();
    }

    public boolean hasWord(String word) {
        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
