package runTimeError;
import tools.ShuX;
/**
 * 两种方法去掉红线
 * @author Administrator
 *
 */
public class Exception_6 {
	public static void main(String[] args) {
		// 3+4
		int y1 = ShuX.jiaE(3, 4);
		System.out.println(y1);
		// 3-(3+2)
		int y2 = ShuX.jianE(3, ShuX.jiaE(3, 2));
		System.out.println(y2);
		// “3”-->3
		int y3 = Integer.parseInt("3");
		System.out.println(y3);
		// 3--> "3"
		String y4 = Integer.toString(3);
		System.out.println(y4);
		// 3*2
		int y5 = Integer.parseInt(ShuX.chengE(3, Integer.toString(2)));
		System.out.println(y5);
	}
}
