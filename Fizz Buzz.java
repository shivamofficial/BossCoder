public class codefile{
    static String[] solve(int n){
         ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i)); // Convert number to string
            }
        }
        return answer.toArray(new String[0]); // arraylist to string[]convert
    }
}
