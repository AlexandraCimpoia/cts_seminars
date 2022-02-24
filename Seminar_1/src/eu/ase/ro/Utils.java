package eu.ase.ro;

public class Utils {

	public static int frequencyOfMin(int[] v, int n) {
		int min = v[0];
		int freq = 1;
		
		for(int i = 1; i < n; i++) {
			if(v[i] < min) {
				min = v[i];
				freq = 1;
			}else if(v[i] == min) {
				freq++;
			}
		}
		
		return freq;
	}
}
