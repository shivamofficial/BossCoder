public class codefile{
    static int[] solve(int[]  input){
        
     int size = input.length;
        int[] ans = new int[2 * size]; 
        
        for (int i = 0; i < size; i++) {
            ans[i] = input[i];
            ans[i + size] = input[i];
        }
        return ans;
    }
}
