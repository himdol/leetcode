import example.Solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {

    private final static Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestCommonPrefix(new String[]{"fall", "fan", "flight"});
    }

}