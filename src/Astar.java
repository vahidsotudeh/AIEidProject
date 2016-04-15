import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by ${Microsoft} on 10/04/2016.
 */
public class Astar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        ArrayList<StarPair> qu = new ArrayList<>();
        qu.add(new StarPair(in," ",200));
        String defult = "ABCDLNNEKNNFJIHG";
        Set<String> used = new HashSet<>();
        used.add(defult);
        while (!qu.isEmpty()) {
            int index = 0;
            int min = qu.get(0).getFuntion();
            for (int i = 1; i < qu.size(); i++) {
                if (qu.get(i).getFuntion() < min) {
                    min = qu.get(i).getFuntion();
                    index = i;
                }
            }

            StarPair starPair = ((StarPair) qu.remove(index));
            System.out.println(starPair.funtion);
            if (starPair.getState().equalsIgnoreCase(defult)){
                System.out.println("inja");
                System.out.println(starPair.getPre());
                System.out.println(starPair.getState());
                break;
            }
            String act1=doAction(starPair.state,1);
            String act2=doAction(starPair.state,2);
            String act3=doAction(starPair.state,3);
            String act4=doAction(starPair.state,4);
            String act5=doAction(starPair.state,5);
            if (!used.contains(act1)) {
                used.add(act1);
                qu.add(new StarPair(act1,starPair.getPre()+"1+",func(act1)));
            }
            if (!used.contains(act2)) {
                used.add(act2);
                qu.add(new StarPair(act2,starPair.getPre()+"+2+",func(act2)));
            }
            if (!used.contains(act3)) {
                used.add(act3);
                qu.add(new StarPair(act3,starPair.getPre()+"+3+",func(act3)));
            }
            if (!used.contains(act4)) {
                used.add(act4);
                qu.add(new StarPair(act4,starPair.getPre()+"+4+",func(act4)));
            }
            if (!used.contains(act5)) {
                used.add(act5);
                qu.add(new StarPair(act5,starPair.getPre()+"+5+",func(act5)));
            }

        }
    }
    public static int[] func(String defult){
        int function[]=new int[6];
        int A = defult.indexOf('A');
        int B = defult.indexOf('B');
        int C = defult.indexOf('C');
        int D = defult.indexOf('D');
        int L = defult.indexOf('L');
        int K = defult.indexOf('K');
        int E = defult.indexOf('E');
        int F = defult.indexOf('F');
        int J = defult.indexOf('J');
        int I = defult.indexOf('I');
        int G = defult.indexOf('G');
        int H = defult.indexOf('H');
//                if (A == 0 | B == 1 | C == 2 | D == 3 | L == 4 | E == 7 | K == 8 | F == 11 | J == 12 | I == 13 | H == 14 | G == 15) {
//                    function = function;
//                }

        if (A == 1 | A == 4 | A == 5) {
            switch (A){
                case 1:function[1]+=3;
                    break;
                case 4:function[1]+=1;
                    break;
                case 5:function[1]+=2;
                    break;
            }
        }
        if (B == 0 | B == 4 | B == 5) {
            switch (B){
                case 0:function+=1;
                    break;
                case 4:function+=2;
                    break;
                case 5:function+=3;
                    break;
            }
        }
        if (L == 0 | L == 1 | L == 5) {
            switch (L){
                case 0:function+=3;
                    break;
                case 1:function+=2;
                    break;
                case 5:function+=1;
                    break;
            }

        }
        if (C == 3 | C == 6 | C == 7) {
            switch (C){
                case 3:function+=3;
                    break;
                case 6:function+=1;
                    break;
                case 7:function+=2;
                    break;
            }
        }
        if (E == 2 | E == 6 | E == 3) {
            switch (E){
                case 2:function+=2;
                    break;
                case 6:function+=3;
                    break;
                case 3:function+=1;
                    break;
            }

        }
        if (K == 9 | K == 12 | K == 13) {
            switch (K){
                case 9:function+=3;
                    break;
                case 12:function+=1;
                    break;
                case 13:function+=2;
                    break;
            }

        }
        if (J == 8 | J == 13 | J == 9) {
            switch (J){
                case 8:function+=3;
                    break;
                case 9:function+=2;
                    break;
                case 13:function+=1;
                    break;
            }
        }
        if (I == 8 | I == 9 | I == 12) {
            switch (I){
                case 8:function+=2;
                    break;
                case 9:function+=1;
                    break;
                case 12:function+=3;
                    break;
            }
        }
        if (F == 10 | F == 14 | F == 15) {
            switch (F){
                case 10:function+=1;
                    break;
                case 14:function+=2;
                    break;
                case 15:function+=3;
                    break;
            }

        }
        if (H == 10 | H == 11 | H == 15) {
            switch (H){
                case 10:function+=3;
                    break;
                case 11:function+=2;
                    break;
                case 15:function+=1;
                    break;
            }

        }
        if (G == 10 | G == 11 | G == 14) {
            switch (G){
                case 10:function+=2;
                    break;
                case 11:function+=1;
                    break;
                case 14:function+=3;
                    break;
            }

        }
        if (A == 2 | A == 3 | A == 7 | A == 11 | A == 15 | A == 14 | A == 8 | A == 12 | A == 13) {
            function += 3;
        }
        if (A == 9 | A == 10 | A == 6) {
            function += 2;
        }
        if (A == 2 | A == 3 | A == 7 | A == 11 | A == 15 | A == 14 | A == 8 | A == 12 | A == 13) {
            function += 3;
        }
        if (A == 6 | A == 10 | A == 9) {
            function += 2;
        }
        if (B == 2 | B == 3 | B == 7 | B == 11 | B == 15 | B == 14 | B == 8 | B == 12 | B == 13) {
            function += 3;
        }
        if (B == 6 | B == 10 | B == 9) {
            function += 2;
        }
        if (L == 2 | L == 3 | L == 7 | L == 11 | L == 15 | L == 14 | L == 8 | L == 12 | L == 13) {
            function += 3;
        }
        if (C == 0 | C == 1 | C == 4 | C == 8 | C == 12 | C == 13 | C == 14 | C == 15 | C == 11) {
            function += 3;
        }
        if (C == 5 | C == 9 | C == 10) {
            function += 2;
        }
        if (E == 0 | E == 1 | E == 4 | E == 8 | E == 12 | E == 13 | E == 14 | E == 15 | E == 11) {
            function += 3;
        }
        if (E == 5 | E == 9 | E == 10) {
            function += 2;
        }
        if (D == 0 | D == 1 | D == 4 | D == 8 | D == 12 | D == 13 | D == 14 | D == 15 | D == 11) {
            function += 3;
        }
        if (D == 5 | D == 9 | D == 10) {
            function += 2;
        }
        if (F == 0 | F == 1 | F == 4 | F == 8 | F == 12 | F == 13 | F == 2 | F == 3 | F == 7) {
            function += 3;
        }
        if (F == 5 | F == 6 | F == 9) {
            function += 2;
        }
        if (H == 0 | H == 1 | H == 4 | H == 8 | H == 12 | H == 13 | H == 2 | H == 3 | H == 7) {
            function += 3;
        }
        if (H == 5 | H == 6 | H == 9) {
            function += 2;
        }
        if (G == 0 | G == 1 | G == 4 | G == 8 | G == 12 | G == 13 | G == 2 | G == 3 | G == 7) {
            function += 3;
        }
        if (G == 5 | G == 6 | G == 9) {
            function += 2;
        }
        return function;
    }
    public static String doAction(String CurrState, int action) {
        StringBuilder ac = new StringBuilder(CurrState);
        if (action == 1) {
            char tm1 = ac.charAt(1);
            ac.setCharAt(1, ac.charAt(0));
            char tm2 = ac.charAt(4);
            ac.setCharAt(4, ac.charAt(5));
            ac.setCharAt(0, tm2);
            ac.setCharAt(5, tm1);
        }
        if (action == 2) {
            char tm1 = ac.charAt(3);
            ac.setCharAt(3, ac.charAt(2));
            char tm2 = ac.charAt(6);
            ac.setCharAt(6, ac.charAt(7));
            ac.setCharAt(2, tm2);
            ac.setCharAt(7, tm1);
        }
        if (action == 3) {
            char tm1 = ac.charAt(9);
            ac.setCharAt(9, ac.charAt(8));
            char tm2 = ac.charAt(12);
            ac.setCharAt(12, ac.charAt(13));
            ac.setCharAt(8, tm2);
            ac.setCharAt(13, tm1);
        }
        if (action == 4) {
            char tm1 = ac.charAt(11);
            ac.setCharAt(11, ac.charAt(10));
            char tm2 = ac.charAt(14);
            ac.setCharAt(14, ac.charAt(15));
            ac.setCharAt(10, tm2);
            ac.setCharAt(15, tm1);

        }
        if (action == 5) {
            char tm1 = ac.charAt(6);
            ac.setCharAt(6, ac.charAt(5));
            char tm2 = ac.charAt(9);
            ac.setCharAt(9, ac.charAt(10));
            ac.setCharAt(5, tm2);
            ac.setCharAt(10, tm1);

        }
        return ac.toString();

    }
}
