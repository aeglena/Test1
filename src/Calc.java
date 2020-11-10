import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public static void main(String[] args)
    {
        Scanner example = new Scanner(System.in);
        Operation myOperation = new Operation();
        System.out.println("Введите пример: ");
        String str = example.nextLine();
        Translation myTranslation = new Translation();
        str = str.trim();
        int p = 0;
        Pattern patt = Pattern.compile("\\s|-|\\+|\\*|/");
        Pattern patt1 = Pattern.compile("\\+");
        Pattern patt2 = Pattern.compile("-");
        Pattern patt3 = Pattern.compile("\\*");
        Pattern patt4 = Pattern.compile("/");
        Matcher match1 = patt1.matcher(str);
        Matcher match2 = patt2.matcher(str);
        Matcher match3 = patt3.matcher(str);
        Matcher match4 = patt4.matcher(str);
        String[] terms = patt.split(str);
        Integer i1 = 0, i2 = 0;
        try {
            i1 = Integer.valueOf(terms[0]);
            i2 = Integer.valueOf(terms[1]);
            if ((0 > i1) | (i1 > 10) | (0 > i2) | (i2 > 10)) {
                throw new ExceptionArb();
            }
        } catch (ExceptionArb ex) {
            System.out.println(ex.toString());
            return;
        }
            catch(NumberFormatException e){
            try {
                String romarb[] = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                for (int j = 0; j < 10; j = j + 1) {
                    if (romarb[j].equalsIgnoreCase(terms[0])) {
                        i1 = myTranslation.romArab(terms[0]);
                        p = p + 1;
                    }
                }
                for (int k = 0; k < 10; k = k + 1) {
                    if (romarb[k].equalsIgnoreCase(terms[1])) {
                        i2 = myTranslation.romArab(terms[1]);
                        p = p + 1;

                    }
                }
                if (p < 2) {
                    throw new Exception("Не допустимые символы");
                }
            }
            catch (Exception ex1) {
              System.out.println(ex1.getMessage());
              return;
            }
        }

        if (match1.find()) {
            int reply1=0, reply2=0;
            String replyRom1, replyRom2;
            int reply = myOperation.sum(i1, i2);
            if (p>1){
                reply1=reply/10;
                reply1=reply1*10;
                replyRom1=myTranslation.arabRom(reply1);
                reply2=reply%10;
                replyRom2=myTranslation.arabRom10(reply2);
                System.out.println(replyRom1+replyRom2);
            }
            else
            System.out.println(reply);
        }
        if (match2.find()) {
            int reply1=0, reply2=0;
            String replyRom1, replyRom2;
            int reply = myOperation.subt(i1, i2);
            if (p>1){
                reply1=reply/10;
                reply1=reply1*10;
                replyRom1=myTranslation.arabRom(reply1);
                reply2=reply%10;
                replyRom2=myTranslation.arabRom10(reply2);
                System.out.println(replyRom1+replyRom2);
            }
            else
            System.out.println(reply);
        }
        if (match3.find()) {
            int reply1=0, reply2=0;
            String replyRom1, replyRom2;
            int reply = myOperation.mult(i1, i2);
            if (p>1){
                reply1=reply/10;
                reply1=reply1*10;
                replyRom1=myTranslation.arabRom(reply1);
                reply2=reply%10;
                replyRom2=myTranslation.arabRom10(reply2);
                System.out.println(replyRom1+replyRom2);
            }
            else
            System.out.println(reply);
        }
        if (match4.find()) {
            int reply1=0, reply2=0;
            String replyRom1, replyRom2;
            int reply = myOperation.div(i1, i2);
            if (p>1){
                reply1=reply/10;
                reply1=reply1*10;
                replyRom1=myTranslation.arabRom(reply1);
                reply2=reply%10;
                replyRom2=myTranslation.arabRom10(reply2);
                System.out.println(replyRom1+replyRom2);
            }
            else
            System.out.println(reply);
        }
    }
}
