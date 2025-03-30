public class codefile{
    static int trap(int[]  input){
        

      int n = input.length;
        if (n == 0) return 0; // Edge case: empty array

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

//int watersupport =Integer.MAX_VALUE;
int waterstore=0;
 leftmax[0]=input[0];

// left max find
for(int i=1;i<n;i++)
{
    leftmax[i]=Math.max(leftmax[i-1],input[i]);
}
// right max

rightmax[n-1]=input[n-1];

for(int i=n-2;i>=0;i--)
{
    rightmax[i]=Math.max(rightmax[i+1],input[i]);
}

// calculate water;

for(int i=0;i<n;i++)
{
    int watersupport=Math.min(leftmax[i],rightmax[i]);
    waterstore+=watersupport-input[i];
}
return waterstore;

    }
}
