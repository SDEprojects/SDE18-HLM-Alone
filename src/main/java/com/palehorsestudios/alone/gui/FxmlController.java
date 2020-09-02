package com.palehorsestudios.alone.gui;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;

public class FxmlController {
  @FXML private TextArea curActivity;
  @FXML private TextArea playerInput;
  @FXML private TextArea playerStat;
  @FXML private TextArea dailyLog;
  @FXML private TextField dateAndTime;
  @FXML private TextField weather;
  @FXML private Button enterBtn;

  public FxmlController() {}

  public TextArea getCurActivity() {
    return curActivity;
  }

  public TextArea getPlayerInput() {
    return playerInput;
  }

  public TextArea getPlayerStat() {
    return playerStat;
  }

  public TextArea getDailyLog() {
    return dailyLog;
  }

  public TextField getDateAndTime() {
    return dateAndTime;
  }

  public TextField getWeather() {
    return weather;
  }

  public Button getEnterButton() {
    return enterBtn;
  }
}
