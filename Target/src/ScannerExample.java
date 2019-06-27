import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ScannerExample {
	public static void main(String[] args)
	{
		 // The name of the file to open.
        String fileName = "C:\\Users\\uc228640\\Desktop\\temp.txt";
        	
        // This will reference one line at a time
        String line = null;

        try {
        	Map<String,Integer> map = new HashMap<String, Integer>();
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            String data[] = line.split(" ");
                
                if(map.containsKey(data[0]))
            	{
            		map.put(data[0], map.get(data[0])+1);
            	}
            	else
            	{
            		map.put(data[0], 1);
            	}
            }
                
                for(Map.Entry<String, Integer> entrySet:map.entrySet())
                {
                	String content = entrySet.getKey() +" "+entrySet.getValue();
                	System.out.println(content);
                }   
            
            
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
