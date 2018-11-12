package myMath;

		public class Test {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//*****add******
				//#1
				System.out.println("*****TestAdd******:");
				Polynom_able p1 = new Polynom("-2x^3 + 2.2X - 0.5");
				Polynom_able p2 = new Polynom("+x^4 - 5X^3 - 3");

				p1.add(p2);
				System.out.print("Expected: x^4-7x^3+2.2x-3.5  ,  ");
				System.out.print("Actual: ");
				System.out.println(p1);
				System.out.println();

				//case +-:
				//#2
				p1 = new Polynom("2x^3 + -2.2X - 6");
				p2 = new Polynom("x^4 + -5X^3 + 3");

				p1.add(p2);
				System.out.print("Expected: x^4-3x^3-2.2x-3  ,  ");
				System.out.print("Actual: ");
				System.out.println(p1);
				System.out.println();

				//case of Zero Polynomial + regular Polynomial:
				//#3
				p1 = new Polynom("2x^3");
				p2 = new Polynom("0");

				p1.add(p2);
				System.out.print("Expected: 2x^3 , ");
				System.out.print("Actual: ");
				System.out.println(p1);
				System.out.println();

				//*****Polynomial constructors******:
				System.out.println("*****Test Polynomial constructors: ******");

				//#1: in case that the power is with fractions --> error massage
				p1 = new Polynom("2x^3 + -2.2X^1.5 - 0.5");
				System.out.print("Expected: the input is not valid, please try again.  ,  ");
				System.out.print("Actual: " + p1);
				System.out.println();

				//#2: in case of invalid input --> error massage:
				p1 = new Polynom("hello");
				System.out.print("Expected: the input is not valid, please try again.   ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#3:

				p1 = new Polynom("-");
				System.out.print("Expected: the input is not valid, please try again.   ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//**********Test Subtract**********:

				System.out.println("*******Test Subtract************");

				//#1: 
				p1 = new Polynom("-3x^2+-3.2x-0.3");
				p2 = new Polynom("-6x^3+-1.2x-0.3");

				p1.substract(p2);
				System.out.print("Expected: 6x^3-3x^2-2x ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#2: case of only numbers:
				p1 = new Polynom("-0.6");
				p2 = new Polynom("-0.4");

				p1.substract(p2);
				System.out.print("Expected: -0.19999999999999996 ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#3: in case of subtract that create the zero polynomial:
				p1 = new Polynom("-x^5+6x^3-2x+8");
				p2 = new Polynom("-x^5+6x^3-2x+8");

				p1.substract(p2);
				System.out.print("Expected: 0 ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//****multiply****:
				System.out.println("*******Test Multiply************");


				//#1: case of multiply our polynomial by -1: 
				p1 = new Polynom("-x^5+6x^3-2x+8");
				p2 = new Polynom("-1");
				p1.multiply(p2);
				System.out.print("Expected: x^5-6x^3+2x-8 ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#2: case of multiply our polynomial by 0: 
				p1 = new Polynom("-x^5+6x^3-2x+8");
				p2 = new Polynom("0");
				p1.multiply(p2);
				System.out.print("Expected: 0 ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#3: case of multiply our polynomial by other polynomial: 
				p1 = new Polynom("-x^5+6x^3-2x+8");
				p2 = new Polynom("-2x^3");
				p1.multiply(p2);
				System.out.print("Expected: 2x^8-12x^6+4x^4-16x^3 ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//****copy****:
				System.out.println("*******Test Copy************");

				//#1: check Deep-Copy of p1 to p2: 
				p1 = new Polynom("-x^5+6x^3-2x+8.1");
				p2 = p1.copy();
				p1.multiply(new Polynom("-1"));;
				System.out.print("Expected: p1 = x^5-6x^3+2x-8.1  ,  p2 = -x^5+6x^3-2x+8.1 ,   ");
				System.out.println("Actual: p1 = "+p1+"  ,  p2 = "+p2);
				System.out.println();
				System.out.println();

				//#2: check Deep-Copy of fractions in polynomial: 
				p1 = new Polynom("-0.4");
				p2 = p1.copy();
				p1.multiply(new Polynom("-1"));;
				System.out.print("Expected: p1 = 0.4  ,  p2 = -0.4 ,   ");
				System.out.println("Actual: p1 = "+p1+"  ,  p2 = "+p2);
				System.out.println();
				System.out.println();


				//****derivative****:
				System.out.println("*******Test derivative************");

				//#1: 
				p1 = new Polynom("-x^5+6x^3-2x+8.1");
				p1 = p1.derivative();
				System.out.print("Expected: -5x^4+18x^2-2  ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#2: case -x^1:
				p1 = new Polynom("-x^1");
				p1 = p1.derivative();
				System.out.print("Expected: -1  ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#3: case -x^0:
				p1 = new Polynom("-x^0");
				p1 = p1.derivative();
				System.out.print("Expected: 0  ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();

				//#4: case that the power is negative --> error:
				p1 = new Polynom("-0.5x^-4");
				p1 = p1.derivative();
				System.out.print("Expected:0, the input is not valid, please try again.  ,   ");
				System.out.println("Actual: "+p1);
				System.out.println();
				System.out.println();


				//***f(x)***:
				System.out.println("*******Test f(x)************");

				//#1: in case that x = 1:
				p1 = new Polynom("-x^5+6x^3-2x+8.1");
				Double ans1 = p1.f(1);
				System.out.print("Expected: 11.1  ,   ");
				System.out.println("Actual: "+ans1);
				System.out.println();
				System.out.println();

				//#2: in case that x = 0:
				p1 = new Polynom("-x^5+6x^3-2x+8.1");
				Double ans2 = p1.f(0);
				System.out.print("Expected: 8.1  ,   ");
				System.out.println("Actual: "+ans2);
				System.out.println();
				System.out.println();

				//***area***:
				System.out.println("*******Test area************");
				double eps = 0.00001;
				p1 = new Polynom("x^3+2x^2-x");
				System.out.println("Estimated area: 11.1056   Actual area: " + p1.area(-2.5, 2, eps));
				p1 = new Polynom("x^2+3x+1");
				System.out.println("Estimated area: 7.33195    Actual area: " + p1.area(-4.5, 1, eps));
				p1 = new Polynom("x^3+1");
				System.out.println("Estimated area: 4    Actual area: " + p1.area(-2,2, eps));
				p1 = new Polynom("x^2+3x+1");
				System.out.println("Estimated area: 2.83333   Actual area: " + p1.area(0, 1, eps));
				System.out.println();
				
				
				//***root***:
				System.out.println("*******Test root************");
				p1 = new Polynom("x^2+3x+1");
				System.out.println("Estimated root: -2.618033  ,  Actual root:" + p1.root(-4, -1, eps));
				p1 = new Polynom("-8x^3+9");
				System.out.println("Estimated root: 1.04,Actual root:" + p1.root(-10, 9,0.000001));

			}
}
