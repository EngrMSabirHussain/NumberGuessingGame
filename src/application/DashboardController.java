package application;

import java.util.Random;

import constents.MyStringConstents;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class DashboardController {
	
	Random r=new Random();
	int number=r.nextInt(100);
	int countNumber=0;
	
	String guessNumbersList="";
	String guessHintList="";
	String gameStatus="";

    @FXML
    private Button btnGuess;

    @FXML
    private Label count;

    @FXML
    private Label guessNumbers;

    @FXML
    private Label hint;

    @FXML
    private Label hint1;

    @FXML
    private Label hint11;

    @FXML
    private Label hint13;

    @FXML
    private Label hintsSigns;

    @FXML
    private TextField inputNumber;
    
    @FXML
    void GameRest(ActionEvent event) {

    	number=r.nextInt(100);
    	countNumber=0;
    	guessNumbersList="";
    	guessHintList="";
   	
    	count.setText(countNumber+"");
        guessNumbers.setText(guessNumbersList);	
    	hintsSigns.setText(guessHintList);
    	
    	hint.setText("");
    	
    }
   
   
    

    @FXML
    void GuessMyNumber(ActionEvent event) {
    	
    	int guess=Integer.parseInt(inputNumber.getText());
    	inputNumber.setText("");
    	
    	if(gameStatus=="win") {
    		GameRest(event);
    		
    		gameStatus="";
    	}
    	
    	if(guess>number) {
    		hint.setText(guess+MyStringConstents.greater);
    		
    		guessHintList+=MyStringConstents.greaterSign+"\t";
    	}
    	
    	else if(guess<number) {
    		hint.setText(guess+MyStringConstents.small);
    		
    		guessHintList+=MyStringConstents.smallSign+"\t";
    	}
    	
    	else if(guess==number) {
    		hint.setText(MyStringConstents.guess);
    		guessHintList+=MyStringConstents.equalSing+"\t";
    		
    		gameStatus="win";
    	}
    	
    	
    	countNumber++;
		count.setText(countNumber+"");
    	
    	guessNumbersList+=guess+"\t";
    	guessNumbers.setText(guessNumbersList);
    	
    	hintsSigns.setText(guessHintList);

    	
    }

}
