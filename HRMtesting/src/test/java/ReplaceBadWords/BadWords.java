package ReplaceBadWords;
import java.util.ArrayList;
import java.util.Scanner;
public class BadWords
{

        ArrayList<String> list = new ArrayList<String>();
        void list1() {

            list.add("stupid");
            list.add("idiot");
            list.add("nonsense");
            boolean containsSearchStr = list.stream().anyMatch("stupid"::equalsIgnoreCase);
        }

        public void replacebadwords() {
            Scanner sc = new Scanner(System.in);
            list1();
            System.out.println("Please Enter Any Word : ");
            String word = sc.nextLine();
            for(String word1 : list) {

                word=word.replace(word1, "*****");
            }
            System.out.println(word);
        }
        public static void main(String[] args) {

            BadWords jv = new BadWords();
            jv.replacebadwords();
        }

        private boolean equalsIgnoreCase(String string1) {
            return false;
        }
    }
