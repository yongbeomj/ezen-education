package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day12_6_file {

	// �޸�[�ֱ����ġ=RAM] : ����, �迭, ��ü ��� : ���α׷� ���� �� ��� �ʱ�ȭ
		// �ֱ����ġ : ���� �������� ���α׷�(��ɾ�����) ���
			// ����O ����X => �ֹ߼� �޸�
		// ���������ġ : C, USB, ���� DB ��
			// ����x ����O => ���ֹ߼� �޸�
	
	// ���� <------ ��Ʈ��(���� : ����Ʈ) -------> JAVA���α׷�
	
	public static void main(String[] args) throws IOException {
		
		// ����ó�� Ŭ����
			// 1. FileOutputStream : ������� ��Ʈ��
		FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
			// ����� ���� Ŭ���� => ������ ����ó���߻�
		String ���ڿ� = "��Ŭ�������� �ۼ��� �����Դϴ�";
		fileOutputStream.write(���ڿ�.getBytes());
		
		
	}
	
	
	
}
