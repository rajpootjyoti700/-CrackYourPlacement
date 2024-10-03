class Solution {
    public boolean lemonadeChange(int[] bills) {
//         int n = bills.length;
//         int a = 0;
//         int b = 0;
//         int c = 0;
//         for (int i = 0; i < n; i++) {
//             if (bills[i] == 5) {
//                 a++; // 8
//             }
//             if (bills[i] == 10) {
//                 b++; // 1
//                 if (a > 0) {
//                     a--;
//                 }
//                 else
//                 {
//                     return false;
//                 }
//             }
//             if (bills[i] == 20) {
//                 c++;
//                 if (a <= 0) {
//                     return false;
//                 }

//                 if (b <= 0) {
//                     if (a >= 3) {
//                         a=a-3;
//                     }
//                     else
//                     {
//                         return false;
//                     }
//                 }
//                 if(b>0)
//                 {
//                     a--;
//                     b--;
//                 }
//             }
//         }

//         return true;
        
    int a=0;
    int b=0;
    int c=0;
        int n=bills.length;
        for(int i=0;i<n;i++){
            if(bills[i]==5)
                a++;
            if(bills[i]==10){
                b++;
                if(a>0){
                    a=a-1;
                }
                else{
                    return false;
                }
            }
            
            if(bills[i]==20){
                c++;
                if(a<=0){
                    return false;
                }
                
                if(b<=0){
                    if(a>=3)
                        a=a-3;
                    else{
                        return false;
                    }
                }
                    if(b>0){
                        b--;
                        a--;
                    }
                
            }
            
                
        }
        
        return true;
    }
}