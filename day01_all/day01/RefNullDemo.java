package oo.day01;
//�������ͻ��Ⱥ���null����ʾ
public class RefNullDemo {
	public static void main(String[] args) {
		Cell c = new Cell();
		Cell cc = c; //ָ��ͬһ������
		c.row = 2;
		cc.row = 5;
		System.out.println(c.row); //5
		
		int a = 5;
		int b = a; //��ֵ
		b = 8;
		System.out.println(a); //5
		
		Cell ccc = new Cell();
		ccc.row = 1;
		ccc = null; //�գ�û��ָ���κζ���
		//ccc.row = 2; //NullPointerException��ָ���쳣
		
	}
}





















