package stringdemo;
/**
 * String一旦创建不可改变
 * @author Nick
 *
 */
public class Test {
	public static void main(String[] args) {
		//一、常量池-----------------------------------------------------------------------------------------
		/*String str1 = "abc";
		String str = new String("abc");//运行期创建对象
		String str2 = "a"+"b"+"c";//编辑优化
		System.out.println(str2==str);*/
		//二、String 常用方法--------------------------------------------------------------------------
		//1.length()
		/*String a = new String("abcd");
		System.out.println(a.length());*/
		
		//2.indexOf()系列返回字符在字符串中第一次出现的下标,找不到返回-1
		/**
		 * indexOf(Stirng str,int fromIndex) - int
		 * lastIndexOf(String str) - int
		 */
		/*int index = a.indexOf('e');
		System.out.println(index);*/
		//练习查询数组中字符出现的次数
		/*int l = 0; 
		int sum = 0;
		int x;
		String str3 = "you can you up,no can no bb";
		do {
			x = str3.indexOf("can",l);
			if(x!=-1) {
				sum++;
				l=str3.indexOf("can",l)+3;
			}
			System.out.println(sum);
			System.out.println(l);
		}while(x!=-1);
		System.out.println(sum);*/
		
		//3.substring(int intdex) - String 从指定位置截取字符串 得到的字符串是新字符串
		//substing(int begin,int end) 开头到结尾，java中一般都包头不包尾
		/*
		 * 练习截取域名
		 * */
		/*String str  = "www.baidu.com";
		int x = str.indexOf('.');
		int y = str.indexOf('.',x+1);
	    String srtnew = str.substring(x+1, y);
	    System.out.println(srtnew);*/
		
		/**
		 * 4.trim() 
		 * 去除开头和结尾的空格,中间的不去
		 */
		/*String str = new String(" aks fdhkj ");
		str = str.trim();
		System.out.print(str);*/
		
		/**
		 * 5.charAt(int index)-char
		 * 返回指定索引处的char值
		 */
		/*String str = "hello world";
		char c = str.charAt(3);
		System.out.println(c);*/
		
		/**
		 * 练习：回文判断
		 */
		/*String str = "上海自来自海上";
		for(int i=0;i<str.length()/2;i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2) {
				System.out.print("不是回文");
				break;
			}
			if(i==(str.length()/2)-1) {
				System.out.println("是回文");
			}
			
		}*/
		
		/**
		 * 6.startswith(String prefix) -boolean
		 * 判断字符串是否以指定的前缀开始
		 * 7.endswith
		 * 判断字符串是否以指定的后缀结束
		 * 8.toUpperCase() - String
		 * 将字符串中英文转换为大写
		 * 9.toLowwerCase() -String
		 * 将字符串中的英文转换为小写，得到的都是新的字符串
		 * 10.valueof(数据类型 变量名) static
		 * 静态方法 返回指定类型的字符串表示形式
		 */
		String x = "sdfdsf13132";
		String str = String.valueOf(x);
		System.out.println(str);
	}

}
