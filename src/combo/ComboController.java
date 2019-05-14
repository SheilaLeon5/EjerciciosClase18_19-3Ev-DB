

package combo;
 


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class ComboController {
    @FXML private Text actiontarget;
    @FXML private TextField usr;
    @FXML private PasswordField pass;
    
    
    @FXML protected void handleSubmitButton_Action(ActionEvent event) {
    	String texto= usr.getText() + " /" + pass.getText();
       actiontarget.setText(texto);
 
    }
    

}
