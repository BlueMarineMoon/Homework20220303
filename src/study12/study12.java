package study12;

import java.util.Calendar;

public class study12 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance(); // Calendar ��ü ����
		date.clear();                           // ���� Calendar ��ü�� ����� ������ ��� �����.
		date.set(Calendar.YEAR, 2020);          // Calendar ��ü�� 2020���� �⵵ ����
		date.set(Calendar.MONTH, 11);           // Calendar ��ü�� 12���� �� ����
		date.set(Calendar.DAY_OF_MONTH, 25);    // Calendar ��ü�� 25���� ��¥ ����
		System.out.println("��� ��¥�� "+date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DAY_OF_MONTH)+"��");
	}

}
