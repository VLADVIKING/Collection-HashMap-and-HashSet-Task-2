import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
