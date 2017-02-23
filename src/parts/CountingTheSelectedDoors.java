
package parts;

import javax.swing.JOptionPane;

/**
 *
 * @author czimbortibor
 */
public class CountingTheSelectedDoors implements Runnable {
    private Door[] doors = new Door[3];
    
    public CountingTheSelectedDoors(Door[] doors) {
        this.doors = doors;
    }
    
    @Override
    public void run() {
        while( !Thread.currentThread().isInterrupted() ){
            int nr = 0;
            for (Door d : this.doors) {
                if ( d.getSelected() ) {
                    ++nr;
                }
            }
            if ( nr > 1 ) {
                JOptionPane.showMessageDialog(null, "Only 1 door can be selected!", "Error", 0);
                for (Door d : this.doors) {
                    d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_simple.png")));
                    d.setSelected(false);
                }
            }
        }
        Thread.currentThread().interrupt();
    }
}
