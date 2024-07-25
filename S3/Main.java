package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");
        StudyGroup group4 = new StudyGroup("Group 4");

        Stream stream1 = new Stream(Arrays.asList(group1, group2));
        Stream stream2 = new Stream(Arrays.asList(group3, group4, group1));
        Stream stream3 = new Stream(Arrays.asList(group2));

        List<Stream> streams = Arrays.asList(stream1, stream2, stream3);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        System.out.println("Before sorting:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroups().size() + " groups.");
        }

        controller.sortStreams(streams);

        System.out.println("\nAfter sorting:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroups().size() + " groups.");
        }
    }
}