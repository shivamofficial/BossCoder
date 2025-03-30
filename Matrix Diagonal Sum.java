public class codefile{
    static int solve(List<List<Integer>>  input){
        

        int n=input.size();

        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=input.get(i).get(i); // left diagonal
            sum+=input.get(i).get(n-1-i);
        }
        if(n %2 ==1)
        {
            sum-=input.get(n/2).get(n/2);
        }
        return sum;
    }
}
