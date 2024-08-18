public class Einfach {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java ist toll");
        sb.reverse();
        System.out.println(sb);

        String text= "class.java";
        System.out.println("class.java sollte isTextFile: false, test: "+isTextFile(text));
        text="index.html";
        System.out.println("index.html sollte isTextFile: false, test: "+isTextFile(text));
        text="word.txt";
        System.out.println("word.txt sollte isTextFile: true, test: "+isTextFile(text));
        text="word.TXT";
        System.out.println("word.TXT sollte isTextFile: true, test: "+isTextFile(text));
    }
    public static boolean isTextFile(String text){
        if((text.contains(".txt")) || (text.contains(".TXT"))){
            return true;
        }return false;
    }
}
