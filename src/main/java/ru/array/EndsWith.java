package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        return word[word.length - 1] == post[post.length - 1];
    }
}
