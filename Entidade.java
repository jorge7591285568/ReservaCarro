import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("controller/Login.fxml"));
        scene = new Scene(loader.load(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
            Parent parent = loader.load();
            Object controller = loader.getController();
            if (controller != null) {
                parent.getProperties().put("controller", loader.getController());
            }
            return parent;
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao carregar o arquivo " + fxml).show();
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
