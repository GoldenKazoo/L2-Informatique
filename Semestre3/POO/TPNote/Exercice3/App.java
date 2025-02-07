import fr.lacl.cpo.Drawing;

public class App
{
    public void draw_square(int x, int y, Drawing window)
    {
        int posX = x;
        int posY = y;
        
        int i = 0;
        int j = 0;
        while(i < 50)
        
        {
            while (j < 50)
            
            {
                window.point(x, y);
                y++;
                j++;
            }
            x++;
           i++;
        }
    }
    public static void main(String[] args)
    {
        
        int x = 0;
        int y = 0;
        Drawing window = new Drawing("test", 1080, 720);
        while (x < 64)
        {
            while (y < 64)
            {
                draw_square(x,y, window);
                x = x + 50;
            }
        }
    }
}
