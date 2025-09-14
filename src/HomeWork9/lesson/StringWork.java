package HomeWork9.lesson;


public class StringWork {

    //1_2
    public void countWordsAndShowTheLine(String line){
        line =line.trim();
        if(!line.isEmpty()){
            String copyLine = "";
            int words =1;
            for(char letter:line.toCharArray()){
                copyLine+=letter;
                if(letter == ' ')
                    words++;
                System.out.println(copyLine);
            }
            System.out.println("Count of words: " + words);
        }
        else
            System.out.println("Your line is empty");

    }

    //3
    public void findLessNumbers(String line, int number){
        String[] splitLine = line.split(",");
        int numberInLine =0;
        for(String symbol: splitLine){
            if (!symbol.equals(",")) {
                try{
                    numberInLine = Integer.parseInt(symbol);
                    if(numberInLine<number)
                        System.out.print(numberInLine + " ");
                }catch(NumberFormatException e){
                    System.out.println("It is not number");
                }
            }
        }
        System.out.println();
    }

    //4
    public boolean isPalindrome(String input){
        input = input.trim();
        int end = input.length()-1;
        for(int i =0;i<input.length()/2;i++,end--){
            if(input.charAt(i) != input.charAt(end))
                return false;
        }
        return true;
    }
    //5
    public String compress(String input){
        input = input.trim();
        String compressLine = "";
        char repeatElement = input.charAt(0);
        int countRepeatelemts =0;

        for(char letter : input.toCharArray()){
            if(repeatElement == letter){
                countRepeatelemts++;
            }
            else{
                compressLine += "" + repeatElement + countRepeatelemts;
                repeatElement = letter;
                countRepeatelemts=1;
            }
        }
        compressLine += "" + repeatElement + countRepeatelemts;

        return (compressLine.length() >= input.length())? input:compressLine;

    }
}
