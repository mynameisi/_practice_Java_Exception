package runTimeError;

/**
 * 改进这段代码，使得他能够打印如下两句话:
 * 
 * 忘了数组是从0开始的了
 * 程序能够运行到这里
 * 
 * @author Administrator
 *
 */
public class Exception_4 {
	public static void main(String[] args) {
		int i[] = { 1, 2, 3 };
		System.out.println(i[3]);
		System.out.println("程序能够运行到这里");
	}
}
