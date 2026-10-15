package com.kodewala.hashset1;

import java.util.HashSet;
import java.util.Set;

public class HashingExplr {
	public static void main(String[] args) 
	{
		Set<String> products = new HashSet<String>();
		
		products.add("SDFJA");          // Here add method will follow all the internal process to find the bucket where the object will get store.
		products.add("A;OSFKOAFM;LMB"); // hence , insertion process or deletion process or reading process(Contains()) in HashSet has time complexity  
		products.add(";LASMFC");        // O(1) average and O(N) in worst case where N is the number of collision 
		products.add(";LM;AD");
		products.add(";LAKFDE");
		products.add("EOFJOAEF");
		products.add("PFKPFG");
		products.add("PKFA'PKH");
		products.add("VKF'AI");
		products.add("A'PFKPJ");
		products.add("A;KFK");
		products.add(";LAMF'L");
		products.add("MASOOD");
		
	}

}
