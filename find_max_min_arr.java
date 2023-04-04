class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long max=0;
        long min=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return new pair(min, max);
        
    }
}
