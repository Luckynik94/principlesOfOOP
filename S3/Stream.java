package com.example;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream(List<StudyGroup> groups) {
        this.groups = groups;
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }
}