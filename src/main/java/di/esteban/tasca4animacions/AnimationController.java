package di.esteban.tasca4animacions;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class AnimationController {
    public Text userText;
    public Text passText;
    public Button butonenviar;
    public Text titulo;

    private Bounds corUser ;
    private Bounds corPass ;
    private Bounds corTitulo;


    public void enviar(ActionEvent actionEvent) {
    }

    public void cargar(){

        //Guardamos cordenadas
        corUser= userText.localToScene(userText.getBoundsInLocal());
        corPass= passText.localToScene(passText.getBoundsInLocal());
        corTitulo= titulo.localToScene(titulo.getBoundsInLocal());
        System.out.println("Cordenadas boton " +corTitulo.getCenterX());
        animacion();
    }

    public void animacion(){
        //Rotate
    animationRotate(userText);
    animationRotate(passText);
    animationWalk(titulo);

    }

    public void animationRotate(Text texto){

        RotateTransition rotate= new RotateTransition();
        rotate.setDuration(Duration.millis(5000));
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setNode(texto);
        rotate.play();

    }

    public void animationWalk(Text texto){

            TranslateTransition translateTransition= new TranslateTransition();

            translateTransition.setDuration(Duration.seconds(1));
            translateTransition.setFromX(0);
            translateTransition.setToX(100);
            translateTransition.setFromY(0);
            translateTransition.setToY(-10);

            translateTransition.setCycleCount(Animation.INDEFINITE);
            translateTransition.setAutoReverse(true);

            translateTransition.setNode(texto);
            translateTransition.play();

    }
}
