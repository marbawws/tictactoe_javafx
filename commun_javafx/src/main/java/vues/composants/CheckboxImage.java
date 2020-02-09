package vues.composants;

import java.io.InputStream;

import commun.debogage.J;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;

public abstract class CheckboxImage extends HBox {
	
	protected ImageView imageView;
	
	public CheckboxImage(String url) {
		super();
		J.appel(this);
		
        InputStream streamImage = CheckboxImage.class.getResourceAsStream(url);

        Image image = new Image(streamImage);

        imageView = new ImageView(image);

        this.getChildren().add(imageView);

        this.setAlignment(Pos.CENTER);
	}
}

