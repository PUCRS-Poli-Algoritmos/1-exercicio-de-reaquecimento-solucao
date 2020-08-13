package br.pucrs.alav;

public class Recursion {
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		System.out.println(rec.multNat(6, 4));

		for (int i = 1; i <=5; i++)
			System.out.println("n = " + i + "   serie = " + rec.somaSerie(i));

		System.out.println("\nCasa -> " + rec.reverseStr("Casa"));
		System.out.println("Orgânico -> " + rec.reverseStr("Orgânico"));
		System.out.println("Paralelo -> " + rec.reverseStr("Paralelo"));
		System.out.println(" -> " + rec.reverseStr(""));
		System.out.println("Arara -> " + rec.reverseStr("Arara"));

		System.out.println("");
		for (int i = 1; i <=5; i++)
			System.out.println("n = " + i + "   fFunction = " + rec.fFunction(i));
		
		System.out.println("");
		System.out.println("m = 0, n = 0   --> " + rec.ackerman(0, 0));
		System.out.println("m = 0, n = 1   --> " + rec.ackerman(0, 1));
		System.out.println("m = 1, n = 0   --> " + rec.ackerman(1, 0));
		System.out.println("m = 0, n = 2   --> " + rec.ackerman(0, 2));
		System.out.println("m = 2, n = 0   --> " + rec.ackerman(2, 0));
		System.out.println("m = 1, n = 1   --> " + rec.ackerman(1, 1));
		System.out.println("m = 1, n = 2   --> " + rec.ackerman(1, 2));
		System.out.println("m = 1, n = 3   --> " + rec.ackerman(1, 3));
		System.out.println("m = 2, n = 1   --> " + rec.ackerman(2, 1));
		System.out.println("m = 3, n = 1   --> " + rec.ackerman(3, 1));
		System.out.println("m = 3, n = 2   --> " + rec.ackerman(3, 2));
		System.out.println("m = 2, n = 3   --> " + rec.ackerman(2, 3));
	}

	public long multNat(long vezes, long nro) {
		if (vezes < 0)
			throw new IllegalArgumentException("Número negativo");
		else if (vezes == 0)
			return 0;
		else if (vezes == 1)
			return nro;
		else 
			return multNat(vezes - 1, nro) + nro;
	}

	public long somaIncr(long n1, long n2) {
		if ((n1 < 0) || (n2 < 0))
			throw new IllegalArgumentException();
		else if ((n1 ==0) && (n2 == 0))
			return(0);
		else if (n1 == 0)
			return(somaIncr(n1, n2 - 1) + 1);
		else if (n2 == 0)
			return(somaIncr(n1 - 1, n2) + 1);
		else 
			return(somaIncr(n1 - 1, n2 - 1) + 1 + 1);
	}

	public long somaIncrAlt(long n1, long n2) {
		if ((n1 < 0) || (n2 < 0))
			throw new IllegalArgumentException();
		else if ((n1 ==0) && (n2 == 0))
			return(0);
		else if (n1 == 0)
			return(somaIncr(n1, n2 - 1) + 1);
		else if (n2 == 0)
			return(somaIncr(n1 - 1, n2) + 1);
		else 
			return(somaIncr(n1, n2 - 1) + 1);
	}

	public double somaSerie(long n) {
		if (n < 0)
			throw new IllegalArgumentException();
		else if (n ==1)
			return(1);
		else 
			return(somaSerie(n-1) + 1/((double)n));
	}

	public String reverseStr(String str) {
		StringBuilder res = new StringBuilder(str.length());

		for(int i = str.length()-1; i >= 0; i--)
			res.append(str.charAt(i));

		return res.toString();
	}

	public long fFunction(long n) {
		if (n < 0)
			throw new IllegalArgumentException("Nro negativo.");
		else if ((n == 1) || (n == 2))
			return n;
		else 
			return 2*fFunction(n-1)+3*fFunction(n-2);
	}

	public long ackerman(long m, long n) {
		if (m == 0)
			return n + 1;
		else if ((m != 0) && (n == 0))
			return ackerman(m-1, 1);
		else /**if ((m != 0) && (n != 0))  **/
			return ackerman(m-1, ackerman(m, n-1));
	}
}

