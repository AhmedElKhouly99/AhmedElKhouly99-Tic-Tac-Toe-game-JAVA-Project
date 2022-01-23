/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author ahmed
 */
public class Player {
    
    int id;
    String username;
    String password;
    char gender;
    char x_o;
    int score;
    
    public Player(String username, String password, char gender) {
        //this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
//        this.x_o = x_o;
//        this.score = score;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getX_o() {
        return x_o;
    }

    public void setX_o(char x_o) {
        this.x_o = x_o;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }       
}
