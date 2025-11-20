public class MyStrings
{
    public static void main(String[] args)
    {
        String msg = "The people who are crazy enough to think they can change the world are the ones who do.";

        System.out.println("My message:\n" + msg);
        System.out.println(msg.length());

        String firstSubs = msg.substring(4, 10);
        System.out.println("msg.substring(4, 10): " + firstSubs);
        System.out.println(firstSubs.length());

        String secondSubs = msg.substring(41);
        System.out.println("msg.substring(41): " + secondSubs);
        System.out.println(secondSubs.length());

        String people = msg.substring(4, 10);
        System.out.println(people);

        System.out.println("Last three characters: " + msg.substring(msg.length() - 3));

        System.out.println("firstSubs: " + firstSubs);
        System.out.println("secondSubs: " + secondSubs);

        System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));

        String newStr = "people";
        System.out.println("firstSubs.equals(newStr): " + firstSubs.equals(newStr));

        System.out.println("msg.charAt(0) is: " + msg.charAt(0));
        System.out.println("Last character of msg: " + msg.charAt(msg.length() - 1));

        System.out.println("msg.charAt(0) == 'A': ");
        System.out.println(msg.charAt(0) == 'A');
    }
}
