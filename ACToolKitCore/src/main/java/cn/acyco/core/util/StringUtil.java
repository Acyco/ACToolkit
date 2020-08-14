package cn.acyco.core.util;

/**
 * 字符串工具类
 *
 * @author Acyco
 * @create 2020-08-15 06:08
 * @url https://acyco.cn
 */
public class StringUtil {

    public static boolean empty(Object obj) {
        if (null == obj) {
            return true;
        } else if (obj instanceof CharSequence) {
            return 0 == ((CharSequence) obj).length();
        }
        return false;
    }

}
