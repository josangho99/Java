package javaproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,5,123};
		int result = solution(arr);
		System.out.println(result);
	}
	public static int solution(int[] array) {
        int answer = 0;
        Set<Integer> set= new HashSet<>();
        //배열 정렬하기
        Arrays.sort(array);
        
        for(int z=0; z<array.length; z++) {
        	System.out.println(array[z]);
        }
        
        //배열에서 set 추출(정렬된 set)
        for(int a:array) {
        	set.add(a);
        }
        
        for(int z:set) {
        	System.out.println(z);
        }
        
        //count 저장할 배열 만들기
        int[] count_array = new int[set.size()];
        
        //배열에 각 count값 저장하기
        int index = 0;
        for(int s:set) {
        	int count = 0;
        	for(int i=0; i<array.length;i++) {
        		if(s==array[i]) {
        			count++;
        		}
        	}
        	count_array[index]=count;
        	index++;
        }
        
        //최빈값이 2개 이상일 경우 -1
        int max_count = 0;
        int temp = 0;
        for(int i=0; i<count_array.length;i++) {
        	for(int j=i+1; j<count_array.length; j++) {
        		if(count_array[i] == count_array[j]) {
        			max_count++;
        		}
        	}
        }
        if(max_count !=0) {
        	return -1;
        }
        
        
        //{1,1,2,2,3,3,3,4}
        //<1,2,3,4>
        //2 2 3 1
        
        //{1,1,2}
        //<1,2>
        //2 1
        //count 저장할 배열 만들기
        
        return answer;
    }
	
	public static int[] solution2(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		//17 17 17 51 -> 4,3
		//68 1*4*17 51 1*3*17
		
		//그냥 크게 만들
		int result_numer = numer1 * denom2 + numer2 * denom1;
		int result_denom = denom1 * denom2;
		
		//약분하기
		System.out.println(result_numer);
		System.out.println(result_denom);
		
		int d = gcd(result_numer,result_denom);
		answer[0] = result_numer / d;
		answer[1] = result_denom / d;
        return answer;
    }
	
    private static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
			
			//68 51 -> r=17 _a=51 _b=17
			//51 17 -> r=0 _a=17, _b=0
			
			//3 4 -> r=3, _a=4, _b=3;
			//4 3 -> r=1, _a=3, _b=1;
			//3 1 -> r=0, _a=1, _b=0;
		}
		
    	return a;
	}

	public static int solution1(int chicken) {
        int answer = 0;
        int coupon = 0;
        //100마리 주문 chicken = 100;
        //쿠폰도 100개
        coupon = chicken;
        //coupon / 10 으로 쿠폰주문(100/10) ... 치킨 10마리 주문
        //쿠폰은 = 남은 쿠폰(%) + 서비스 치킨
        //여기서 또 넘으면 서비스 치킨 ...coupon / 10
        //쿠폰은 = 남은 쿠폰(%) + 서비스 치킨
        int service_chicken;
        
        while (coupon >= 10) {
        	service_chicken = coupon/10;
        	coupon = coupon % 10 + service_chicken;
        	answer += service_chicken;
        	if(coupon <10) {break;}
		}
        return answer;
    }
}
