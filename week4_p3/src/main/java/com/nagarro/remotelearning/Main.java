package com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) {
        StoryCreator storyCreator = new StoryCreator();
        String story = storyCreator.createStory(5);
        System.out.println(story);
    }
}