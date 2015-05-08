package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	
    	//0-19
    	String[] eNum1 ={"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	//20-90の10の位
    	String[] eNum2={"twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	//20^99までの1の位
    	String[] eNum3={"","one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	String num = String.valueOf(n);
    	if(n < 20){ 
    		num=eNum1[n];
    		return num;
    	}
    	if(n>=20 && n<=99) {
    		String num10 = num.substring(0,1); //10の位
    		String num1  = num.substring(1,2);//1の位
    		
    		int num10a = Integer.parseInt(num10);
    		int num1a = Integer.parseInt(num1);
    		
    		num=eNum2[num10a-2]+eNum3[num1a];
    			return num;
    		}
    	
        return "";
    }
}
