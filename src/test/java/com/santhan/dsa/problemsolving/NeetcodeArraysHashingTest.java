package com.santhan.dsa.problemsolving;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class NeetcodeArraysHashingTest {

    @Test
    public void anagramTest(){
        System.out.println(isAnagram("abc","bac"));

    }

    @Test
    public void twoSum(){
        int[] input = {2,3,4,5};
        int[] ints = twoSum(input,5);
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void anagramGroups(){
        String[] input = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(input));

    }

    @Test
    public void topKFrequentElement(){
        int[] input = {1};
        int[] ints = topKFrequent(input,1);
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void encodeDecode(){
        String[] input = {"we","say",":","yes","!@#$%^&*()"};
        List<String> input1 = List.of(input);
        String encode = encode(input1);
        System.out.println(encode);
        System.out.println(decode(encode));

    }

    @Test
    public void productExceptSelf(){
        int[] input = {1,2,4,6};
        int[] ints = productExceptSelf(input);
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void validSudoko(){
        String[][] input= {{"1","2",".",".","3",".",".",".","."},
                {"4",".",".","5",".",".",".",".","."},
                {".","9",".",".",".",".",".",".","3"},
                {"5",".",".",".","6",".",".",".","4"},
                {".",".",".","8",".","3",".",".","5"},
                {"7",".",".",".","2",".",".",".","6"},
                {".",".",".",".",".",".","2",".","."},
                {".",".",".","4","1","9",".",".","8"},
                {".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(input));

    }

    @Test
    public void longestConsecutive(){
        int[] input = {};
        System.out.println(longestConsecutive(input));
    }

    @Test
    public void isPalindrome(){
        System.out.println(isPalindrome("0P"));
    }

    @Test
    public void twoPointerTwoSum(){
        int[] input = {2,3,4};
        int[] ints = twoSumTwoPointer(input,6);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void threeSum(){
        int[] input = {-2,0,0,2,2};
        System.out.println(threeSum(input));

    }

    @Test
    public void maxArea(){
        int[] input = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(input));

    }

    @Test
    public void trap(){
        int[] input = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(input));
    }
    @Test
    public void validParanthesis(){
        String input = ")";
        System.out.println(isValid(input));
    }

    @Test
    public void minStack(){
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(21);
        Assertions.assertThat(minStack.top()).isEqualTo(21);


    }

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        Map<String,String> map= new HashMap<>();
        map.put(")","(");
        map.put("}","{");
        map.put("]","[");
        System.out.println(map);
        String[] split = s.split("");
        for(String v:split){
            if(map.containsValue(v)){
                stack.push(v);
            }else if(!stack.empty() && map.get(v).equals(stack.peek())){
                stack.pop();

            }else{
                return false;
            }

        }
        return stack.empty();

    }

    public int trap(int[] height) {
        int len = height.length;
        int l = 0;
        int r = len-1;
        int lmax = 0;
        int rmax = 0;
        int count =0;
        while(l<r){
            int lval = Math.max(Math.min(lmax,rmax) - height[l],0);
            int rval = Math.max(Math.min(lmax,rmax) - height[r],0);
            count += lval+rval;
            if(height[l]>lmax){
                lmax = height[l];
            }
            if(height[r]>rmax){
                rmax=height[r];
            }
            if(lmax<=rmax){
                l++;
            }else{
                r--;
            }

        }
return count;
    }

    public int maxArea(int[] heights) {
        int len = heights.length;

        int maxArea = 0;
        int i=0;
        int j = len-1;
        while(i<j){
            int area = Math.min(heights[i],heights[j])*(j-i);
            if(maxArea<area){
                maxArea = area;
            }
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }


        }
        return maxArea;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = len-1;
            while(j<k){
                if(j!=i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                if(k!=len-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                if(nums[j]+nums[k]+nums[i]==0){
                    li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    res.add(li);
                    j++;
                    k--;
                }
                if(nums[j]+nums[k]>0-nums[i]){
                    k--;
                }
                if(nums[j]+nums[k]<0-nums[i]){
                    j++;
                }
            }
        }

return res;


    }

    public int[] twoSumTwoPointer(int[] numbers, int target) {
        int len = numbers.length;
        int[] res = new int[2];
        int i=0;
        while(i<len-1){
            int j = i+1;
            while(j<len){
                if(numbers[j]== target-numbers[i]){
                    res[0] =i+1;
                    res[1] = j+1;
                    return res;
                }
                j++;

            }
            i++;
        }
        return res;
    }

    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String s1 = lowerCase.replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = nums.length;
        int max=0;
        for(int i=0;i<length;i++){
            set.add(nums[i]);
        }
        int j =0;
        int count =0;
        while(j<length){
            count =0;
            int k = nums[j];
            while(set.contains(k)){
                count++;
                k = k+1;
            }
            if(count>max){
                max=count;
            }
            j++;
        }

        return max;

    }

    public boolean isValidSudoku(String[][] board) {
        int length = board.length;
        Map<Integer,Set<String>> row = new HashMap<>();
        Map<Integer,Set<String>> col = new HashMap<>();
        Map<Integer,Set<String>> square = new HashMap<>();
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(board[i][j].equals(".")){
                    continue;
                }
                row.put(i,row.getOrDefault(i,new HashSet<>()));
                col.put(j,col.getOrDefault(j,new HashSet<>()));
                int squareIndex = (i/3)*3+j/3;
                square.put(squareIndex,square.getOrDefault(squareIndex,new HashSet<>()));
                if(!row.get(i).add(board[i][j]) || !col.get(j).add(board[i][j]) || !square.get(squareIndex).add(board[i][j])){
                    System.out.println(board[i][j]);
                    return false;
                }
            }
        }
        return true;

    }

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfix = new int[length];
        postfix[length-1] = nums[length-1];
        prefix[0] = nums[0];
        for(int i = 1; i< length; i++){
            prefix[i] = prefix[i-1]*nums[i];

        }
        for(int j=length-2;j>=0;j--){
            postfix[j] = postfix[j+1]*nums[j];
        }
        int[] res = new int[length];
        res[0]=postfix[1];
        res[length-1]= prefix[length-2];
        for(int i=1;i<length-1;i++){
            res[i] = prefix[i-1]*postfix[i+1];
        }
        return res;

    }

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s : strs){
            int len = s.length();
            builder.append(len);
            builder.append("#");
            builder.append(s);

        }
        return builder.toString();

    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.valueOf(str.substring(i,j)).intValue();
            String substring = str.substring(j + 1,j + 1 + len);
            ls.add(substring);
            i = j+1+len;
        }
        return ls;

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> collect = map.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).limit(k).map((e) -> e.getKey()).collect(Collectors.toList());
        int[] array = collect.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.put(sorted,map.getOrDefault(sorted,new ArrayList<>()));
            map.get(sorted).add(strs[i]);
        }

        List<List<String>> collect = map.values().stream().collect(Collectors.toList());
        return collect;

    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }

return res;

    }

    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> mapS = new HashMap<>();

        String[] split = s.split("");
        for(String sl : split){
            mapS.put(sl,mapS.getOrDefault(sl,0)+1);
        }
        System.out.println(mapS);

        String[] splitT = t.split("");
        for(String st: splitT){
            mapS.put(st,mapS.getOrDefault(st,0)-1);
        }
        System.out.println(mapS);
        List<Integer> collect = mapS.values().stream().filter(e -> e != 0).collect(Collectors.toList());
        if (collect.isEmpty()){
            return true;
        }

        return false;

    }
}
