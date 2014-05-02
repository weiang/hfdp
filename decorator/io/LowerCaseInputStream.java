/*************************************************************************
	> File Name: LowerCaseInputStream.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 15时32分04秒
    > Describition: 
 ************************************************************************/
import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}

	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i ++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}


