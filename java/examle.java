class add{
    int add(int n1,int n2){
        int r=n1+n2;
        return r;

    }
}
class examle{
    public static void main(String args[]){
        int n1=2;int n2=4;
        add a = new add();
        int result=a.add(2,4);
        System.out.println(result);

    }
}