package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("All Controls");

        
        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("some text...");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        ProgressBar progressBar = new ProgressBar(0.49);
        Slider slider = new Slider();

        
        HBox buttonBox = new HBox(5, new Label("Button:"), button);
        HBox checkBoxBox = new HBox(5, new Label("CheckBox:"), checkBox);
        HBox hyperlinkBox = new HBox(5, new Label("Hyperlink:"), hyperlink);
        HBox toggleButtonBox = new HBox(5, new Label("ToggleButton:"), toggleButton);
        HBox radioButtonBox = new HBox(5, new Label("RadioButton:"), radioButton);
        HBox labelBox = new HBox(5, new Label("Label:"), label);
        HBox textFieldBox = new HBox(5, new Label("TextField:"), textField);
        HBox passwordFieldBox = new HBox(5, new Label("PasswordField:"), passwordField);
        HBox textAreaBox = new HBox(5, new Label("TextArea:"), textArea);
        HBox progressIndicatorBox = new HBox(5, new Label("ProgressIndicator:"), progressIndicator, new Label("49%"));
        HBox progressBarBox = new HBox(5, new Label("ProgressBar:"), progressBar);
        HBox sliderBox = new HBox(5, new Label("Slider:"), slider);

        
        VBox vbox = new VBox(10, buttonBox, checkBoxBox, hyperlinkBox, toggleButtonBox, radioButtonBox, labelBox, textFieldBox, passwordFieldBox, textAreaBox, progressIndicatorBox, progressBarBox, sliderBox);
        vbox.setPadding(new javafx.geometry.Insets(10));
        vbox.setAlignment(javafx.geometry.Pos.TOP_LEFT);

        
        Scene scene = new Scene(vbox, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
