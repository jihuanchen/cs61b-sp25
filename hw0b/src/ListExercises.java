import java.util.*;

public class ListExercises {

    /** Returns the total sum in a list of integers
     * 返回整数列表的总和*/
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L == null) return 0;
        int total = 0;
        for (Integer x : L){
            if (x != null) total += x;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list
     * 返回一个列表，其中包含给定列表中的所有偶数。 */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> res =new ArrayList<>();
        if (L == null) return res;
        for (Integer x : L){
            if (x != null && x % 2 == 0) res.add(x);
        }
        return res;
    }

    /** Returns a list containing the common item of the two given lists
     * 返回一个列表，其中包含给定的两个列表中的共同元素。 */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        // 建一个可变结果列表；先不确定大小，所以用 ArrayList 动态扩容
        List<Integer> out = new ArrayList<>();
        // 任何一个是 null，就没有“交集”可言；直接返回空列表
        if (L1 == null || L2 == null) return out;

        // 用哈希集合存 L2，便于 O(1) 平均时间做“是否在 L2 中”的判断
        Set<Integer>inL2 =new HashSet<>(L2);  //o(1)平均时间判断是否在L2
        // 用 LinkedHashSet 来“按 L1 的出现顺序”去重并收集交集元素
        // - LinkedHashSet: 保留插入顺序（与 L1 遍历顺序一致）
        // - Set: 自动去重（同一个值只保留一次）
        LinkedHashSet<Integer>orderedUnique =new LinkedHashSet<>(); //按L1顺序去重

        // 遍历 L1：我们只关心“在 L1 出现且也在 L2 中”的值
        for (Integer x : L1){
            // 跳过 null（否则 x%2 之类会 NPE；这里我们不把 null 视为合法公共元素）
            // 并且只要 L2 哈希集合包含该值，就加入“有序去重集合”
            if (x != null && inL2.contains(x)){
                orderedUnique.add(x);
            }

        }
        // 把“有序去重集合”里的元素按顺序转到 List 里，作为最终返回值
        out.addAll(orderedUnique);
        // 返回交集结果，按 L1 的出现顺序，且不包含重复与 null
        return out;
    }


    /** Returns the number of occurrences of the given character in a list of strings.
     * 返回给定字符在字符串列表中出现的次数。*/
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.

       if (words == null) return 0;
       int count = 0;
       for (String word : words) {
           if (word == null)continue;
           for (int i = 0; i < word.length(); i++){
               if (word.charAt(i)== c)count++;
           }
       }
        return count;
    }
}
