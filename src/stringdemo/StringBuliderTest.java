package stringdemo;
/**
 * StringBuilder����ƴ�ӣ��ṩ��һ���ɱ���ַ����飬�޸Ķ����ַ������н��У���ʡ�ռ�
 * StringBuffer��StringBuilder������һ��������Ҳһ����apiҲһ��
 * ��������
 * StringBuffer���̰߳�ȫ��������
 * StringBuilder���̲߳���ȫ�ģ����ܿ�
 * @author Nick
 *
 */
public class StringBuliderTest {
	public static void main(String[] args) {
		/**
		 * 1.���췽��:
		 * StringBuilder():�ṩ��Ĭ�ϵĳ�ʼ����Ϊ16���ַ�����
		 * StringBuilder(String str):
		 * ����һ���ַ�������������ʼֵΪstr
		 * 2.append()����ַ���
		 */
		/*StringBuilder bulider = new StringBuilder();
		StringBuilder builder2 =
				new StringBuilder("str");
		builder2.append("rts");
		System.out.println(builder2);//���صĶ��Ǳ����޸�����ԭ������е�
*/		
		/**
		 *3. toString()
		 *��ƴ�Ӻ���ַ�����ת��Ϊ�ַ���
		 */
		/*System.out.println(builder2.toString());*///  return new String(value, 0, count);
		
		/**
		 * 4.insert(int offset,String str) -String
		 * ���������ַ������뵽�ַ������ָ��λ��
		 * 5.delete(int start,int end)
		 * ��ָ���ַ�������ɾ��ָ����ͷ��β�ĳ��ȣ���ͷ����β
		 */
		StringBuilder str = new StringBuilder("hello");
		str.insert(str.length(), "nihao");
		str.delete(0, 6);
		
		
		/**
		 * 6.replace(int start,int end,String str) -StringBuilder
		 * �ø������ַ������滻����ָ��λ�ÿ�ʼ���������ַ���
		 */
		str.replace(0, 2, "��ʼ");
		System.out.println(str.toString());
		
		/**
		 * 7.reverse()����ת -StringBuilder
		 * ��ԭ�������е��ַ���������
		 */
		str.reverse();
		System.out.println(str.toString());
		
		
	}

}
