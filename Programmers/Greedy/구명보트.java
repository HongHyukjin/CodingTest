package Greedy;
import java.util.*;
public class 구명보트 {
  public static int solution(int[] people, int limit){
    int answer = 0;
    int idx = 0;
    Arrays.sort(people);
    for(int i=people.length-1; i>=idx; i--){
      if(people[i] + people[idx] <= limit){
        idx++;
        answer++;
      }
      else{
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] people = {70, 50, 80, 50};
    int limit = 100;
    System.out.println(solution(people, limit));
  }
}
