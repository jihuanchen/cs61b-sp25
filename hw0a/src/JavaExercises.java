/**
 * Skeleton file for HW0A.
 * Exercises sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */
public class JavaExercises {

    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     * 打印一个右对齐的五行星号三角形。
     * 第 1 行有 1 个 *，第 2 行有 2 个，以此类推到第 5 行。
     */
    public static void starTriangle() {
        // TODO: Fill in this function
        int n= 5;
        for (int i = 1; i <= n ; i++) {
            //先打印空格:每行{n-i}个
            for (int s = 0; s < n-i; s++) {
                System.out.print(" ");
            }
            //再打印星号：每行i个
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

    }

    /**
     * Prints each character of a given string followed by its reverse index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     * 输出字符串 s 的每个字符，紧跟上这个字符的逆序下标。
     * 例：printIndexed("hello") 打印：h4e3l2l1o0（不一定自动换行，视你用 print 还是 println）。
     */
    public static void printIndexed(String s) {
        // TODO: Fill in this function
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int r = n-1-i; //逆序下标
            System.out.print(""+c+r);//连续打印，不换行
            System.out.println();
        }
    }

    /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: stutter("hello") -> "hheelllloo"
     * 返回一个新字符串：原串中每个字符重复两次。
     * 例："hello" → "hheelllloo"（因为两个 l 都各自重复两次，合起来就四个 l）。
     */
    public static String stutter(String s) {
        // TODO: Fill in this function
        //若课程测试不会传null，可以去掉这两行防御式判断
//        if(s == null)return null;
//        if(s.isEmpty())return "";

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch).append(ch);//每个字符重复两次
        }

        return sb.toString();
    }

    /**
     * Determines the quadrant of a Cartesian coordinate (x, y).
     * Returns:
     *   1 for the first quadrant (x > 0, y > 0),
     *   2 for the second quadrant (x < 0, y > 0),
     *   3 for the third quadrant (x < 0, y < 0),
     *   4 for the fourth quadrant (x > 0, y < 0),
     *   0 if the point lies on an axis.
     *   判断点 (x, y) 所在的象限：
     * 第一象限：返回 1（x > 0 && y > 0）
     * 第二象限：返回 2（x < 0 && y > 0）
     * 第三象限：返回 3（x < 0 && y < 0）
     * 第四象限：返回 4（x > 0 && y < 0）
     * 若点在坐标轴上（x == 0 或 y == 0），返回 0。
     */
    public static int quadrant(int x, int y) {
        // TODO: Fill in this function
        //在坐标轴上（含原点）
        if(x == 0 || y == 0) {
            return 0;
        }
        //第一象限：x>0,y>0
        if (x>0 && y>0){return 1;}

        //第二象限： x<0，y>0
        if (x<0 && y>0){return 2;}

        //第三象限 x<0,y<0
        if (x<0 && y<0){return 3;}

        //其他情况只能是第四象限 x>0,y<0

        return 4;
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4));  // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5));  // Output: 0
    }
}
