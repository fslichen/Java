package architect.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnyClass {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("D:\\anyEntity.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			AnyEntity anyEntity = new AnyEntity();
			anyEntity.setName("Chen");
			oos.writeObject(anyEntity);
		} catch (Exception e) {}
		try {
			FileInputStream fis = new FileInputStream(new File("D:\\anyEntity.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object anyEntity = ois.readObject();
			System.out.println(anyEntity);
		} catch (Exception e) {}
	}
}
