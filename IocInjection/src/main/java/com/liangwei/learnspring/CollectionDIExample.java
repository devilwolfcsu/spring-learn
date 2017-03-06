package com.liangwei.learnspring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 强类型容器注入
 * Created by liangwei on 2017/3/6.
 */
public class CollectionDIExample {

    private List<String>  names;

    private Map<String,Integer>  scores;

    private Set<String> className;

    private Properties properties;


    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public void setClassName(Set<String> className) {
        this.className = className;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getNames() {
        return names;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public Set<String> getClassName() {
        return className;
    }

    public Properties getProperties() {
        return properties;
    }
}
