package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (FormulaImpl)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@SuppressWarnings("serial")
public class FormulaImpl extends Model<FormulaImpl> {

    private Integer attributeId;

    private Integer formulaId;

    private String formulaImpl;


    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Integer formulaId) {
        this.formulaId = formulaId;
    }

    public String getFormulaImpl() {
        return formulaImpl;
    }

    public void setFormulaImpl(String formulaImpl) {
        this.formulaImpl = formulaImpl;
    }

}

