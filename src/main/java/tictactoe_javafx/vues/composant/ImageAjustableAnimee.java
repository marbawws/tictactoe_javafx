package tictactoe_javafx.vues.composant;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import commun.debogage.J;
import javafx.animation.*;
import javafx.beans.NamedArg;
import javafx.scene.image.Image;
import javafx.util.Duration;
import commun_javafx.vues.composants.ImageAjustable;

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
	}; // code venant de https://stackoverflow.com/questions/47876381/javafx-and-sprite-animation-how-do-i-make-an-animation-cycle-to-change-pictures, le champ d'instance animation

	public ImageAjustableAnimee(@NamedArg("url") String url) {
		super(url);
		J.appel(this);
		ajouterImages("/images/x_rouge.png");
		ajouterImages("/images/animation_frame2.png");
		ajouterImages("/images/animation_frame3.png");
		ajouterImages("/images/animation_frame4.png");
		ajouterImages("/images/animation_frame5.png");
		ajouterImages("/images/animation_frame6.png");
		ajouterImages("/images/animation_frame2.png");
		ajouterImages("/images/animation_frame7.png");
		ajouterImages("/images/animation_frame8.png");
		ajouterImages("/images/animation_frame5.png");
		ajouterImages("/images/animation_frame6.png");
		ajouterImages("/images/x_rouge.png");
		animation.setCycleCount(-1);
		animation.playFromStart();

	}

	private void ajouterImages(String url) {
		J.appel(this);
		InputStream streamImage = ImageAjustable.class.getResourceAsStream(url);
		Image image = new Image(streamImage);
		this.images.add(image);
	}

}
