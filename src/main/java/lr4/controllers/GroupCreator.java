package lr4.controllers;

import lr4.models.group.Group;

public class GroupCreator {
    public Group group;

    public GroupCreator(String name) {
        this.group = new Group(name);
    }
}
