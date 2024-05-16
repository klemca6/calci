public class Calculator extends Extendedcalculator{
    public void Additon(int a,int b)
    {
        int sum=a+b;
        System.out.print("Addition:"+sum);
    }
    public void Substraction (int a,int b)
    {
        int sub=a-b;
        System.out.print("\nSubstraction:"+sub);
    }
    public void  Multiplication(int a,int b)
    {
        int mul=a*b;
        System.out.print("\nMultiplication:"+mul);
    }
    public void   Division(int a,int b)
    {
        int div=a/b;
        System.out.print("\nDivision:"+div);
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        int d=27;
        Calculator c = new Calculator();
         c.Additon(a,b);
         c.Substraction(a, b);
         c.Multiplication(a, b);
         c.Division(a, b);
         c.Square(a);
         c.Cuberoot(d);
         c.Modulas(a, b);
    }

}
