package com.example.myapplication;

import com.example.myapplication.leetcode.ListNode;

import java.util.Arrays;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/9/8 4:46 PM
 **/
public class JJMTest {
    private static final String AMT_REGEX = "^(([1-9][0-9]{0,14})|([0]{1})|(([0]\\.\\d{1,2}|[1-9][0-9]{0,14}\\.\\d{1,2})))$";

    public static void main(String[] args) {




        long startTime = System.currentTimeMillis();    //获取开始时间

         //测试的代码段
        int a = sum(new int[]{1,2,3});

        System.out.println(5f/2);



        long endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }


    public static int sum(int[] arr){
        int result;
        if (arr.length == 0)return 0;

        if (arr.length == 1)return arr[0];
        else result = arr[arr.length-1] + sum(Arrays.copyOf(arr,arr.length-1));


        return result;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0)return "";
        StringBuilder common = new StringBuilder();
        int pos = 0;
        int minLength = 999999;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(strs[i].length(),minLength);
        }
        while (pos < minLength){
            char c = strs[0].charAt(pos);
            boolean isSame = true;
            for (int i = 0; i < strs.length; i++) {
                if (c != strs[i].charAt(pos)){
                    isSame =false;
                    break;
                }
            }
            if (isSame) common.append(c);
            else break;
            pos++;
        }
        return common.toString();
    }


//    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    //1994 MCMXCIV
    public static int romanToInt(String s) {
        int res = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length ; i++) {
            int value = getValue(c[i]);
            int nextvalue = i+1 == c.length ? 0 : getValue(c[i+1]);
            if (value < nextvalue){
                //组合情况
                res -= value;
            }else {
                res += value;
            }
        }
        return res;
    }
    private static int getValue(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;

        }
    }



    public static String intToRoman(int num) {
        if (num > 3999 || num < 1)throw new IllegalArgumentException();
        StringBuilder sb = new StringBuilder();
        int[] digits = new int[4];
        char[] chars = new char[]{'M','D','C','L','X','V','I'};
        digits[0] = num /1000;// i=0
        digits[1] = num / 100 % 10;//MDC j = 1,i=1
        digits[2] = num / 10 % 10;//CLXj=3,i=2
        digits[3] = num %10;//XVIj=5,i=3
        for (int i = 0; i < digits.length; i++) {
            int j = 2 * i - 1;
            if (digits[i] == 9){
                sb.append(chars[j+1]);
                sb.append(chars[j-1]);
            }else if (digits[i] > 4){
                sb.append(chars[j]);
                digits[i] -= 5;
                while (digits[i]-- != 0){
                    sb.append(chars[j+1]);
                }
            }else if (digits[i] == 4){
                sb.append(chars[j+1]);
                sb.append(chars[j]);
            }else{
                while (digits[i]-- != 0){
                    sb.append(chars[j+1]);
                }
            }
        }
        return sb.toString();
    }



    //[1,8,6,2,5,4,8,3,7]
    public static int maxArea(int[] height) {

        int maxarea = 0,l = 0,r = height.length - 1;
        while (l < r){
            maxarea = Math.max(maxarea,Math.min(height[r],height[l]) * (r - l));
            if (height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxarea;
    }

    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                }else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public static boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }



    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNumber=0;
        while(x>reverseNumber){
            reverseNumber=reverseNumber*10+x%10;
            x/=10;
        }
        return x==reverseNumber||x==reverseNumber/10;
