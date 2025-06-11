package xyz.game.util.simulation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Attributes {
    private List<Value> values = new ArrayList<>();
    // buff结束需要重新计算
    private int reCalculateTime = 0;

}

@Data
class Value {
    private int type;
    private double value;
}
