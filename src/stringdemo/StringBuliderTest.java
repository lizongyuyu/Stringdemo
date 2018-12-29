package stringdemo;
/**
 * StringBuilder用于拼接，提供了一个可变的字符数组，修改都在字符数组中进行，节省空间
 * StringBuffer和StringBuilder的作用一样，方法也一样，api也一样
 * 区别在于
 * StringBuffer是线程安全，性能慢
 * StringBuilder是线程不安全的，性能快
 * @author Nick
 *
 */
public class StringBuliderTest {
	public static void main(String[] args) {
		/**
		 * 1.构造方法:
		 * StringBuilder():提供的默认的初始容量为16个字符数组
		 * StringBuilder(String str):
		 * 创建一个字符串生成器，初始值为str
		 * 2.append()添加字符串
		 */
		/*StringBuilder bulider = new StringBuilder();
		StringBuilder builder2 =
				new StringBuilder("str");
		builder2.append("rts");
		System.out.println(builder2);//返回的都是本身，修改是在原数组进行的
*/		
		/**
		 *3. toString()
		 *将拼接后的字符数组转换为字符串
		 */
		/*System.out.println(builder2.toString());*///  return new String(value, 0, count);
		
		/**
		 * 4.insert(int offset,String str) -String
		 * 将给定的字符串插入到字符数组的指定位置
		 * 5.delete(int start,int end)
		 * 从指定字符数组中删除指定开头结尾的长度，包头不包尾
		 */
		StringBuilder str = new StringBuilder("hello");
		str.insert(str.length(), "nihao");
		str.delete(0, 6);
		
		
		/**
		 * 6.replace(int start,int end,String str) -StringBuilder
		 * 用给定的字符串，替换掉从指定位置开始到结束的字符串
		 */
		str.replace(0, 2, "开始");
		System.out.println(str.toString());
		
		/**
		 * 7.reverse()：翻转 -StringBuilder
		 * 将原来数组中的字符进行逆序
		 */
		str.reverse();
		System.out.println(str.toString());
		
		
	}

}
