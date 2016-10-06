package ru.sbt;

import java.util.List;
import java.util.Map;

public class ParameterNode implements Node {
    private final String keyName;

    public ParameterNode(String keyName) {
        this.keyName = keyName;
    }

    @Override
    public double getResult(Map<String, Object> values) {
        Object value=values.get(keyName);
        if(value instanceof Number){
            return ((Number)value).doubleValue();
        }
        return 0;
    }

    @Override
    public void addNode(Node node) {

    }

    @Override
    public void removeNode(Node node) {

    }

    @Override
    public List<Node> getNodes() {
        return null;
    }
}
