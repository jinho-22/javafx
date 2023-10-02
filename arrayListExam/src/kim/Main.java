package kim;

import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
    	ArrayList<Integer> soldiers = new ArrayList<>();
    	
    	for(int i = 1; i <= n; i++) {
    		soldiers.add(i);
    	}
    	
    	ArrayList<Integer> died_soldiers = new ArrayList<>();
    	
    	while (n>=2) {
    		for(int i = 1; i <= k-1; i++) {
    			soldiers.add(soldiers.get(0));
    			soldiers.remove(0);
    		}
    		died_soldiers.add(soldiers.get(0));
    		soldiers.remove(0);
    		n--;
    	}
    	
    	for(Integer died : died_soldiers) {
    		System.out.println(died + "군사가 죽습니다.");
    	}
    	return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김장군은 " + getSurvivingIndex(8, 3) + "번 자리에 서있으면 됩니다.");
    }
}