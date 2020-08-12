package br.pucrs.alav;

public class Recursion {
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		System.out.println(rec.multNat(6, 4));

		for (int i = 1; i <=5; i++)
			System.out.println("n = " + i + "   serie = " + rec.somaSerie(i));
	}

	public long multNat(long vezes, long nro) {
		if (vezes < 0)
			throw new IllegalArgumentException("N�mero negativo");
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
			return(somaSerie(n-1) + ((double)(1/n)));
	}
}
