package com.company;

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction() {
        numerator = 3;
        denominator = 4;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
                        //a          d                   b               c
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

   public Fraction subtract(Fraction other) {
       int n = this.numerator*other.denominator - this.denominator*other.numerator;
       int d = this.denominator * other.getDenom();

       Fraction f = new Fraction(n,d);
       return f;

   }

    public Fraction multiply(Fraction other) {
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.getDenom();

        Fraction f = new Fraction(n,d);
        return f;
    }

    public String toString() {
        String s = numerator + "/" + denominator;
        return s;

    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);	// print the answer


		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Fraction f5 = f1.multiply(f2);
		System.out.println(f1 + " * " + f2 + " = " + f5);

		Fraction f6 = new Fraction(6,7);
		Fraction f7 = new Fraction(1,4);

		Fraction f8 = f6.add(f7);
		System.out.println(f6 + " + " + f7 + " = " + f8);

    }

}

/* 3/4 + 4/5 = 31/20
3/4 - 4/5 = -1/20
3/4 * 4/5 = 12/20
6/7 + 1/4 = 31/28 */