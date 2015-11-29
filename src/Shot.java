/**
 * Created by SteveLeeLX on 11/28/15.
 */
import javax.swing.ImageIcon;


public class Shot extends Sprite {

    private String shot = "spacepix/shot.png";
    private final int H_SPACE = 15;
    private final int V_SPACE = 10;

    public Shot() {
    }

    public Shot(int x, int y) {

        ImageIcon icon = new ImageIcon(this.getClass().getResource(shot));
        setImage(icon.getImage());
        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }
}