import java.util.Scanner;
import java.lang.String;
public class calculater{
//    void calculat(double a,String sign){
//        double b=0,a1=0;
//        Scanner s=new Scanner(System.in);
//      //  System.out.print("hello ankit kumar shrivasrtava");
//        if(sign.equals("+")||sign.equals("-") || sign.equals("*") || sign.equals("/")){
//            if(sign.equals("+")){
//               b=s.nextInt();
//               a1=a+b+a1;
//            }
//            else if(sign.equals("-")){
//                a1=a-b+a1;
//            }
//            else if(sign.equals("*")){
//                a1=a*b+a1;
//            }
//            else if(sign.equals("/")){
//                a1=a/b+a1;
//            }
//        }
//    }
    public static void main(String[] calculat) {
        double a=0,b=0,a1=0;
        int loop=0,e=0,op=0;
        String sign,open;
        Scanner s = new Scanner(System.in);
        calculater cl=new calculater();
        while(loop==0) {
            op = 0;
            e = 0;
            a1 = 0;
            System.out.print("\nOpen Calculator Then Press The Button 1 = ");
            open = s.next();
            if (open.equals("1")) {
                System.out.println("\nWelcome Open Calculetor\n" +
                        "this calculator work is arithmetic expression = ( + , - , * , / )\n" +
                        "STEPS.\n\t\tstep-1) enter the number\t\tstep-2)" +
                        " enter the sign\t\tstep-3) enter the number\n\t\tstep-4) repeat step 2 and 3\t\t" +
                        "step-5) total value display then press the button = ");
                a = s.nextInt();
                while (loop == 0) {
                    if (op == 1) {
                        break;
                    }
                    sign = s.next();
                    switch (sign) {
                        case "+":
                            b = s.nextInt();
                            if (e > 0) {
                                a1 = b + a1;
                                break;
                            } else {

                                a1 = a + b + a1;
                                e = 1;
                                break;
                            }
                        case "-":
                            b = s.nextInt();
                            if (e > 0) {
                                a1 = a1 - b;
                                break;
                            } else {
                                a1 = a - b + a1;
                                e = 1;
                                break;
                            }
                        case "*":
                            b = s.nextInt();
                            if (e > 0) {
                                a1 = b * a1;
                                break;
                            } else {
                                a1 = a * b;
                                e = 1;
                                break;
                            }
                        case "/":

                            b = s.nextInt();
                            if (e > 0) {
                                 a1 = a1 / b;
                                  break;
                            } else {
                                    a1 = a / b;
                                e = 1;
                                break;
                            }
                        case "=":
                            System.out.println("Total Value is = " + a1 + "\n\n\t\tClose The Calculator Then Exit...");
                            op = 1;
                            break;
                        default: {
                            System.out.println("WRONG INPUT = "+sign+"\nCORRECT INPUT ARITHMATIC EXPRESSION = ( + , - , * , / ) \n"+a);
                        }
                    }
                }
            } else {
                System.out.println("\n\tWRONG INPUT TRY AGAIN...");
            }
        }
    }
}