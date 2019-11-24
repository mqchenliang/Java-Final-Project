/**
 * @author csl
 * @date 2019/11/24 14:53
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("battle.fxml"));
        primaryStage.setTitle("葫芦娃vs妖精");
        primaryStage.setScene(new Scene(root, 1200.0D, 800.0D)); //设置初始的窗口大小
        primaryStage.show();

        //监听窗口关闭事件，回收线程
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.out.print("窗口关闭");
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
