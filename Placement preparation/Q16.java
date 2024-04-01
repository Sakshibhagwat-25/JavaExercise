class Demo{
    public static boolean isPalagram(String str){
        boolean[] alphabet = new boolean[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                alphabet[ch-'a']=true;
            }
        }
        for(boolean b : alphabet){
            if(!b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        if(isPalagram(str)){
            System.out.println("The string is a palagram.");
        }
        else{
            System.out.println("The string is not a palagram.");
        }
    }
}