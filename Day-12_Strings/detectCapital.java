public class detectCapital {

        public static boolean detectCapitalUse(String word) {
            String sb = new String();
            sb=sb+word.toUpperCase().charAt(0);
            for(int j=1;j<word.length();j++){
                sb=sb+word.toLowerCase().charAt(j);
            }
            if(word == word.toUpperCase() || word == word.toLowerCase() || word.equals(sb) )
            {
                return true;
            }

            return false;
        }
    

    public static void main(String[] args) {
        String word = "Flag";
        System.out.println(detectCapitalUse(word));
    }
}