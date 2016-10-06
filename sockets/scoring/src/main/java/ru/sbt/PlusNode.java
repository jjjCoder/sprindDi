package ru.sbt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class PlusNode implements Node{
    private List<Node> childNodes=new ArrayList<>();
    @Override
    public double getResult(Map<String, Object> values) {
        List<Node> nodes=getNodes();
        double result=0;
        for(Node node:nodes){
            result+=node.getResult(values);
        }
        return result;
    }

    @Override
    public void addNode(Node node) {
        childNodes.add(node);
    }

    @Override
    public void removeNode(Node node) {
        childNodes.remove(node);
    }

    @Override
    public List<Node> getNodes() {
        return childNodes;
    }
}
