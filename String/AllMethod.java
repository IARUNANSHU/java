package String;


import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class AllMethod {

    public static void main(String[] args) {
        String str = "Hello World";

        // charAt(int index)
        System.out.println("charAt(1): " + str.charAt(1));

        // codePointAt(int index)
        System.out.println("codePointAt(1): " + str.codePointAt(1));

        // codePointBefore(int index)
        System.out.println("codePointBefore(1): " + str.codePointBefore(1));

        // codePointCount(int beginIndex, int endIndex)
        System.out.println("codePointCount(0, 5): " + str.codePointCount(0, 5));

        // compareTo(String anotherString)
        System.out.println("compareTo(\"Hello World\"): " + str.compareTo("Hello World"));

        // compareToIgnoreCase(String str)
        System.out.println("compareToIgnoreCase(\"hello world\"): " + str.compareToIgnoreCase("hello world"));

        // concat(String str)
        System.out.println("concat(\"!!!\"): " + str.concat("!!!"));

        // contains(CharSequence s)
        System.out.println("contains(\"World\"): " + str.contains("World"));

        // contentEquals(CharSequence cs)
        System.out.println("contentEquals(\"Hello World\"): " + str.contentEquals("Hello World"));

        // contentEquals(StringBuffer sb)
        System.out.println("contentEquals(new StringBuffer(\"Hello World\")): " + str.contentEquals(new StringBuffer("Hello World")));

        // copyValueOf(char[] data)
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("copyValueOf(data): " + String.copyValueOf(data));

        // copyValueOf(char[] data, int offset, int count)
        System.out.println("copyValueOf(data, 1, 3): " + String.copyValueOf(data, 1, 3));

        // endsWith(String suffix)
        System.out.println("endsWith(\"World\"): " + str.endsWith("World"));

        // equals(Object anObject)
        System.out.println("equals(\"Hello World\"): " + str.equals("Hello World"));

        // equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase(\"hello world\"): " + str.equalsIgnoreCase("hello world"));

        // format(Locale l, String format, Object... args)
        System.out.println("format(Locale.US, \"%s, %d\", \"Hello\", 10): " + String.format(Locale.US, "%s, %d", "Hello", 10));

        // format(String format, Object... args)
        System.out.println("format(\"%s, %d\", \"Hello\", 10): " + String.format("%s, %d", "Hello", 10));

        // getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("getBytes(): " + new String(bytes));

        // getBytes(Charset charset)
        byte[] utf8Bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes(UTF_8): " + new String(utf8Bytes));

        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] chars = new char[5];
        str.getChars(0, 5, chars, 0);
        System.out.println("getChars(0, 5, chars, 0): " + new String(chars));

        // hashCode()
        System.out.println("hashCode(): " + str.hashCode());

        // indexOf(int ch)
        System.out.println("indexOf('W'): " + str.indexOf('W'));

        // indexOf(int ch, int fromIndex)
        System.out.println("indexOf('o', 5): " + str.indexOf('o', 5));

        // indexOf(String str)
        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));

        // indexOf(String str, int fromIndex)
        System.out.println("indexOf(\"o\", 5): " + str.indexOf("o", 5));

        // intern()
        String internedStr = str.intern();
        System.out.println("intern(): " + internedStr);

        // isEmpty()
        System.out.println("isEmpty(): " + str.isEmpty());

        // join(CharSequence delimiter, CharSequence... elements)
        System.out.println("join(\", \", \"Hello\", \"World\"): " + String.join(", ", "Hello", "World"));

        // lastIndexOf(int ch)
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));

        // lastIndexOf(int ch, int fromIndex)
        System.out.println("lastIndexOf('o', 5): " + str.lastIndexOf('o', 5));

        // lastIndexOf(String str)
        System.out.println("lastIndexOf(\"World\"): " + str.lastIndexOf("World"));

        // lastIndexOf(String str, int fromIndex)
        System.out.println("lastIndexOf(\"o\", 5): " + str.lastIndexOf("o", 5));

        // length()
        System.out.println("length(): " + str.length());

        // matches(String regex)
        System.out.println("matches(\"Hello.*\"): " + str.matches("Hello.*"));

        // offsetByCodePoints(int index, int codePointOffset)
        System.out.println("offsetByCodePoints(1, 2): " + str.offsetByCodePoints(1, 2));

        // regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        System.out.println("regionMatches(true, 6, \"world\", 0, 5): " + str.regionMatches(true, 6, "world", 0, 5));

        // regionMatches(int toffset, String other, int ooffset, int len)
        System.out.println("regionMatches(6, \"World\", 0, 5): " + str.regionMatches(6, "World", 0, 5));

        // replace(char oldChar, char newChar)
        System.out.println("replace('l', 'L'): " + str.replace('l', 'L'));

        // replace(CharSequence target, CharSequence replacement)
        System.out.println("replace(\"World\", \"Java\"): " + str.replace("World", "Java"));

        // replaceAll(String regex, String replacement)
        System.out.println("replaceAll(\"l\", \"L\"): " + str.replaceAll("l", "L"));

        // replaceFirst(String regex, String replacement)
        System.out.println("replaceFirst(\"l\", \"L\"): " + str.replaceFirst("l", "L"));

        // split(String regex)
        String[] words = str.split(" ");
        System.out.println("split(\" \"): ");
        for (String word : words) {
            System.out.println(word);
        }

        // split(String regex, int limit)
        String[] wordsLimited = str.split(" ", 2);
        System.out.println("split(\" \", 2): ");
        for (String word : wordsLimited) {
            System.out.println(word);
        }

        // startsWith(String prefix)
        System.out.println("startsWith(\"Hello\"): " + str.startsWith("Hello"));

        // startsWith(String prefix, int toffset)
        System.out.println("startsWith(\"World\", 6): " + str.startsWith("World", 6));

        // subSequence(int beginIndex, int endIndex)
        System.out.println("subSequence(0, 5): " + str.subSequence(0, 5));

        // substring(int beginIndex)
        System.out.println("substring(6): " + str.substring(6));

        // substring(int beginIndex, int endIndex)
        System.out.println("substring(0, 5): " + str.substring(0, 5));

        // toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        // toLowerCase()
        System.out.println("toLowerCase(): " + str.toLowerCase());

        // toLowerCase(Locale locale)
        System.out.println("toLowerCase(Locale.US): " + str.toLowerCase(Locale.US));

        // toString()
        System.out.println("toString(): " + str.toString());

        // toUpperCase()
        System.out.println("toUpperCase(): " + str.toUpperCase());

        // toUpperCase(Locale locale)
        System.out.println("toUpperCase(Locale.US): " + str.toUpperCase(Locale.US));

        // trim()
        String strWithSpaces = "  Hello World  ";
        System.out.println("trim(): " + strWithSpaces.trim());

        // valueOf(boolean b)
        System.out.println("valueOf(true): " + String.valueOf(true));

        // valueOf(char c)
        System.out.println("valueOf('c'): " + String.valueOf('c'));

        // valueOf(char[] data)
        System.out.println("valueOf(data): " + String.valueOf(data));

        // valueOf(char[] data, int offset, int count)
        System.out.println("valueOf(data, 1, 3): " + String.valueOf(data, 1, 3));

        // valueOf(double d)
        System.out.println("valueOf(123.45): " + String.valueOf(123.45));

        // valueOf(float f)
        System.out.println("valueOf(123.45f): " + String.valueOf(123.45f));

        // valueOf(int i)
        System.out.println("valueOf(123): " + String.valueOf(123));

        // valueOf(long l)
        System.out.println("valueOf(123456789L): " + String.valueOf(123456789L));

        // valueOf(Object obj)
        System.out.println("valueOf(new Object()): " + String.valueOf(new Object()));
    }
}
