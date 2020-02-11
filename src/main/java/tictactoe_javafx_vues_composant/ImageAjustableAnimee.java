package tictactoe_javafx_vues_composant;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import commun.debogage.J;
import javafx.animation.*;
import javafx.beans.NamedArg;
import javafx.scene.image.Image;
import javafx.util.Duration;
import vues.composants.ImageAjustable;

public class ImageAjustableAnimee extends ImageAjustable {
	// bro idk
	List<Image> images = new ArrayList<>();

	Transition animation = new Transition() {
		{
			setCycleDuration(Duration.millis(1100)); // temps total que l'image reste
		}

		@Override
		protected void interpolate(double fraction) {
			
			int index = (int) (fraction * (images.size() - 1));
			imageView.setImage(images.get(index));
			
		}
	};

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
		InputStream streamImage = ImageAjustable.class.getResourceAsStream(url);
		Image image = new Image(streamImage);
		this.images.add(image);
	}

}
