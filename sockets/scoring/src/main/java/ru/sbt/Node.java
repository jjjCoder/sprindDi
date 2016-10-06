package ru.sbt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface Node {
    double getResult(Map<String, Object> values);
    void addNode(Node node);
    void removeNode(Node node);
    List<Node> getNodes();
}

