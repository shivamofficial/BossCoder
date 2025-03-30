public class codefile{
    static int solve(int[]  input){
        
        int n=input.length;
        if(n<2)
        {
            return 0;
        }

Arrays.sort(input);
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n-1;i++)
        {
            maxi=Math.max(maxi,input[i+1]-input[i]);
        }
        return maxi;
    }
}
