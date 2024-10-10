public class recursion {
    static  int cnt =1;

    public static void print(){
        if(cnt==11)
        return;
        System.out.println(cnt);
        cnt++;
        print();

       
    }
    public static void main(String[] args) {
        print();
        
    }
}
