package com.prakharjain.CountingWords;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxDuplicateWordCount {
	
	public Map<String, Integer> getWorldCount(String fileName)
	{
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try 
		{
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens())
				{
					String temp = st.nextToken().toLowerCase();
					if(wordMap.containsKey(temp))
					{
						wordMap.put(temp, wordMap.get(temp)+1);
					}
					else 
					{
						wordMap.put(temp, 1);
					}
				}
			}
		}
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return wordMap;
		
	}
	
	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap)
	{
		Set<Entry<String, Integer>> set = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)
			{
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDuplicateWordCount mdwc = new MaxDuplicateWordCount();
		Map<String, Integer> wordMap = mdwc.getWorldCount("C:/Users/uc228640/Desktop/NEWS1.txt");
		for(Map.Entry<String, Integer> entry: wordMap.entrySet())
		{
			System.out.println(entry.getKey() +""+ entry.getValue());
		}
		//System.out.println(wordMap);
	}

}
