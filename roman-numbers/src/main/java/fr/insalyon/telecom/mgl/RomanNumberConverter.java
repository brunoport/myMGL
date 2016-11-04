package fr.insalyon.telecom.mgl.RomanNumberConverter;

public class RomanNumberConverter {

	public static void main(String[] args) {
		RomanNumberConverter rnc = new RomanNumberConverter();
		System.out.println(rnc.convert("MCDLXXXIX"));
	}

	public int dict(char c) {
		switch (c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			}
			return 0;
	}

	// public char dict(int n) {
	// 	switch (n) {
	// 		case 1: return 'I';
	// 		case (): return 5;
	// 		case 'X': return 10;
	// 		case 'L': return 50;
	// 		case 'C': return 100;
	// 		case 'D': return 500;
	// 		case 'M': return 1000;
	// 		}
	// 		return 0;
	// }

  public int convert(String romanNumber) {
    int n = 0;
    for (int i=(romanNumber.length())-1; i>=0; i--) {
    	int rn = dict(romanNumber.charAt(i));
    	if (i != (romanNumber.length())-1) {
    		if (rn >= dict(romanNumber.charAt(i+1))) {
    			n += rn;	
    		}
    		else {
    			n -= rn;
    		}
    	} else {
    		n += rn;
    	}
    }
    return n;
  }

   // public String convert(int number) {

   // }
}
