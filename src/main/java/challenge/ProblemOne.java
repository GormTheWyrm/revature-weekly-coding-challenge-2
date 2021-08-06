package challenge;

public class ProblemOne {
    /*
    Problem 1: Given two Strings A and B. Find the length of the Longest Common Subsequence (LCS) of the given Strings. Input: A = Minneapolis, B = Minnesota.

     -- should capitolization matter?
     */

    public static void main(String[] args) {

    }
    public static int lengthFinder(String one, String two){
        int answer = 0;

        if (one.length()>0 && two.length()>0){

           for (int i = 0; i<one.length();i++){   //now, for each letter in ONE
                for (int j = 0; j<two.length();j++){ //iterate through TWO
                    if (two.charAt(j)==one.charAt(i)){ //main logic- if first letter of a sequence is the same
                        int streak = 1;
//                        int index = 1;
                        for (int index = 1; index <one.length()-i && index <two.length()-j; index++){
                            //this should limit iterations through this loop to the size of one or two...
                            if (one.charAt(i+index)==two.charAt(j+index)){
                                ++streak;
                                if (streak>answer){
                                    answer = streak;
                                }
                            }
                            else {
                                break; //leaves loop when no longer matching
                            }

                        }


                }
            }
        }


    }

        return answer;
    }

}
//probably a better alternative usign contains or similar string method...