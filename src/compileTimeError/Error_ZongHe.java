package compileTimeError;
import tools.Constants;
import tools.ShuX;
import tools.WenJian;
/**
 * 解决错误
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
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 的大小是: " + y1 + " BYTE")
		// 把 "./2/1.txt" 的不要后缀的文件名"1"放到String y2中
		String y2 = wj name();
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 的名称是: " + y2 + "");
		// 把 "./2/1.txt" 文件中的第一个字符串读出来，放到Stirng y3中
		string y3 = wj.ReadOneString();
		system out println("文件:\"" + Constants.FILE_2_1 + "\" 中第一个String是: " + y3 + "");
		// 把 "abc"写到"./2/1.txt" 文件中, 再把"abc"读出来放到String y4里，写回到17
		int i=3.14+6.19；
		String temp=integer.toString(i);
		wj.writeOneString(temp);
		System.out.println("成功写入" + temp + " 到文件：" + Constants.FILE_2_1 + "中");
		String y4 = wj readOneString();
		String y$%^&of=wj.readOneString();
		String 4yf=wj.readOneString();
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 中第一个String是: " + y4 + "");
		wj.writeOneString("17");
	}
}
