package testcases;

import java.util.Random;

public class CricketMatch {
	static int min = 0;
	static int max = 6;
	static int totalScore = 100;
	static int currentScore = 0;
	static int oneDayBalls = 300;
	static int t20Balls = 120;
	static int totalBalls = 1;

	public static void main(String[] args) {
		//startMatch("OneDayMatch");
		startMatch("T20Match");

	}

	public static void startMatch(String matchType) {
		if (matchType.equals("OneDayMatch")) {
			System.out.println("******Starting One Day Match*********");
			while (totalBalls <= oneDayBalls) {
				performButtonClick(totalBalls);
				if (totalBalls > oneDayBalls) {
					break;
				}
			}
		} else if (matchType.equals("T20Match")) {
			System.out.println("******Starting T20 Match*********");
			while (totalBalls <= t20Balls) {
				performButtonClick(totalBalls);
				if (totalBalls > t20Balls) {
					break;
				}
			}
		}
	}

	public static void performButtonClick(int currentBall) {
		int num = generateRandomNum(max, min);
		System.out.println("Run on " + totalBalls + " ball :" + num);
		currentScore = currentScore + num;
		System.out.println("current score is: " + currentScore);
		if (currentScore >= 100) {
			System.out.println("hey!!! congrtzzzzz");
			// break;
			totalBalls = currentBall + 1;
		} else {
			totalBalls = currentBall + 1;
			// performButtonClick(totalBalls);
		}
	}

	public static int generateRandomNum(int max, int min) {
		Random rn = new Random();
		int range = max - min + 1;
		int randomNum = rn.nextInt(range) + min;
		return randomNum;

	}

}
