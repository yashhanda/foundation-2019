public class check{

    public static void checkmaxright(int[]arr){
         
         for(int i=0;i<arr.length;i++){
             boolean flag=false;
             System.out.print(arr[i]+"->");
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]>arr[i]){
                     System.out.println(arr[j]);
                     flag=true;
                     break;
                 }
             }
             if(flag==false)
             System.out.println("-1");
         }
     }
     public static void checkmaxleft(int[]arr){
         
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            System.out.print(arr[i]+"->");
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.println(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.println("-1");
        }
    }
    public static void checkminright(int[]arr){
         
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            System.out.print(arr[i]+"->");
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    System.out.println(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.println("-1");
        }
    }
    public static void checkminleft(int[]arr){
         
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            System.out.print(arr[i]+"->");
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    System.out.println(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.println("-1");
        }
    }


 
    public static void main(String[]args){
         int[]arr={4,5,2,25};
         checkmaxright(arr);
         
     }
 }