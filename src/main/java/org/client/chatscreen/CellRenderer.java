package org.client.chatscreen;

import javafx.geometry.Pos;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.util.Callback;
import org.server.messages.User;


/**
 * A Class for Rendering users images / name on the userlist.
 */
class CellRenderer implements Callback<ListView<User>,ListCell<User>>{
        @Override
    public ListCell<User> call(ListView<User> p) {

            return new ListCell<>(){

            @Override
            protected void updateItem(User user, boolean bln) {
                super.updateItem(user, bln);
                setGraphic(null);
                setText(null);
                if (user != null) {
                    HBox hBox = new HBox();

                    Text name = new Text(user.getName());

                    //ImageView statusImageView = new ImageView();
                    //Image statusImage = new Image(Objects.requireNonNull(getClass().getClassLoader().getResource(STR."img/\{user.getStatus().toString().toLowerCase()}.png")).toString(), 16, 16,true,true);
                    //statusImageView.setImage(statusImage);

                    //ImageView pictureImageView = new ImageView();
                    //Image image = new Image(Objects.requireNonNull(getClass().getClassLoader().getResource("img/user.png")).toString(),50,50,true,true);
                   // pictureImageView.setImage(image);

                    hBox.getChildren().addAll(name);
                    hBox.setAlignment(Pos.CENTER_LEFT);

                    setGraphic(hBox);
                }
            }
        };
    }
}