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
    	String[] eNum2={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//20^99�܂ł�1�̈�
    	String[] eNum3={"","one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//100^999�܂ł�100�̈�
    	String[] eNum4={"onehundred", "twohundred", "threehundred", "fourhundred",
    			"fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
    	
    	//100^999�܂ł�10�̈�
    	String[] eNum5={"","twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//100^999�܂ł�1�̈�
    	String[] eNum6={"", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine"};
    	
    	//100^999�܂ł�1�̈�
    	String[] eNum7={"ten", "eleven", "twelve", "thirteen", "fourteen",
		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    	
    	
    			
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
    		
    		num=eNum2[num10a-1]+eNum3[num1a];
    			return num;
    		}
    	if(n>=100 && n<=109){
    		String num100 = num.substring(0,1);//100�̈�
    		String num10b = num.substring(1,2);//10�̈�
    		String num1b = num.substring(2,3);//1�̈�
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c]+eNum6[num1c];
    			return num;
    	}
    	if(n>=110 && n<=119){
    		String num100 = num.substring(0,1);
    		String num10b = num.substring(1,2);
    		String num1b = num.substring(2,3);
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c-1]+eNum7[num1c];
    			return num;
    	}
    	if(n>=120 && n<=999){
    		String num100 = num.substring(0,1);
    		String num10b = num.substring(1,2);
    		String num1b = num.substring(2,3);
    		
    		
    		int num100b = Integer.parseInt(num100);
    		int num10c = Integer.parseInt(num10b);
    		int num1c = Integer.parseInt(num1b);
    		
    		num=eNum4[num100b-1]+eNum5[num10c-1]+eNum6[num1c];
    			return num;
    	}
        return "";
    }
}
