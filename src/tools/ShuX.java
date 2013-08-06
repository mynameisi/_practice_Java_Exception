package tools;
public class ShuX {
	public static int jia(int x, int y) {
		return x + y;
	}
	public static int jian(int x, int y) {
		return x - y;
	}
	public static String cheng(int x, String y) {
		return Integer.toString(x * Integer.parseInt(y));
	}
	public static double chu(int x, int y) {
		return ((double) x) / y;
	}
	public static int jiaE(int x, int y) throws Exception {
		return x + y;
	}
	public static int jianE(int x, int y) throws Exception {
		return x - y;
	}
	public static String chengE(int x, String y) throws Exception {
		return Integer.toString(x * Integer.parseInt(y));
	}
	public static double chuE(int x, int y) throws Exception {
		return ((double) x) / y;
	}
}
