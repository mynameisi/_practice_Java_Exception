package tools;
import java.io.File;
import java.io.FileNotFoundException;
import tools.IO.Input;
import tools.IO.Output;
import tools.MyExceptions.ChoiceException;
import tools.MyExceptions.SuffixException;
public class WenJian {
	private File			f	= null;
	private final String	SIZE;
	private final String	NAME;
	private final String	IMMEDIATE_FOLDER;
	public WenJian(String fileName) {
		f = new File(fileName);
		if (!f.isFile()) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e) {
				System.out.println("文件:" + f.getAbsolutePath() + "不存在，请核对后重新创建");
			}
		}
		SIZE = Long.toString(f.length());
		NAME = f.getName();
		IMMEDIATE_FOLDER = f.getParentFile().getName();
	}
	/**
	 * 这个方法返回文件的大小, 比如</br> int i=size(0), 如果i=14表示文件的大小是14bit</br> int
	 * i=size(1), 如果i=14表示文件的大小是14byte</br>
	 * 
	 * @param choice
	 *            0代表单位是bit，1代表单位是byte, -1表示choice输入错误
	 * @return
	 */
	@SuppressWarnings("finally")
	public int size(int choice) {
		switch (choice) {
		case 0:
			return Integer.parseInt(this.SIZE) * 1024;
		case 1:
			return Integer.parseInt(this.SIZE);
		}
		try {
			throw new ChoiceException();
		} catch (ChoiceException e) {
			System.out.println("size 方法只能接收两个参数\n 0: 表示单位是bit\n 1: 表示单位是byte");
		} finally {
			return -1;
		}
	}
	@SuppressWarnings("finally")
	public String name() {
		int dot = NAME.lastIndexOf('.');
		if ((dot > -1) && (dot < (NAME.length()))) {
			return NAME.substring(0, dot);
		}
		try {
			throw new SuffixException();
		} catch (SuffixException e) {
			System.out.println("文件的后缀名出现问题，请检查文件声明重新书写");
		} finally {
			return null;
		}
	}
	public String folder() {
		return this.IMMEDIATE_FOLDER;
	}
	public String readOneString() {
		return Input.getOneStringFromFile(f);
	}
	public boolean writeOneString(String s) {
		return Output.WriteOneStringToFile(f, s);
	}
}
