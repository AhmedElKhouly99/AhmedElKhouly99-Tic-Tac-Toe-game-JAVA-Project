/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe_server;

import Database.Database;
import game.Game;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import player.Player;

/**
 *
 * @author ahmed
 */
public class TicTacToeServer extends Application {

    @Override
    public void init() throws Exception {
         new Database(); //// Initiallizing database class
    }
    
    
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {    
            
            @Override
            public void handle(ActionEvent event) {
//*******FOR TESTING DB FUNCTIONS**************************************************
                Player p1 = new Player("khouly", "12345",'m');
                //Player p2 = new Player("Adel", "srftf", 'm');
                Player p2 = Database.isPlayer("Adel", "srftf");
                Game g = new Game(4,7 ,'x','o','x','o','x','x','o','x','x');
//                boolean isConnected = db.startConnection();
//                System.out.println(isConnected);
                
//                boolean isAdded = Database.addPlayer(p2);
//                System.out.println(isAdded);
                //boolean isExist = Database.isPlayer(p2.getUsername(), p2.getPassword());
                if(p2 != null){
                    p2.setScore(100);
                    Database.editPlayer(p2);
                }
//                System.out.println(isExist);
//                if(!isExist){
//                    Database.addPlayer(p2);
//                }else{
//                    p2.setScore(100);
//                    Database.editPlayer(p2);
//                }
//                boolean isGAdded = Database.addGame(g);
//                System.out.println(isGAdded);
                Game g1 = Database.getGame(7, 4);
                if(g1 != null){
                    System.err.println("g1 exists");
                    if(g1.getPlayer1_id() == 7){
                        System.err.println("Player 1 : X");
                    }else{
                        System.err.println("Player 1 : O");
                    }
                }else{
                    Database.addGame(g);
                    System.err.println("g1 doesn't exsit");
                }
//***********************************************************************************
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
