import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord (String word){
        Set<String> set = new HashSet<>();
        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
        if (set.contains(word)){
            return true;
        }
        return false;
    }
}
