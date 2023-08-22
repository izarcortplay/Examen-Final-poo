import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

    public class PreguntasApp extends Application {

        private Stage stage;
        private Scene scene;
        private Label preguntaLabel;
        private Button opcionAButton, opcionBButton, opcionCButton, opcionDButton;
        private int preguntasCorrectas = 0;
        private int preguntasIncorrectas = 0;

        @Override
        public void start(Stage primaryStage) {
            stage = primaryStage;
            VBox layout = new VBox();

            preguntaLabel = new Label("Pregunta aquí");
            opcionAButton = new Button("Opción A");
            opcionBButton = new Button("Opción B");
            opcionCButton = new Button("Opción C");
            opcionDButton = new Button("Opción D");

            opcionAButton.setOnAction(e -> verificarRespuesta("A"));
            opcionBButton.setOnAction(e -> verificarRespuesta("B"));
            opcionCButton.setOnAction(e -> verificarRespuesta("C"));
            opcionDButton.setOnAction(e -> verificarRespuesta("D"));

            layout.getChildren().addAll(preguntaLabel, opcionAButton, opcionBButton, opcionCButton, opcionDButton);

            scene = new Scene(layout, 400, 300);
            stage.setScene(scene);
            stage.setTitle("Preguntas App");
            stage.show();
        }

        private void verificarRespuesta(String opcionSeleccionada) {


            cargarPreguntaAleatoria();
        }

        private void cargarPreguntaAleatoria() {

        }

        public static void main(String[] args) {
            launch(args);
        }
    }


