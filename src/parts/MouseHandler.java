
package parts;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author czimbortibor
 */
public class MouseHandler implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent event){
        if ( ((Door)event.getSource()).getSelected() ){
            ((Door)event.getSource()).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
            ((Door)event.getSource()).setSelected(false);
        } else{
            ((Door)event.getSource()).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_selected.png")));
            ((Door)event.getSource()).setSelected(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }
    
    @Override
    public void mouseExited(MouseEvent me) {
      
    }
}
