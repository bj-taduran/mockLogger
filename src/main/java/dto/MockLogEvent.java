package main.java.dto;

import javafx.event.ActionEvent;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public final class MockLogEvent extends ActionEvent {

    private MockLogEvent () {}

    private static MockLogEvent instance;

    public static MockLogEvent getInstance() {

        if (instance == null) {
            synchronized (MockLogEvent.class){
                if(instance == null) {
                    instance = new MockLogEvent();
                }
            }
        }

        return instance;
    }

    private ConcurrentHashMap mockLogDefinitions;

    public void addMockLog(String name, String ... logLevels) {
        Set logSet = null;
        for (String logLevel: logLevels) {
            logSet.add(logLevel);
        }

        mockLogDefinitions.put(name, logSet);
    }

}
