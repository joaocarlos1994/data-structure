package br.com.datastructure.nonbinary;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NonBinaryNode {

    private int data;
    private List<NonBinaryNode> childrens = new LinkedList<>();

    public NonBinaryNode(int data) {
        this.data = data;
    }

    public void addNonBinaryNode(final NonBinaryNode nonBinaryNode) {
        this.childrens.add(nonBinaryNode);
    }

    public List<NonBinaryNode> getChildrens() {
        return Collections.unmodifiableList(childrens);
    }

    public NonBinaryNode getFirstChildren() {
        if (childrens.isEmpty()) {
            return null;
        }
        return childrens.get(0);
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NonBinaryNode{" + "data=" + data + '}';
    }
}
