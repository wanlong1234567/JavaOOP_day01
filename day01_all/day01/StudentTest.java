package oo.day01;
//ѧ����Ĳ�����
public class StudentTest {
	public static void main(String[] args) {
		//����һ��ѧ������
		Student zs = new Student();
		//���ʳ�Ա����
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "�ӱ��ȷ�";
		//���÷���
		zs.study();
		zs.sayHi();
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "��������ľ˹";
		ls.study();
		ls.sayHi();
		
		//1.����һ��ѧ������
		//2.�����г�Ա������Ĭ��ֵ
		Student ww = new Student();
		ww.study();
		ww.sayHi();
		
	}
}


















