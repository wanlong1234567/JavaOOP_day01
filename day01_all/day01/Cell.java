package oo.day01;
//������
public class Cell {
	//��Ա����
	int row; //�к�	
	int col; //�к�
	//����
	void drop(){ //����1��
		row++;
	}
	void moveLeft(int n){ //����n��
		col-=n;
	}
	String getCellInfo(){ //��ȡ���ӵ��кź��к�
		return row+","+col;
	}
}

















