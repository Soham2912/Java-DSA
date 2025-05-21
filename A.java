public class A{

public static void main(String args[]){

    int[] arr = {23 ,34 ,12, 37 ,55 ,7 ,99};

    

    int maxsum = arr[0]+arr[1]+ arr[2];
    int currsum = maxsum ;
        

    
    for(int i=1 ;i<arr.length-2 ; i++ ){
       // pre[n++]= pre[n-1] + arr[3] - arr[i-3];
         currsum = currsum - arr[i-1] + arr[i+2];

        // maxsum = Math.max(maxsum,currsum);
        if(currsum >maxsum){
            maxsum = currsum ;
        }
    }

//     for(int i = 0 ; i<pre.length;i++){
//     System.out.println(pre[i]);
// }

System.out.println(maxsum);
}




}