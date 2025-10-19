import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.返回
     * 一个从每个小写字母到对应数字的映射关系，其中 'a' 对应的数字是 1，'b' 对应的是 2，'c' 对应的是 3，
     * 以此类推，直到 'z' 对应的是 26。
     *
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> map = new java.util.HashMap<>(26);
        for (char c = 'a'; c <= 'z'; c++){
            map.put(c,c - 'a' +1); //字符运算:'a'当成基准
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     *  返回一个由列表中的整数及其平方值组成的映射关系。例如，如果输入列表为 [1, 3, 6, 7]，
     *  则返回的映射关系为：1 对应 1，3 对应 9，6 对应 36，7 对应 49。
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> map = new java.util.HashMap<>();
        if (nums == null )return map;  //允许传入null
        for (Integer x :nums){
            if (x != null)map.put(x,x*x);   //重复键会被后者覆盖(平方相同无影响）
        }

        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words.
     * 返回出现在单词列表中的所有单词的计数的映射。 */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word == null)continue;
            map.merge(word, 1, Integer::sum);     //没有就放1，有就累加1
        }
        return map;
    }
}
