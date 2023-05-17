package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import Definitions.Book;

public interface IOUtils {

	// Serialization : Write : Store : (String, Map) : void : OOS/FOS

	static void store(String FileName, Map<Integer, Book> Map) throws IOException {

		// Java --> OOS --> FOS --> File Name(Binary - .ser

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FileName))) {
			out.writeObject(Map);
		}
	}
	
	@SuppressWarnings("unchecked")
	static Map<Integer, Book> restore(String FileName) throws IOException, ClassNotFoundException{
		
		//Java<--OIS<--FIS<--Bin
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FileName)))
		{
			return (Map<Integer, Book>)in.readObject();
			
		}
		
	}

	// Deserialization : Read : Restore : (String) : Map : OIS/FIS

}
