package me.test;

import java.util.ArrayList;
import java.util.List;

public class main{
        public static void main(String[] args) {
            for(int i=1;i<=10000;i++){
                switch (test(i)){
                    case 0:
                        //System.out.println(i+"richtig");
                        break;
                    case 1:
                        System.out.println(i+" nicht möglich");
                        break;
                    case 2:
                        System.out.println(i+"möglich");
                        break;
                }
            }
        }

        private static int test(int i) {
            int c=0;
            List<Integer> iterations=new ArrayList<>();
            while(i!=1&&c<=1000&&!iterations.contains(i)){
                iterations.add(i);
                if(i%3==0){
                    i=i/3;
                }else{
                    i=i+5;
                }
            }
            if(i==1){
                return 0;
            }else if(i!=1&&c<=1000){
                return 1;
            }else if(i!=1&&c>1000){
                return 2;
            }
            return 4;
        }
}