//        if (x<0)return false;
//        String s = x + "";
//        int digits = s.length();
//        for (int i = 0; i < digits; i++) {
//            int left =  x / (int)Math.pow(10,digits - i - 1) % 10;
//            int right = x / (int)Math.pow(10,i) % 10;
//            if (left != right)return false;
//        }
//        return true;

    }



    public static int myAtoi(String s) {
//        char[] chars = s.trim().toCharArray();
//        if (chars.length == 0 || "-+0123456789".indexOf(chars[0]) == -1)return 0;
//        StringBuilder sb = new StringBuilder();
//        sb.append(chars[0]);
//        for (int i = 1; i < chars.length; i++) {
//            if (chars[i] > '9' || chars[i]<'0')break;
//            sb.append(chars[i]);
//        }
//
//        if (sb.length() == 1 && (chars[0] == '+' || chars[0] == '-'))return 0;
//        try {
//            return Integer.parseInt(sb.toString());
//        }catch (NumberFormatException e){
//            return chars[0] =='-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//        }


        double i = 0;
        boolean pos = true;
        boolean sign = false;
        for (char cha: s.toCharArray()) {
            if (cha == ' ' && !sign) continue;
            if (cha == '-' && !sign) {
                pos = false;
                sign = true;
                continue;
            } else if ( cha == '+' && !sign) {
                sign = true;
                continue;
            }
            if (cha >= '0' && cha <= '9') {
                i = i*10 + cha - '0';
                sign = true;
            } else break;
        }
        if (!pos) return (int)-i;
        return (int)i;
    }
    public static int reverse(int x) {
//        int result = 0;
//        boolean fu = x < 0 ? true : false;
//        StringBuilder sb = new StringBuilder((fu ? -x : x) + "");
//        String res = fu ? "-" + sb.reverse() : sb.reverse().toString();
//        try {
//            result = Integer.parseInt(res);
//        }catch (NumberFormatException e){
//            return 0;
//        }
//        return result;

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;


    }

    //6. Z 字形变换
    public static String convert(String s, int numRows) {
        if (numRows == 1)return s;
        int gourpLength = 2*numRows-2;
        int numColumn = getColumn(s.length(),numRows,gourpLength);
        char arr[][] = new char[numRows][numColumn];

        char[] sa = s.toCharArray();
        for (int i = 0; i < sa.length; i++) {
            int x,y;
            y = getColumn(i+1,numRows,gourpLength)-1;
            x = getRow(i+1,numRows,gourpLength)-1;
            arr[x][y] = sa[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0)sb.append(arr[i][j]);
            }
        }
        return sb.toString();
    }
    private static int getColumn(int len,int numRows,int gourpLength){
        int groupColumn = numRows - 1;
        int groupRemain = len % gourpLength;
        int columnRemain;
        if (groupRemain >= numRows) {
            columnRemain = groupRemain - numRows + 1;
        }else if (groupRemain < numRows && groupRemain > 0){
            columnRemain = 1;
        }else {
            columnRemain = 0;
        }
        return (len/gourpLength) * groupColumn + columnRemain;
    }
    private static int getRow(int len,int numRows,int gourpLength){
        int groupRemain = len % gourpLength;
        int row;
        if (groupRemain > numRows){
            row = 2*numRows - groupRemain;
        }else if (groupRemain <= numRows && groupRemain > 0){
            row = groupRemain;
        }else {
            row = 2;
        }
        return row;
    }


    public static String longestPalindrome(String s) {
        //暴力
//        int max = 0;
//        boolean tenet;
//        int start = 0,end = 0;
//
//        char[] a = s.toCharArray();
//        for (int i = 0; i < a.length ; i++) {
//            for (int j = max; j< a.length - i ; j++) {
//                tenet = true;
//                for (int k = 0; k < 1+j/2; k++) {
//                    if(a[i+k] != a[i+j -k]){
//                        tenet = false;
//                        break;
//                    }
//                }
//                if (tenet && max < 1+j){
//                    start = i;
//                    end = i+j+1;
//                    max = j+1;
//
//                }
//            }
//        }
//        return s.substring(start,end);
        //中心扩散
        if(s == null || s.length() == 0){
            return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int oddLen = expandLengthFromCenter(s, i, i);
            int evenLen = expandLengthFromCenter(s, i, i+1);
            int len = Math.max(oddLen, evenLen);

            if(len > end - start + 1){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
            System.out.println("i:"+i);
        }

        return s.substring(start, end + 1);
    }
    public static int expandLengthFromCenter(String content,int left,int right){
        while(left >= 0 && right <content.length() && content.charAt(left) == content.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            throw new RuntimeException("null");
        }
        int total = nums1.length + nums2.length;
        double pre = 0,result = 0;
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < total/2 +1; i++) {
            pre = result;
            if (p1 == nums1.length){
                result = nums2[p2++];
                continue;
            }
            if (p2 == nums2.length){
                result = nums1[p1++];
                continue;
            }
            if (nums1[p1] < nums2[p2]){
                result = nums1[p1++];
            }else {
                result = nums2[p2++];
            }
        }
        return total % 2 == 0 ? (pre + result)/2 : result;
    }


    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        if(s.length() == 1)return 1;
        for (int i = 0; i < s.length(); i++) {
            max = max == 0 ? 1 : max;
            for (int j = 1 ; j < s.length() - i; j++) {
                String temp = s.substring(i,i+j);
                char c = s.charAt(i + j);
                int meet = temp.indexOf(c);
                if (-1 != meet){//发现相等
                    if (max < temp.length())max = temp.length();
                    i = i + meet ;//下次开始地方前一个
                    break;
                }else {//未发现相等
                    if (max < temp.length()+1)max = temp.length()+1;
                }
            }
            int remain = s.length() - 1 - i;
            if (max >= remain)break;

        }
        return max;

//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int end = 0, start = 0; end < n; end++) {
//            char alpha = s.charAt(end);
//            if (map.containsKey(alpha)) {
//                start = Math.max(map.get(alpha), start);
//            }
//            ans = Math.max(ans, end - start + 1);
//            map.put(s.charAt(end), end + 1);
//        }
//        return ans;

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result;
        ListNode node = new ListNode(0);
        result = node;
        while (l1 != null || l2 != null || carry == 1){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = 0;//重制进位
            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;//需进位
            }
            node.val = sum;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (l1 != null || l2 != null || carry == 1)node.next = new ListNode(0);
            node = node.next;
        }
        return result;

    }



}
