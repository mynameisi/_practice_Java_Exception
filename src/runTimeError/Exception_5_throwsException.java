package runTimeError;
/**
 * дһ�δ��룬ʹ��exceptionֻ��main�еõ�����
 * @author Administrator
 *
 */
public class Exception_5_throwsException {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		Exception_5_throwsException.show(arr, 3);
	}
	public static void show(int[] arr, int i){
		System.out.println("arr�ĵ�"+(i+1)+"��Ԫ����: "+arr[i]);
	}
}
