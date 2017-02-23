
package parts;

/**
 *
 * @author czimbortibor
 */
public class Door extends javax.swing.JButton{
    private String behind;
    private boolean selected;
    private boolean selectedByRandom;

    public Door(String string) {
        super(string);
        this.behind = "goat";
        this.selected = false;
        this.selectedByRandom = false;
    }
    
    public void setBehind(String behind) {
        this.behind = behind;
    }
    
    public String getBehind() {
        return this.behind;
    }
    
    public boolean getSelected(){
        return this.selected;
    }
    
    @Override
    public void setSelected(boolean value){
        this.selected = value;
    }

    public boolean getSelectedByRandom() {
        return selectedByRandom;
    }

    public void setSelectedByRandom(boolean selectedByRandom) {
        this.selectedByRandom = selectedByRandom;
    } 
    
}
