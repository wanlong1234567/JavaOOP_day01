package oo.day01;
//������Ĳ�����
public class CellTest {
	public static void main(String[] args) {
		/*
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		c.drop();
		c.moveLeft(3);
		String str = c.getCellInfo();
		System.out.println(str); //3,2
		*/
		
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		printWall(c); //Cell cc = c;

		c.drop();
		System.out.println("�����:");
		printWall(c);
	}
	//��ǽ+���
	public static void printWall(Cell cc){
		for(int i=0;i<20;i++){ //��
			for(int j=0;j<10;j++){ //��
				if(i==cc.row && j==cc.col){ //����ƥ��
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}















