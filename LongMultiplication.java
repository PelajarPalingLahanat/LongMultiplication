public class LongMultiplication {
 public static void main(String[] args){
   int num1 = 10; int num2 = 10;
   int sum = 0,sum1 = 0;
   int var = 1,var1 = 1;
   int tempnum1;
   while(num2 != 0){
     var = 1;
     tempnum1 =  num1;

     while(tempnum1 != 0){
       sum = ((tempnum1 % 10) * (num2 % 10)) * var;
       tempnum1 = tempnum1 / 10;
       var = var * 10;
     }
     sum = sum * var1;
     var1 = var1 * 10;
     sum1 = sum + sum1;
     num2 = num2 / 10;
      }
      System.out.println(sum1);


   }
 }
