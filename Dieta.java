import java.util.InputMismatchException;
import java.util.Scanner;

public class Dieta {
	static int Massa;

	public static void main (String args []) throws Exception {
			Scanner d = new Scanner(System.in);
			System.out.println("������� �����");
			try {
				Massa=MyException.Get(d.nextInt());
			} catch (InputMismatchException e){
				System.out.println("�� ����� �� �����");
			} catch (MyException e) {
				System.out.println("����� �� ����� ���� �������������") ;
			}
			//System.out.println(Massa);
	}
}
