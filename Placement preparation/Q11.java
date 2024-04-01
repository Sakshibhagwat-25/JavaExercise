class Demo{
    public static void main(String args[]){
        String originalString = "Sipna123 Coet";
        String cleanedString = removeNonalphabt(originalString);
        System.out.println(cleanedString);
    }
    public static String removeNonalphabt(String input){
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            if (Character.isLetter(c)){
                result.append(c);
            }
        }
        return result.toString();
    }
}