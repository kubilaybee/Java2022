package StringDemo;

public class Main {
    public static void main(String[] args){
        // String
        String dailyMessage = "The weather is so beatiful on today";
        System.out.println(dailyMessage);

//        System.out.println("Text Size=>"+dailyMessage.length());
//        System.out.println("5. Char is=>"+dailyMessage.charAt(5));
//        System.out.println(dailyMessage.concat("Hello Again !!"));
//        System.out.println(dailyMessage.startsWith("K"));
//        System.out.println(dailyMessage.endsWith("."));
//        char[] chars = new char[5];
//        dailyMessage.getChars(0,5,chars,0);
//        System.out.println(chars);
//        System.out.println(dailyMessage.indexOf("is"));
//        System.out.println(dailyMessage.lastIndexOf("so"));

        String newDailyMessage = dailyMessage.replace("","-");
        System.out.println(newDailyMessage);
        System.out.println(dailyMessage.substring(8,11));

        for (String word : dailyMessage.split(" ")){
            System.out.println(word);
        }
        System.out.println(dailyMessage.toLowerCase());
        System.out.println(dailyMessage.toUpperCase());
        // the trim delete first and end space
        System.out.println(dailyMessage.trim());
    }
}
