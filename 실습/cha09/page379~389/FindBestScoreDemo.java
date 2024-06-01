package cha09_exercise;

class MathScore implements Comparable<MathScore> {
    String name;
    int score;

    public MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(MathScore e) {
        return score - e.score;
    }

    public String toString() {
        return name + ", " + score;
    }
}

class EnglishScore implements Comparable<EnglishScore> {
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(EnglishScore e) {
        return score - e.score;
    }

    public String toString() {
        return name + ", " + score;
    }
}

public class FindBestScoreDemo {
    static <T extends Comparable<T>> T findBest(T[] a) {
        T best = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(best) > 0) {
                best = a[i];
            }
        }
        return best;
    }
    
    static <T> T findScore(T[] a, String name) {
    	T findUser = null;
    	
    	for(int i = 0; i < a.length; i++) {
    		if(a[i].toString().substring(0, 3).equals(name)) {
    			findUser = a[i];
    			break;
    		}
    	}
    	
    	return findUser;
    	
    }

    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88),
                new EnglishScore("홍길동", 99)};

        MathScore[] ma = {new MathScore("김삿갓", 80), new MathScore("장영실", 98),
                new MathScore("홍길동", 70)};
        String name = null;
        
        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));
        
        try {
        	name = args[0];
        	
	        System.out.println("영어     점수 : " + findScore(ea, name));
	        System.out.println("수학     점수 : " + findScore(ma, name));
	        
        } catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("명령행 인자가 없습니다.");
        }
        
        
    }
}