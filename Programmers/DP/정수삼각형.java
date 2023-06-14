package DP;
import java.lang.Math;

public class 정수삼각형 {
  static int solution(int[][] triangle){
    int result = 0;
    int[][] dp = new int[triangle.length][];
    for(int i=0; i<triangle.length; i++){
      dp[i] = new int[triangle[i].length];
    }

    dp[0][0] = triangle[0][0];
    for(int i=1; i<triangle.length; i++){
      for(int j=0; j<triangle[i].length; j++){
        if(j == 0){
          dp[i][j] = dp[i-1][j] + triangle[i][j];
        }
        else if(j == triangle[i].length -1){
          dp[i][j] = dp[i-1][j-1] + triangle[i][j];
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j-1] + triangle[i][j], dp[i-1][j] + triangle[i][j]);
        }
        result = Math.max(result, dp[i][j]);
      }
    }

    return result;
  }
  public static void main(String[] args) {
    int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

    System.out.println(solution(triangle));
  }
}
