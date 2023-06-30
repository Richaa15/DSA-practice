public class MaxFrequency{
    public static void main(String[] args){
        int a[] = {1,2,4,4,5,4,6,4,4};
        int n = a.length;
        int count = 0, freq =0;
        for (int i=0 ;i<n-1;i++){ 
             if(a[i]==a[i+1] || a[i]==count){
                count = a[i];
                freq++;
            }
        }
        if(count == a[n-1])
            freq++;

        if(freq > n/2){
            System.out.println("The most repeated element is: " +count);
            System.out.println("it's frequency is: " +freq);
        }else{
            System.out.print("None");
        } 
    }
}
