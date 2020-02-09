package tictactoe_javafx_vues_composant;

import commun.debogage.J;
import javafx.animation.*;
import javafx.beans.NamedArg;
import javafx.util.Duration;
import vues.composants.ImageAjustable;

public class ImageAjustableAnimee extends ImageAjustable {

	private Timeline animationSurvol = new Timeline();

	public ImageAjustableAnimee(@NamedArg("url") String url) {
		super(url);
		J.appel(this);
		
		/*
		 * Timeline animation = new Timeline(); double tempsCle01Milisecondes = 0;
		 * Duration tempsCle01 = new Duration(tempsCle01Milisecondes); KeyValue
		 * valeurCle01 = new KeyValue(opacityProperty(), 0.8); KeyFrame cle01 = new
		 * KeyFrame(tempsCle01, valeurCle01); animation.getKeyFrames().add(cle01);
		 * animation.getKeyFrames().add(new KeyFrame(new Duration(1000), new
		 * KeyValue(opacityProperty(),0.5))); animation.setCycleCount(20);
		 * animation.setCycleCount(-1); animation.playFromStart(); animation.stop();
		 */
		/*creerAnimation();
		animationSurvol.setCycleCount(10);
		animationSurvol.playFromStart();*/
	}

	private void creerAnimation() {

		J.appel(this);

		double delaiMilisecondes = 600;
		double opaciteNormale = 1.0;
		double opaciteBasse = 0.6;

		animationSurvol.getKeyFrames()
				.add(new KeyFrame(Duration.ZERO, new KeyValue(opacityProperty(), opaciteNormale)));

		animationSurvol.getKeyFrames()
				.add(new KeyFrame(new Duration(delaiMilisecondes), new KeyValue(opacityProperty(), opaciteBasse)));

		animationSurvol.getKeyFrames().add(
				new KeyFrame(new Duration(delaiMilisecondes * 2), new KeyValue(opacityProperty(), opaciteNormale)));
	}
}
