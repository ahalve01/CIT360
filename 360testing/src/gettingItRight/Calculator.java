package gettingItRight;

import java.io.PrintStream;
import java.util.Scanner;
 
public class Calculator
{
static double Divide(double x,double y){
          double r = x / y;
          System.out.println(x);
          System.out.println("  /                    =" + r);
          System.out.println(y);
          return r;
}
static double Subtraction(double x, double y){
        double r;
        r = x - y;
          System.out.println(x);
          System.out.println("  -                    =" + r);
          System.out.println(y);
          return r;
}
  static double Addition(double x, double y){
        double resultado = x + y;
        System.out.println(x);
        System.out.println("  +                    =" + resultado);
        System.out.println(y);
        return resultado;
  }
static double Mutiplication(double x, double y){
            double r;
          r = x * y;
          System.out.println(x);
          System.out.println("  *                    =" + r);
          System.out.println(y);
          return r;
}
 
static void Welcome() {
    System.out.println("==================================");
    System.out.println("     Welcome to the calculator    ");
    System.out.println("           version 3.5             ");
    System.out.println("==================================");
    System.out.println("                                  ");
}
 
static void imprimeMenu(){
    System.out.println("===============================================");
    System.out.println("choose an operator");
    System.out.println("+ = addition x & y");
    System.out.println("- = subtraction  x & y");
    System.out.println("* = multiplication  x & y");
    System.out.println("/ = division  x & y");
    System.out.println("p = Pythagoras with x & y");
    System.out.println("b = quadratic equation, x, y & z");
    System.out.println("r = remainder of division x & y");
    System.out.println("P = expoents, x base, y expoent");
    System.out.println("R = y root of x");
    System.out.println(". = area of the circle, x is the radius");
    System.out.println("& = perimeter of a circle, x is the radius");
    System.out.println("c = law of cosines, x & y");
}
 
    public static void main(String[] args)
  {
   
    Welcome();
    Scanner localScanner = new Scanner(System.in);
    double Pi = 3.1415926535897932384626433832795;
    System.out.println("type a value for x");
    double x = localScanner.nextDouble();
    System.out.println("===================");
    System.out.println("type a value for y");
    double y = localScanner.nextDouble();
    imprimeMenu();
    char oper = localScanner.next().charAt (0);
    System.out.println("===============================================");
    double r;
    switch(oper) {
        case '+':
            r = Addition(x,y);
            break;
        case '-':
        Subtraction(x,y);
          break;
        case '*':
        Mutiplication(x,y);
          break;
        case '/':
          Divide(x,y);
          break;
        case 'p':
          double X = Math.pow(x, 2);
          double Y = Math.pow(y, 2);
          double R = X + Y;
          r = Math.sqrt(R);
          System.out.println(r);
          break;
        case 'b':
            System.out.println("=========================");
            System.out.println("type a value for z");
            double z = localScanner.nextDouble();
            double D = Math.pow(y, 2) + 4 * (x * z);
            r = (- 1 * y) + Math.sqrt(D) / 2 * x;
            R = (- 1 * y) - Math.sqrt(D) / 2 * x;
            System.out.println("Quadratic equation");
            System.out.println(r + " e " + R);
            break;
        case 'r':
            r = x % y;
            System.out.println("remainder of division is " + r);
            break;
        case 'P':
            r = Math.pow(x, y);
            System.out.println("x with the expoent y is " + r);
            break;
        case 'R':
            r = Math.pow(x, 1 / y);
            System.out.println("y root of x is " + r);
            break;
        case '.':
            r = Pi * Math.pow(x, 2);
            System.out.println("circle area is = x eh " + r);
            break;
        case '&':
            r = 2 * Pi * x;
            System.out.println("perimeter of the circle is " + r);
            break;
        case 'c':
            double c15, c30, c45, c60, c75, c90, c105, c120, c135, c150, c165, c180;
            c15 = -0.759687913;
            c30 = 0.15425145;
            c45 = 0.525321989;
            c60 = -0.95241298;
            c75 = 0.92175127;
            c90 = 0;
            c105 = -0.240959049;
            c120 =  0.814180971;
            c135 =  -0.996087835;
            c150 = 0.699250806;
            c165 = -0.066336936;
            c180 = -0.598460069;
        //some are missing!
        System.out.println("type an angle, it has to be divisible by 15, max number is 180!");
        double c = localScanner.nextDouble();
            X = x * x;
            Y = y * y;
            if(c == 15){
            R = X + Y - 2 * (x * y) * c15;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 30){
            R = X + Y - 2 * (x * y) * c30;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 45){
            R = X + Y - 2 * (x * y) * c45;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 60){
            R = X + Y - 2 * (x * y) * c60;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 75){
            R = X + Y - 2 * (x * y) * c75;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 90){
            R = X + Y - 2 * (x * y) * c90;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 105){
            R = X + Y - 2 * (x * y) * c105;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 120){
            R = X + Y - 2 * (x * y) * c120;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 135){
            R = X + Y - 2 * (x * y) * c135;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 150){
            R = X + Y - 2 * (x * y) * c150;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 165){
            R = X + Y - 2 * (x * y) * c165;
            r = Math.sqrt(R);
            System.out.println(r);
            }
            if(c == 180){
            R = X + Y - 2 * (x * y) * c180;
            r = Math.sqrt(R);
            System.out.println(r);
            }
             
    }
  }
}
