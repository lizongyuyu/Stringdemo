package stringdemo;
/**
 * Stringһ���������ɸı�
 * @author Nick
 *
 */
public class Test {
	public static void main(String[] args) {
		//һ��������-----------------------------------------------------------------------------------------
		/*String str1 = "abc";
		String str = new String("abc");//�����ڴ�������
		String str2 = "a"+"b"+"c";//�༭�Ż�
		System.out.println(str2==str);*/
		//����String ���÷���--------------------------------------------------------------------------
		//1.length()
		/*String a = new String("abcd");
		System.out.println(a.length());*/
		
		//2.indexOf()ϵ�з����ַ����ַ����е�һ�γ��ֵ��±�,�Ҳ�������-1
		/**
		 * indexOf(Stirng str,int fromIndex) - int
		 * lastIndexOf(String str) - int
		 */
		/*int index = a.indexOf('e');
		System.out.println(index);*/
		//��ϰ��ѯ�������ַ����ֵĴ���
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
		
		//3.substring(int intdex) - String ��ָ��λ�ý�ȡ�ַ��� �õ����ַ��������ַ���
		//substing(int begin,int end) ��ͷ����β��java��һ�㶼��ͷ����β
		/*
		 * ��ϰ��ȡ����
		 * */
		/*String str  = "www.baidu.com";
		int x = str.indexOf('.');
		int y = str.indexOf('.',x+1);
	    String srtnew = str.substring(x+1, y);
	    System.out.println(srtnew);*/
		
		/**
		 * 4.trim() 
		 * ȥ����ͷ�ͽ�β�Ŀո�,�м�Ĳ�ȥ
		 */
		/*String str = new String(" aks fdhkj ");
		str = str.trim();
		System.out.print(str);*/
		
		/**
		 * 5.charAt(int index)-char
		 * ����ָ����������charֵ
		 */
		/*String str = "hello world";
		char c = str.charAt(3);
		System.out.println(c);*/
		
		/**
		 * ��ϰ�������ж�
		 */
		/*String str = "�Ϻ������Ժ���";
		for(int i=0;i<str.length()/2;i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if(c1!=c2) {
				System.out.print("���ǻ���");
				break;
			}
			if(i==(str.length()/2)-1) {
				System.out.println("�ǻ���");
			}
			
		}*/
		
		/**
		 * 6.startswith(String prefix) -boolean
		 * �ж��ַ����Ƿ���ָ����ǰ׺��ʼ
		 * 7.endswith
		 * �ж��ַ����Ƿ���ָ���ĺ�׺����
		 * 8.toUpperCase() - String
		 * ���ַ�����Ӣ��ת��Ϊ��д
		 * 9.toLowwerCase() -String
		 * ���ַ����е�Ӣ��ת��ΪСд���õ��Ķ����µ��ַ���
		 * 10.valueof(�������� ������) static
		 * ��̬���� ����ָ�����͵��ַ�����ʾ��ʽ
		 */
		String x = "sdfdsf13132";
		String str = String.valueOf(x);
		System.out.println(str);
	}

}
