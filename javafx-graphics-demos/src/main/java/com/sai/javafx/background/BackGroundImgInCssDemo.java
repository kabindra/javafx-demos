package com.sai.javafx.background;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPaneBuilder;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.StackPaneBuilder;
import javafx.scene.layout.VBox;

import com.sai.javafx.common.ExtendedApplicationX;

public class BackGroundImgInCssDemo extends ExtendedApplicationX{

	@Override
	protected void setup() {
		StackPane body = StackPaneBuilder.create().styleClass("backgroundBody").build();
		ScrollPane sp = ScrollPaneBuilder.create().styleClass("backgroundBody","scroll-rack").fitToHeight(true).fitToWidth(true).build();
		StackPane header = StackPaneBuilder.create().styleClass("backgroundHeader").prefHeight(36).build();
		StackPane footer = StackPaneBuilder.create().styleClass("backgroundFooter").prefHeight(31).build();
		BorderPane bp = new BorderPane();
		bp.setCenter(sp);
		bp.setTop(header);
		bp.setBottom(footer);
		VBox vb = new VBox();
		for (int i = 0; i < 10; i++) {
			vb.getChildren().add(StackPaneBuilder.create().minHeight(181).styleClass("backgroundShelf").build());
		}
		sp.setContent(vb);
		root.getChildren().add(bp);
		scene.getStylesheets().add(this.getClass().getResource("/styles/template.css").toString());
	}

	public static void main(String[] args) {
		ExtendedApplicationX.launch(args);
	}
}
