
public class StringWithoutVowels {
    public static void main(String[] args)
{
    String noVowels = takeOutVowel("Peter loves dogs");
    System.out.println(noVowels); // prints "Ptr lvs dgs"
}

// This will remove all vowels from any String
private static String takeOutVowel(String s)
{
    return s.replaceAll("[aeiou]", "");
}
}
    

