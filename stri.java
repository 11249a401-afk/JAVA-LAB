class StringOperationsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Substring of str1 from index 2: " + str1.substring(2));
        System.out.println("Substring of str2 from index 0 to 3: " + str2.substring(0, 3));
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated string: " + combined);
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());
    }
}
