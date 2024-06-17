class numVowels{
    public static void main(String[] args){
        // Check that there is exactly 1 command line argument (the input word for analysis).
        if (args.length != 1){
            System.out.println("Usage: java numVowels <\"word\">");
            return;
        }

        // Get the word from the command line argument.
        String word = args[0];

        // get the number of vowels in the given word.
        int numVowels = countVowels(word);

        // print the number of vowels present the in the given word.
        System.out.println("There are " + numVowels + " vowels in \""+ word + "\"");
    }

    private static int countVowels(String word){
        // set up a counter variable initially set to 0.
        int count = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // set up a variable to look at the current character.
        char c;

        // look through the word character by character.
        for (int i = 0; i <= word.length() - 1; i++){
            c = word.charAt(i);
            
            // look through the list of vowels.
            for (int j = 0; j <= vowels.length - 1; j++){
                // if the current character in the word is a vowel, increment the vowel count.
                if (c == vowels[j]){
                    count++; 
                }
            }
        }

        return count;
    }
}