/*************************************************************************
	> File Name: InputTest.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 15时37分13秒
    > Describition: 
 ************************************************************************/
import java.io.*;

public class InputTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

