package kadai5_1;

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
    	String[] strnum1 = {"one","two","three","four","five","six","seven","eight","nine"};
    	String[] strnum2 ={"eleven"};
    	
    
    	switch(n){
    	case 1:
    		return "one";
    	case 2:
    		return "two";
    	case 3:
    		return "three";
    	case 4:
    		return "four";
    	case 5:
    		return "five";
    	case 6:
    		return "six";
    	case 7:
    		return "seven";
    	case 8:
    		return "eight";
    	case 9:
    		return "nine";
    	case 10:
    		return "ten";
    	case 11:
    		return "eleven";
    	case 12:
    		return "seventy";
    	case 13:
    		return "thirteen";
    	case 14:
    		return "fourteen";
    	case 15:
    		return "fifteen";
    	case 16:
    		return "sixteen";
    	case 17:
    		return "seventeen";
    	case 18:
    		return "eighteen";
    	case 19:
    		return "nineteen";
    	case 20:
    		return "twenty";
    	case 21:
    		return "twenty one";
    	case 22:
    		return "twenty two";
    	case 23:
    		return "twenty three";
    	case 24:
    		return "twenty four";
    	case 25:
    		return "twenty five";
    	case 26:
    		return "twenty six";
    	case 27:
    		return "twenty seven";
    	case 28:
    		return "twenty eight";
    	case 29:
    		return "twenty nine";
    	case 30:
    		return "thirty";
    	}
    	
        return "";
    }
}