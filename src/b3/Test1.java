package b3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * IO
 * 
 * ×Ö·ûÁ÷ :Reader¡¢Writer
 * 
 * ×Ö½ÚÁ÷:InputStream¡¢OutputStream
 * 
 * @author Dandan
 *
 */
public class Test1 {

	public static void copyfile(String source, String target) throws Exception{
		
		try(InputStream input = new FileInputStream(source)){
			try(OutputStream output = new FileOutputStream(target)){
				byte[] buffer = new byte[1024];
				int bytes;
				while((bytes = input.read(buffer))!= -1){
					output.write(buffer, 0, bytes);
					System.out.println(bytes);
				}		
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			copyfile("E:\\d.zip","E:\\dd.zip");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
