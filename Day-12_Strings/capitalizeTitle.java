public class capitalizeTitle {
    public static String capitalize(String title)
     {  
        String sb = new String();
        sb = "";
        String delimiter = " ";
        String[] split_string = title.split(" ");
        for(int i=0 ; i<split_string.length;i++)
        {
            if(split_string[i].length() <=2)
            {
                sb=sb+split_string[i].toLowerCase();
            }
            else{
                sb=sb+split_string[i].toUpperCase().charAt(0);
                for(int j=1;j<split_string[i].length();j++){
                    sb=sb+split_string[i].toLowerCase().charAt(j);
                }
            }
            sb=sb+" ";
        }
        return sb;
    }
    public static void main(String[] args)
     {
        String str = "First leTTeR of EACH Wordr";
        System.out.println(capitalize(str));
     }
}