package tictactoe_javafx.vues.composant;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import commun.debogage.J;
import javafx.animation.*;
import javafx.beans.NamedArg;
import javafx.scene.image.Image;
import javafx.util.Duration;

public class ImageAjustableAnimee extends ImageAjustable {

	List<Image> images = new ArrayList<>();

	Transition animation = new Transition() {
		{
			setCycleDuration(Duration.millis(1100));
		}

		@Override
		protected void interpolate(double fraction) {
			int index = (int) (fraction * (images.size() - 1));
			imageView.setImage(images.get(index));

		}
	}; // code venant de
		// https://stackoverflow.com/questions/47876381/javafx-and-sprite-animation-how-do-i-make-an-animation-cycle-to-change-pictures,
		// le champ d'instance animation

	public ImageAjustableAnimee(@NamedArg("url") String url) {
		super(url);
		J.appel(this);
		ajouterImages();



	}


	private void ajouterImages() {
		J.appel(this);
		ajouterImage("/images/x_rouge.png");
		ajouterImage("/images/animation_frame2.png");
		ajouterImage("/images/animation_frame3.png");
		ajouterImage("/images/animation_frame4.png");
		ajouterImage("/images/animation_frame5.png");
		ajouterImage("/images/animation_frame6.png");
		ajouterImage("/images/animation_frame2.png");
		ajouterImage("/images/animation_frame7.png");
		ajouterImage("/images/animation_frame8.png");
		ajouterImage("/images/animation_frame5.png");
		ajouterImage("/images/animation_frame6.png");
		ajouterImage("/images/x_rouge.png");
	}

	private void ajouterImage(String url) {
		J.appel(this);
		InputStream streamImage = ImageAjustable.class.getResourceAsStream(url);
		Image image = new Image(streamImage);
		this.images.add(image);
	}

	public void startAnimation() {
		J.appel(this);
		
		animation.setCycleCount(-1);
		animation.playFromStart();
	}

	public void stopAnimation() {
		J.appel(this);
		animation.stop();
		imageView.setImage(images.get(0));
		
	}
}
