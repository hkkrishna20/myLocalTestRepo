import java.awt.*;
import java.util.*;
import java.applet.*;
/*<applet code="madhav12" width=300 height=22></applet>*/
public class madhav12 extends Applet
{
public void init()
{
 setLayout(new BorderLayout());
 add(new Button("this is across top"),BorderLayout.NORTH);
 add(new Button("the footer is across top"),BorderLayout.SOUTH);
 add(new Button("right"),BorderLayout.EAST);
 add(new Button("left"),BorderLayout.WEST);
 String msg="afafffj jkjfkjkj"+"jflkjlk jkjfjiojioj"+"flfkfjjf jijfijfljf";
 add(new TextArea(msg),BorderLayout.CENTER);
 }}
