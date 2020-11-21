package lr3.controllers;

import lr3.models.group.Group;

public class GroupCreator {
    public Group group;

    public GroupCreator(String name) {
        this.group = new Group(name);
    }
}
