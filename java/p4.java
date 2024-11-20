class p4{
    
    public static void main(String args[]){
        int k=0;
        for(int i=0;i<5;i++){
            
            for(int j=0;j<=k;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            k++;
            System.out.println(" ");
           
        }
    }
}