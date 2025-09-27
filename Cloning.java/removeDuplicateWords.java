public class removeDuplicateWords {
    public static void main(String[] args) {
        String str = "This is is a a test test string string";
        String[] words = str.split(" ");
        String dump="";
        
        for(int i=0;i<words.length;i++)
        {   boolean flag=true;
            for(int j=0;j<i;j++)
            {
                if(words[i].equals(words[j])&&i!=j)
                {
                    flag=false;break; 
                }
            }
            if(flag)dump+=words[i]+" ";
        }
        System.out.println(dump.trim());
    }
}
