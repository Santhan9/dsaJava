package com.santhan.dsa.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringProblems {

    //given a string BANANA we need to remove the characters from other string and return the number of moves
    // BANANA NNAABAABXX => ABXX =>


    public static int stringRemove(String s, String in){

        char[] sArr = s.toCharArray();
Map<Character,Integer> sMap = new HashMap<>();
        for(int i=0;i<sArr.length;i++){
            sMap.put(sArr[i],sMap.getOrDefault(sArr[i],0)+1);
        }

        char[] inArr = in.toCharArray();
        Map<Character,Integer> inMap = new HashMap<>();
        for(int i=0;i<inArr.length;i++){
            sMap.put(inArr[i],inMap.getOrDefault(sArr[i],0)+1);
        }

//        sMap.keySet().stream().forEach((e)->{
//            int val = inMap.get(e)/sMap.get(e);
//        });




        return 0;

    }









    //GIVEN ARRAY WITH SKILLS OF N PLAYERS AND THE PLAYERS ARE PLAYING TOURNAMENT WITH ROUNDS RETURN LAST ROUND FOR EACH PLAYER


}
