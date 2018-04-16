package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller{

    @FXML
    private TextArea myTextArea1,myTextArea2;

    @FXML
    public void encrypt(){
        String message = myTextArea1.getText();
        String cipherText = "";
        int lenght = message.length();
        int shift = 10;
        if (shift > 33){
            shift = shift % 33;
        }else if (shift < 0){
            shift = (shift % 33 ) + 33;
        }
        for (int i = 0; i < lenght; i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch + shift);
                    if (c > 'я'){
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else {
                        cipherText += c;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char c = (char)(ch + shift);
                    if (c > 'Я'){
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else {
                        cipherText += c;
                    }
                }
            }
            else {
                cipherText += ch;
            }
        }
        myTextArea2.setText(cipherText);
    }

    @FXML
    public void decrypt(){
        String message = myTextArea1.getText();
        String cipherText = "";
        int lenght = message.length();
        int shift = 10;
        if (shift > 33){
            shift = shift % 33;
        }else if (shift < 0){
            shift = (shift % 33 ) + 33;
        }
        for (int i = 0; i < lenght; i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch - shift);
                    if (c < 'а'){
                        cipherText += (char)(ch + (26 - shift));
                    }
                    else {
                        cipherText += c;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char c = (char)(ch - shift);
                    if (c < 'А'){
                        cipherText += (char)(ch + (26 - shift));
                    }
                    else {
                        cipherText += c;
                    }
                }
            }
            else {
                cipherText += ch;
            }
        }
        myTextArea2.setText(cipherText);
    }
}