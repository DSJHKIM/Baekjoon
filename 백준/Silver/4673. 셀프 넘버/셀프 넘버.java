public class Main {
    
    public static void main(String[] args) {
        int[] a = new int[12000];
        for(int i=1;i<=10000;i++){
            if(i<10){
                a[i+i] = i+i;
            }
            else if(i<100){
                a[i + i/10 + i%10] = i + i/10 + i%10;
            }
            else if(i<1000){
                a[i + i/100 + (i%100)/10 + (i%100)%10] = i + i/100 + (i%100)/10 + (i%100)%10;
            }
            else if(i<10000){
                a[i + i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +  ((i%1000)%100)%10] = i + i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +  ((i%1000)%100)%10;
            }
            else if(i==10000){
                a[10000] = 10000;
            }
        }

        for(int i=1;i<=10000;i++){
            boolean b = false;
            
            if(a[i] == 0 ){ // 셀프넘버
                b = true;
            }
            else{ // 셀프넘버 아니면
                b = false;
            }

            if(b == true){
                System.out.println(i);
            }
        }   
    }
}