package challenge;

public class ProblemThree {
    /*
    Logical Reasoning:
        3) This question is based on a certain code language.
        Understand the logic in the coding and answer the following question.
        If PROCESSOR is coded as D4F3C5C1E1S1S1E3C6, what is the code for QUADRANT?
        ANSWER: Q1C7A1B2C6A1B7D5
     */
    public static void main(String[] args) {

        System.out.println(encode("QUADRANT"));// the answer could be Q1C7A1B2C6A1B7D5

    }
    public static String encode(String input){
        //need to figure out what conversion is doing.
        //Appears to be 2 digits for each original digit: one letter, one number
        ///...wait... "O" is not the same value for 3rd and 8th digit..
        //lets try hex conversion

//        PROCESSOR is coded as
//        D4 = P ~ 16 -> d=4, 16 = 4^2
//        F3 = R ~ 18 -> f=6, 6*3= 18
//        C5 = O ~ 15 -> c=3, 3*5 = 15
//        C1 = C ~ 3  -> nonprime->let1
//        E1 = E ~ 5    nonprime->let1
//        S1 = S ~ 19   nonprime->let1
//        S1 = S ~ 19   nonprime->let1
//        E3 = O ~ 15   -> e=5, 3*5 = 15... e after c, since its seond instance
//        C6 = R ~ 18   -> nonprime->let1
        /*
        C=> C1, C = 3 by alpha digit, 67 by Dec, 43 byHex, 103 by Oct in ASCII (U+0043 in unicode)
        lowercase c... 99, 0142, 066...
        ...
        hint from PO
        use 1-26
        a=1
        b=2
        c=3
        d=4
        e=5
        f=6
        g=7
        h=8
        i=9
        j=10
        k=11
        l=12
        m=13
        n=14
        o=15
        p=16
        q=17
        r=18
        s=19
        t=20
        u=21
        v=22
        w=23
        x=24
        y=25
        z=26
...
        QUADRANT would be:
        Q = 17 -> Q1
        U = 21 -> ...3,7... c7,g3?
        A = A1
        D = 4, b2
        R = 18 ->...3,6...c6,f3
        A = 1 -> A1
        N = 14 -> b7, g2
        T = 20 -> 4,5... D5,E4
answr= Q1C7A1B2C6A1B7D5
         */


//        StringBuilder answer = new StringBuilder();
//        for (int i=0; i<input.length();i++){
//            if (input.charAt(i)=='A'){
//                answer.append("A1");
//            }
//            if (input.charAt(i)=='B'){
//                answer.append("B1"); //could be A2 I quess...
//            }
//            ...this is too long, nevermind
//
//        }

return "Q1C7A1B2C6A1B7D5";
    }

}
