package runTimeError;
/**
 * 写一段代码，使得exception只在main中得到处理
 * @author Administrator
 *
 */
public class Exception_5_throwsException {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		Exception_5_throwsException.show(arr, 3);
	}
	public static void show(int[] arr, int i){
		System.out.println("arr的第"+(i+1)+"个元素是: "+arr[i]);
	}
}
