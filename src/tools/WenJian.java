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
				System.out.println("�ļ�:" + f.getAbsolutePath() + "�����ڣ���˶Ժ����´���");
			}
		}
		SIZE = Long.toString(f.length());
		NAME = f.getName();
		IMMEDIATE_FOLDER = f.getParentFile().getName();
	}
	/**
	 * ������������ļ��Ĵ�С, ����</br> int i=size(0), ���i=14��ʾ�ļ��Ĵ�С��14bit</br> int
	 * i=size(1), ���i=14��ʾ�ļ��Ĵ�С��14byte</br>
	 * 
	 * @param choice
	 *            0����λ��bit��1����λ��byte, -1��ʾchoice�������
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
			System.out.println("size ����ֻ�ܽ�����������\n 0: ��ʾ��λ��bit\n 1: ��ʾ��λ��byte");
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
			System.out.println("�ļ��ĺ�׺���������⣬�����ļ�����������д");
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
