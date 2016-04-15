import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String defult="ABCDLNNEKNNFJIHG";
        ArrayList<Pair> states=new ArrayList<>();
        states.add(new Pair("zero",input));
        Set<String> used=new HashSet<>();
        while (!states.isEmpty()){
            Pair check= ((Pair) states.remove(0));
            if (check.getState().equals(defult)){
                System.out.println("inja");
                System.out.println(check.getActions());
                break;
            }
            //action 1
            StringBuilder ac1=new StringBuilder(check.getState());
            //if(ac1.charAt(0)=='N'||ac1.charAt(1)=='N'||ac1.charAt(4)=='N'||ac1.charAt(5)=='N'){
            if(true){
                char tm1=ac1.charAt(1);
                ac1.setCharAt(1,ac1.charAt(0));
                char tm2=ac1.charAt(4);
                ac1.setCharAt(4,ac1.charAt(5));
                ac1.setCharAt(0,tm2);
                ac1.setCharAt(5,tm1);
                if(!used.contains(ac1.toString()))
                     states.add(new Pair(check.getActions()+"+ action1 +",ac1.toString()));
                used.add(ac1.toString());
            }
            //action 2
            StringBuilder ac2=new StringBuilder(check.getState());
//            if(ac2.charAt(2)=='N'||ac2.charAt(3)=='N'||ac2.charAt(6)=='N'||ac2.charAt(7)=='N'){
            if(true){
                char tm1=ac2.charAt(3);
                ac2.setCharAt(3,ac2.charAt(2));//inja monde
                char tm2=ac2.charAt(6);
                ac2.setCharAt(6,ac2.charAt(7));
                ac2.setCharAt(2,tm2);
                ac2.setCharAt(7,tm1);
                if(!used.contains(ac2.toString()))
                    states.add(new Pair(check.getActions()+"+ action2 +",ac2.toString()));
                used.add(ac2.toString());
            }
            //action 3
            StringBuilder ac3=new StringBuilder(check.getState());
//            if(ac3.charAt(8)=='N'||ac3.charAt(9)=='N'||ac3.charAt(12)=='N'||ac3.charAt(13)=='N'){
            if(true){
                char tm1=ac3.charAt(9);
                ac3.setCharAt(9,ac3.charAt(8));//inja monde
                char tm2=ac3.charAt(12);
                ac3.setCharAt(12,ac3.charAt(13));
                ac3.setCharAt(8,tm2);
                ac3.setCharAt(13,tm1);
                if(!used.contains(ac3.toString()))
                states.add(new Pair(check.getActions()+"+ action3 +",ac3.toString()));
                used.add(ac3.toString());
            }
            //action 4
            StringBuilder ac4=new StringBuilder(check.getState());
//            if(ac4.charAt(10)=='N'||ac4.charAt(11)=='N'||ac4.charAt(14)=='N'||ac4.charAt(15)=='N'){
            if(true){
                char tm1=ac4.charAt(11);
                ac4.setCharAt(11,ac4.charAt(10));//inja monde
                char tm2=ac4.charAt(14);
                ac4.setCharAt(14,ac4.charAt(15));
                ac4.setCharAt(10,tm2);
                ac4.setCharAt(15,tm1);
                if(!used.contains(ac4.toString()))
                states.add(new Pair(check.getActions()+"+ action4 +",ac4.toString()));
                used.add(ac4.toString());
            }
            //action 5
            StringBuilder ac5=new StringBuilder(check.getState());
//            if(ac5.charAt(5)=='N'||ac5.charAt(6)=='N'||ac5.charAt(9)=='N'||ac5.charAt(10)=='N'){
            if(true){
                char tm1=ac5.charAt(6);
                ac5.setCharAt(6,ac5.charAt(5));//inja monde
                char tm2=ac5.charAt(9);
                ac5.setCharAt(9,ac5.charAt(10));
                ac5.setCharAt(5,tm2);
                ac5.setCharAt(10,tm1);
                if(!used.contains(ac5.toString()))
                states.add(new Pair(check.getActions()+"+ action5 +",ac5.toString()));
                used.add(ac5.toString());
            }
            System.out.println(check.getState());
        }

    }
}
