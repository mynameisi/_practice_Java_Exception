package compileTimeError;
import tools.Constants;
import tools.ShuX;
import tools.WenJian;
/**
 * �������
 * 
 * @author Administrator
 * 
 */
public class Error_ZongHe {
	public static void main(String[] args) {
		ShuX x=new ShuX();
		String j=x.jia(3, 4);
		WenJian wj = new.Wenjian(Constants.FILE_2_1)
		int y1 = wj size(0);
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" �Ĵ�С��: " + y1 + " BYTE")
		// �� "./2/1.txt" �Ĳ�Ҫ��׺���ļ���"1"�ŵ�String y2��
		String y2 = wj name();
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" ��������: " + y2 + "");
		// �� "./2/1.txt" �ļ��еĵ�һ���ַ������������ŵ�Stirng y3��
		string y3 = wj.ReadOneString();
		system out println("�ļ�:\"" + Constants.FILE_2_1 + "\" �е�һ��String��: " + y3 + "");
		// �� "abc"д��"./2/1.txt" �ļ���, �ٰ�"abc"�������ŵ�String y4�д�ص�17
		int i=3.14+6.19��
		String temp=integer.toString(i);
		wj.writeOneString(temp);
		System.out.println("�ɹ�д��" + temp + " ���ļ���" + Constants.FILE_2_1 + "��");
		String y4 = wj readOneString();
		String y$%^&of=wj.readOneString();
		String 4yf=wj.readOneString();
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" �е�һ��String��: " + y4 + "");
		wj.writeOneString("17");
	}
}
