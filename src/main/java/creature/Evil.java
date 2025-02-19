package creature;

import annotations.Info;
import battle.Map;
import bullet.Bullet;
import bullet.StraightBulletGenerator;
import creature.enumeration.Camp;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.LinkedList;


/**
 * @author csl
 * @date 2019/11/25 12:41
 */
@Info(description = "Evil,no too many difference with creature")
public class Evil extends EvilCreature {//妖精是在BattleControler中创建的

    public Evil(Map map, LinkedList<Bullet> bullets) {
        super(map, bullets);
        //设置image
        URL url = this.getClass().getClassLoader().getResource("pictures/" + "lolo.png");
        this.image = new Image(url.toString());//这样很麻烦，最好能抽象出一个Image类，保存所有图片，以后的
        //构造器就直接用
        this.camp = Camp.EVIL;
        this.attackValue = EVIL_ATK;
        this.defenseValue = EVIL_DEF;
        bulletGenerator = new StraightBulletGenerator();
    }

    @Override
    public String getSimpleName() {
        return "Evil";
    }

    @Override
    public void resetState() {
        this.MAX_HP = DEFAULT_MAX_HP;
        this.currentHP = this.MAX_HP;
        this.attackValue = EVIL_ATK;
        this.defenseValue = EVIL_DEF;
        this.alive = true;
        this.moveRate = DEFAULT_MOVE_RATE;
    }

}
