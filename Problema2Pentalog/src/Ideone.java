
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1, 2, 1, 5, 2, 3, 1, 0, 1, 2, 6, 4, 5, 2, 3, 4, 1, 2};
		int n = a.length;
		int maxV = 0;
		for(int i = 0; i < n - 1; i++) {
			int j,nextG = i + 1;
			for(j = i + 1; j < n && a[i] > a[j]; j++) {
				if(a[nextG] < a[j])
					nextG = j;			
			}
			if(j < n && a[i] <= a[j])
				nextG = j;
			else
				j = n;
			int v = Math.min(a[i],a[nextG]);

			int ans = 0;
			for(int k = i + 1; k < nextG; k++)
				ans += v - a[k];
			maxV = Math.max(ans,maxV);
			System.out.println(ans);
		}
		System.out.println(maxV);
	}
}