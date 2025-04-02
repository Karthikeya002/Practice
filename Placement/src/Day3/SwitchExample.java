package Day3;

import java.util.*;
public class SwitchExample{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the character to days:");
char option=in.next().charAt(0);
switch(option){
case 'M':
System.out.println("Monday");
break;
case 'T':
System.out.println("Tuesday");
break;

case 'W':
System.out.println("Wednesday");
break;
case 't':
System.out.println("Thursday");
break;
case 'F':
System.out.println("Friday");
break;

default:
System.out.println("Input is wrong check the input");
break;
}

}
}