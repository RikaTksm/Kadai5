package inttoeng;

import java.util.Scanner;

public class IntToEng {

    // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	
    	//0-19
    	String[] eNum1 ={"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	//20-90��10�̈�
    	String[] eNum2={"twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	//20^99�܂ł�1�̈�
    	String[] eNum3={"","one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	String num = String.valueOf(n);
    	if(n < 20){ 
    		num=eNum1[n];
    		return num;
    	}
    	if(n>=20 && n<=99) {
    		String num10 = num.substring(0,1); //10�̈�
    		String num1  = num.substring(1,2);//1�̈�
    		
    		int num10a = Integer.parseInt(num10);
    		int num1a = Integer.parseInt(num1);
    		
    		num=eNum2[num10a-2]+eNum3[num1a];
    			return num;
    		}
    	
        return "";
    }
}
