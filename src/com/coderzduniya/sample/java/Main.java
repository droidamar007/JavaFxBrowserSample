package com.coderzduniya.sample.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Loading launcher view
        final URL location = getClass().getResource("/resources/home-browser.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        final Parent root = fxmlLoader.load(location.openStream());
        //Creating scene
        Scene scene = new Scene(root);
        primaryStage.setTitle("CoderzDuniya Sample Browser");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        //Showing application
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
