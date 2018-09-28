import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {
        // write code here
        if (iniString.length() > 128) {
            return false;
        }
        boolean[] b = new boolean[128];
        for (int i = 0; i < iniString.length(); i++) {
            int index = iniString.charAt(i);
            if (b[index]) {
                return false;
            }
            b[index] = true;
        }
        return true;
    }
}
/*
不通过
您的代码已保存
答案错误:您提交的程序没有通过所有的测试用例
case通过率为89.47%

测试用例:
“acbdbesy”

对应输出应该为:

false

你的输出为:

java.lang.ArrayIndexOutOfBoundsException: 8220
*/
