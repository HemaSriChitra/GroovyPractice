class ReverseNumber{

    static main(args) {
        //Initializing
        int val = 26278;
        int r = rev(val);
        println(val +" :reverse : "+r);
    }
    public static int rev(int n){
        //intializing a r temperary variable
        int temp = 0;
        int num = 0;
        while(n!=0){
            //forumula
            temp = n%10;
            num = (num*10) + temp;
            n = n/10;
        }
        // return the value
        return num;
    }
}