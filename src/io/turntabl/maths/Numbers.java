package io.turntabl.maths;

public class Numbers {

    public static int SumOfNumbers(int num1, int num2){

        int result = num1 + num2;
        return result;
    };
    public static boolean IsPositive(int num){
        if (num >= 0){
            return true;
        }
        else{
            return false;
        }

    };
    public static boolean IsNegative(int num){
        if (num < 0){
            return true;
        }

        else {
            return false;
        }

    };

    public static boolean IsEvenAndGreaterThanZero(int num){
        if(num % 2 == 0 && num > 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean IsLeapYear(int year){
        if((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
