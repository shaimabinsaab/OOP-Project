public class MovablePoint implements Movable{
private int x;
private int y;
private int xspeed;
private int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void MoveUp() {
        System.out.println(y-=yspeed);
    }

    @Override
    public void MoveDowen() {
        System.out.println(y+=yspeed);

    }

    @Override
    public void MoveLeft() {
        System.out.println(x-=xspeed);

    }

    @Override
    public void MoveRight() {

        System.out.println(x+=xspeed);

    }
}
