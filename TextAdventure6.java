import java.util.Scanner;
import java.util.Random;
import javafx.application.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.shape.Polygon;
import javax.xml.soap.*;
import javafx.scene.shape.Line;
import javafx.collections.ObservableList;
import javax.sound.sampled.*;

public class TextAdventure6 extends Application {
		@Override
		public void start(Stage stage) throws Exception {
		Scanner input = new Scanner(System.in);
		int user = 0;
		int min = 500;
		int max = 800;
		String[] addEquipment = {"knife","phone","butter"};
		
			// Create a new Pane
			Pane pane = new Pane();
		
			// Create two new Buttons
			Button button1 = new Button("Button 1");
			Button button2 = new Button("Button 2");
			Button button2_0 = new Button("Button 2");
			Button button2_1 = new Button("Button 2");
			Button button2_2 = new Button("Button 2");
			Button button2_3 = new Button("Button 2");
			Button button2_4 = new Button("Button 2");
			Button button2_5 = new Button("Button 2");
			Button button2_6 = new Button("Button 2");
			Button button2_7 = new Button("Button 2");
			Button button2_8 = new Button("Button 2");
			Button button2_9 = new Button("Button 2");
			Button button2_10 = new Button("Button 2");
			Button button2_11 = new Button("Button 2");
			Button button2_12 = new Button("Button 2");
			Button button2_13 = new Button("Button 2");
			Button button2_14 = new Button("Button 2");
			Button button2_15 = new Button("Button 2");
			Button button3 = new Button("Button 1");
			Button button4 = new Button("Button 1");
			Button button5 = new Button("Button 1");
			Button button6 = new Button("Button 1");
			Button button7 = new Button("Button 1");
			Button button8 = new Button("Button 1");
			Button button9 = new Button("Button 1");
			Button button10 = new Button("Button 1");
			Button button11 = new Button("Button 1");
			Button button12 = new Button("Button 1");
			Button button13 = new Button("Button 1");
			Button button14 = new Button("Button 1");
			Button button15 = new Button("Button 1");
			Button button16 = new Button("Button 1");
			Button button17 = new Button("Button 1");
			Button button18 = new Button("Button 1");
			Button button19 = new Button("Button 1");
			Button button20 = new Button("Button 1");
			Button button21 = new Button("Button 1");
			Button button22 = new Button("Button 1");
		
			// Add the buttons to the panel
			pane.getChildren().add(button1);
			pane.getChildren().add(button2);
			button1.setLayoutX(25);
			button1.setLayoutY(310);
			button2.setLayoutX(100);
			button2.setLayoutY(310);
			
			Line tri1 = new Line(25, 500, 100, 500);
			Line tri2 = new Line(100, 500, 25, 575);
			Line tri3 = new Line(25, 575, 25, 500);
			
			Line tri4 = new Line(25, 500, 100, 500);
			
			
			pane.getChildren().addAll(tri1,tri2,tri3);
			
			TextArea ta = new TextArea();
			ta.setText("--Translating into native language-- \n Welcome. Would you like to accept the incoming transmission? \n Please press 1 for yes or 2 for no.");
			pane.getChildren().add(ta);
		//text box dimentions
			ta.setPrefHeight(300);
			ta.setPrefWidth(700);
					//whole box dimentions
					Scene scene = new Scene(pane);
					stage.setScene(scene);
						stage.setWidth(700);
						stage.setHeight(600);
						stage.show();
			
				button1.setOnAction((event) -> {
						ta.setText("I cant believe I got through! \n You need to help me.\n My name is Tom and I just crash landed on a planet and my mapping system is not working. \n I need to get to the next safe site for a rescue team to come get me and I need your help to get me there alive. \n Please press 1 to continue message.");
						pane.getChildren().remove(button1);
									pane.getChildren().add(button3);
									button3.setLayoutX(25);
									button3.setLayoutY(310);
				});
			
			button2_0.setOnAction((event) -> {
					ta.setText("OK, have a nice day! \n -Transmission End-");
					pane.getChildren().remove(button2_0);
								pane.getChildren().add(button2_1);
								button2_1.setLayoutX(100);
								button3.setLayoutY(310);
			});
			
			
				button3.setOnAction((event) -> {
						ta.setText("First off, I want to thank you for helping me. Second is, I think I have a concussion. Im not thinking straight at the moment. \n My computer is saying I have about \n 600 hours left of life support in my suit. \n As for equipment I only have my E.A.S.I.(Environment Adventure Suit Insulator) suit and I really hope \n that I don't need to use the knife on anything, or anyone. \n Please press 1 to continue.");
						
						pane.getChildren().remove(button3);
									pane.getChildren().add(button4);
									button4.setLayoutX(25);
									button4.setLayoutY(310);
				});
				
				button4.setOnAction((event) -> {
						ta.setText("Should I stay in the crash site or should I start heading west to the rescue site? \n Press 1 to stay or 2 to leave.");
						pane.getChildren().remove(button4);
									pane.getChildren().add(button5);
									button5.setLayoutX(25);
									button5.setLayoutY(310);
									
						
					
				});
			
			button2.setOnAction((event) -> {
					ta.setText("Ok I will start heading west to the rescue cite. Ill try to stay awake while Im walking. \n --1 hour later-- \n You still there? \n I think I found something that is a bit life threatening. \n My wrist computer is telling me it is a big piece of shale \n that is on the way to the rescue cite. \n Should I try to go across it, or go around it and risk more time spent traveling and less life support? \n Press 1 to cross or 2 to go around.");
					
					pane.getChildren().remove(button5);
								pane.getChildren().add(button6);
								button6.setLayoutX(25);
								button6.setLayoutY(310);
					pane.getChildren().remove(button2);
								pane.getChildren().add(button2_1);
								button2_1.setLayoutX(100);
								button2_1.setLayoutY(310);
			
			});
			
			
			button5.setOnAction((event) -> {
					ta.setText("Tom stays in the crashed ship and falls asleep with a concussion. He dies in his sleep. \n Tom died. You just killed someone. good job. \n --Transmission End--");
					pane.getChildren().remove(button5);
								pane.getChildren().add(button6);
								button6.setLayoutX(25);
								button6.setLayoutY(310);
				
				
				
			});
			
			button6.setOnAction((event) -> {
					ta.setText("Ok, Im going to try crossing the shale. It looks very unstable but if your sure... \n *you hear a cracking sound followed by a lot of grunting* \n -2 hours later- \n Uh what happened? AAGHH my legs! Both my legs are broken! There is bone sticking through the suit! uuuuhhhh I don't feel right. \n ==life support failing== \n Tom has died. good job you successfully killed Tom and made him shorter. dwarf lover. \n --Transmission End--");
					pane.getChildren().remove(button6);
								pane.getChildren().add(button7);
								button7.setLayoutX(25);
								button7.setLayoutY(310);
			});
			
			button2_1.setOnAction((event) -> {
					ta.setText("Good thinking. Going around sounds like a smart move. \n It looks like it will be a bit before I actually get around this shale so I will contact you when Im past this obstacle. \n -30 minutes later- \n That was a bit of a walk. It looks like a straight shot to the rescue site. \n I'll contact you if something comes up. \n -4 hours later- \n here are some mountains coming up. Looks like there might be a path up the mountain and also a cave near the base. \n Press 1 to enter the cave or 2 to hike up the mountain.");
					pane.getChildren().remove(button2_1);
				pane.getChildren().add(button2_2);
				pane.getChildren().remove(button6); 
				pane.getChildren().add(button7);
				button7.setLayoutX(25);
				button7.setLayoutY(310);
								button2_2.setLayoutX(100);
								button2_2.setLayoutY(310);
				
				
				
			});
			
			button7.setOnAction((event) -> {
					ta.setText("The cave it is then! I really hope there isn't anything living on this planet that could be in there.\n So far so good. The cave has a bunch of this glowing stuff on the roof of the cave and lights it up enough I can see a bit. \n Im feeling really tired. I really need to lay down and get some sleep. \n Should I continue going deeper into the cave or stop to sleep? \n Press 1 to go deeper into the cave or 2 to take a nap.");
					pane.getChildren().remove(button7);
								pane.getChildren().add(button8);
								button8.setLayoutX(25);
								button8.setLayoutY(310);
								
			});
			
			button2_2.setOnAction((event) -> {
					ta.setText("The mountain looks like a very long trek up... you sure? well you haven't let me die yet so I guess ill keep following your great ideas \n -4 hours later- \n *pant* I dont think *pant* that Im going *pant* make it to the top of *pant* the mountain *pant* \n -Tom slips on some loose gravel and falls all the way to the bottom of the mountain and cracks open his helmet- \n -Tom has died. didn't think the mountain had loose gravel did you.- \n --Transmission End--");
					pane.getChildren().remove(button2_2);
								pane.getChildren().add(button2_3);
								button2_3.setLayoutX(100);
								button2_3.setLayoutY(310);
			});
			
			button8.setOnAction((event) -> {
					ta.setText("Im going to head beeper into the cave. Hopefully there is a way through the mountain. \n The tunnel is pretty big and long so I'll contact you if anything comes up. \n -15 minutes later- \n You still there! I can feel the ground shaking! It's either an earth quake or I guess an unknown planet quake or something very large coming toward me. \n What should I do!? \n Press 1 to hide behind some rocks or 2 for the Intimidation technique.");
					pane.getChildren().remove(button8);
								pane.getChildren().add(button9);
								button9.setLayoutX(25);
								button9.setLayoutY(310);
			});
			
			button2_3.setOnAction((event) -> {
					ta.setText("Your right. a nap would be great right now. \n -30 minutes later- \n -4 hours later- \n -Tom had died. Didn't you know that you shouldn't fall asleep with a concussion before getting medical help?- \n --Transmission End--");
					pane.getChildren().remove(button2_3);
								pane.getChildren().add(button2_4);
								button2_4.setLayoutX(100);
								button2_4.setLayoutY(310);
			});
			
			button9.setOnAction((event) -> {
					ta.setText("Great! Common sense says to hide from giant things.\n -Tom hides behind a large rock- \n *loud grunting and footsteps come closer and eventually pass Tom by* \n Holy $#%& (swearing filtered out for convience) did you see how big that thing was! \n Of course not your just a voice in my head but it was huge and an alien! \n There is actually alien life out in space! But for now I need to survive long enough to report this and save my life. \n I guess my only choice is to head deeper into the cave. There is no way Im going back and running into that creature again. \n If something comes up again i'll just hide like last time.\n So apparently this tunnel goes straight through this mountain. Like no turns or inclines or anything, just straight. It's actually super convenient.\n Im finally out of the tunnel. And I can see the rescue site! now all I have to do is wait and stay alive long enough for the rescue team to arrive.\n Press 1 for Tom to wait for the rescue team or 2 for more adventure...");
					pane.getChildren().remove(button9);
								pane.getChildren().add(button10);
								button10.setLayoutX(25);
								button10.setLayoutY(310);
								pane.getChildren().remove(button2_4);
											pane.getChildren().add(button2_5);
											button2_5.setLayoutX(100);
											button2_5.setLayoutY(310);
				
			});
			
			button2_4.setOnAction((event) -> {
					ta.setText("Intimidation always works against things that are bigger than you.\n When it gets closer ill jump out and use the guaranteed intimidation technique that my grandfather taught me when I was younger.\n *Tom jumps out in-front of the creature, followed by a lot of screeching, grunting, spitting and rapid hand movements* \n Tom has died.  Didn't think to take off your helmet before yelling and spitting at a giant monster did you. \n --Transmission End--");
					pane.getChildren().remove(button2_4);
								pane.getChildren().add(button2_5);
								button2_5.setLayoutX(100);
								button2_5.setLayoutY(310);
			});
			
			button10.setOnAction((event) -> {
					ta.setText("Your right! I'll just wait for the rescue team. No sense in continued exploration of a foreign planet with alien life on it without equipment. \n -Hours later- \n *loud engines roaring and coming closer* \n Holy $#%& (swearing filtered out for convience) they are actually here! \n Thank you so much for helping me survive for so long! I really owe you a lot who every you are. \n Tom successfully lives. Finally an ending that doesn't result in Toms gruesome demise.\n --Transmission End--");
					pane.getChildren().remove(button10);
								pane.getChildren().add(button11);
								button11.setLayoutX(25);
								button11.setLayoutY(310);
			});



			button2_5.setOnAction((event) -> {
					ta.setText("No your right! Im the first person to discover alien life. I need to discover more and be even more famous. \n Lets get exploring. \n Press 1 to continue.");
					pane.getChildren().remove(button2_5);
								pane.getChildren().add(button2_6);
								pane.getChildren().remove(button11);
											pane.getChildren().add(button12);
											button12.setLayoutX(25);
											button12.setLayoutY(310);
								button2_6.setLayoutX(100);
								button2_6.setLayoutY(310);
			});

			button11.setOnAction((event) -> {
					ta.setText("Before I continue my journey into the unknown, I need to remember the sizes of my air filter incase I need to replace it at a later date. \n My air filter is blue and I need to remember that for when I need to replace my air filter. \n Anyway Im going to keep traveling in the same direction. \n There is nothing really going on so it may be a while. \n Press 1 to check in with Tom. or Press 2 to wait until something interesting or unusual happens.");
					pane.getChildren().remove(button11);
								pane.getChildren().add(button12);
								button12.setLayoutX(25);
								button12.setLayoutY(310);
			});
			
			button12.setOnAction((event) -> {
					ta.setText("Yes I'm still here and yes I'm still walking. There might be some sort of forrest or jungle on the horizon if I'm not mistaken, or it's the carbon dioxide poisoning. \n Press 1 to check in again.");
					pane.getChildren().remove(button12);
								pane.getChildren().add(button13);
								button13.setLayoutX(25);
								button13.setLayoutY(310);
			});
				
		//	button2_6.setOnAction((event) -> {
			//		ta.setText("... \n ... \n ... \n ... \n -Please insert more change to extend call to... Tom.- \n -But your on your little computer and that little hole in the back isn't actually for change is it. \n  Well I just made you check your computer and if your that dumb then I'm cutting you off.- \n --Transmission End--");
			//		pane.getChildren().remove(button2_6);
				//				pane.getChildren().add(button2_7);
					//			button2_7.setLayoutX(100);
						//		button2_7.setLayoutY(310);
			//});
			
				
			button13.setOnAction((event) -> {
					ta.setText("So I just walked into a forrest. \n I know I must be dreaming or not seeing straight but I just walked into a tree!\n An actual tree!\n Im going to start exploring the forrest and see what I can find. \n Press 1 to check in with Tom again.");
					pane.getChildren().remove(button13);
								pane.getChildren().add(button14);
								button14.setLayoutX(25);
								button14.setLayoutY(310);
				});	
				
				button14.setOnAction((event) -> {
						ta.setText("So the forrest is pretty big and there are a ton of weird and unique plants here. \n Lots of giant trees and strange flowers. \n With so much plant life I am starting to wonder if I could just take off my helmet and be fine here. \nI don't have any device or sensor to tell if I wont die. Should I risk it? \n Press 1 to keep the helmet on or 2 to take the helmet off.");
						pane.getChildren().remove(button14);
									pane.getChildren().add(button15);
									button15.setLayoutX(25);
									button15.setLayoutY(310);
					});	
				
				button15.setOnAction((event) -> {
						ta.setText("OK fine I'll keep the helmet on. \n No way I'm taking the chance of being dead.\n but i don't have that much left of my air supply and I only have one other filter for my suit. That is not going to last me until I find another filter or ship to resupply my air.\n I guess i'll keep exploring until I die or get rescued and have the time left to think about what I have been doing with my life \n -Many hours of breathing and exploring later- \n My life support is about to run out. These are my final words... tell my wife I.... \n -Life support fail- \n -Life support fail- \n -Tom has died- \n -tell your wife what? that you thought she smelled ugly? ok ill tell her for you- \n --Transmission End--");
						pane.getChildren().remove(button15);
									pane.getChildren().add(button16);
									button16.setLayoutX(25);
									button16.setLayoutY(310);
					});	
			
				button2_6.setOnAction((event) -> {
						ta.setText("OK fine! On 3. \n 1... \n 2... \n 3! \n *gasp* *gasp* *gasp* I cant breath!... Just kidding! its supprisingly easy to breath here.\n And it smells a little like mint! How refreshing! \n WOW look at that flower! It's so beautiful. \n Itz so bezutiful... \n so beeutifool.. \n beiutifoul and tasty \n Itz wants me to joins it...\n Press 1 to yell at Tom to get him back to his senses or 2 to eat the beeutifool flowers!");
						pane.getChildren().remove(button2_6);
									pane.getChildren().add(button2_7);
									pane.getChildren().add(button16);
									button16.setLayoutX(25);
									button16.setLayoutY(310);
					
									button2_7.setLayoutX(100);
									button2_7.setLayoutY(310);
				});
			
			
			button16.setOnAction((event) -> {
					ta.setText("!!! \n AAHH this thing has teeth and the flower soo good looking \n Stop that! I need to get out of here and stop looking at these flowers and start looking for something edible for food \n This fruit looks ok i guess. it looks like a peach but with blue spots on it. Im going to take a bite out of it \n Press 1 to eat the mystery fruit? or 2 to test it out like a normal person");
					pane.getChildren().remove(button16);
								pane.getChildren().add(button17);
								pane.getChildren().add(button2_8);
								button2_8.setLayoutX(100);
								button2_8.setLayoutY(310);
								button17.setLayoutX(25);
								button17.setLayoutY(310);
				});	
			


			button2_7.setOnAction((event) -> {
				ta.setText("... \n !!! \n *CRUNCH* \n -Tom has been eaten by a very bootiful flower, flowers are so good for looking at- \n --Transmission End--");
				pane.getChildren().remove(button2_7);
				pane.getChildren().add(button2_8);
				button2_8.setLayoutX(100);
				button2_8.setLayoutY(310);
			});
			
			
			button17.setOnAction((event) -> {
					ta.setText("Wow this tastes like caramel popcorn my favorite! \n My stomach doesn't feel so good. \n I need a bathroom now!! \n -Tom just had the biggest bowel movement of his life, he would be lucky if he didn't pass a bone or two with that one- \n -Tom has died and is now lacking one or two necessary bones- \n --Transmission End--");
					pane.getChildren().remove(button17);
								pane.getChildren().add(button18);
								button18.setLayoutX(25);
								button18.setLayoutY(310);
				});
				
				button2_8.setOnAction((event) -> {
					ta.setText("What am I thinking! first you rub it on your skin to see if it irritates it. \n ... \n My skin just started to melt a little. \n Glad i didn't put that inside of my body. let's try to find something else that may be edible. \n Do you hear that?  \n It's like a sort of ticking sound but a little slow like one and a half ticks. \n Where is that coming from? \n Press 1 to look for the mysterious ticking noise. or 2 to ignore the obvious distraction.");
					pane.getChildren().remove(button2_8);
					pane.getChildren().add(button2_9);
					pane.getChildren().add(button19);
					button19.setLayoutX(25);
					button19.setLayoutY(310);
					button2_9.setLayoutX(100);
					button2_9.setLayoutY(310);
				});
			
			button18.setOnAction((event) -> {
					ta.setText("Wow this tastes like caramel popcorn my favorite! \n My stomach doesn't feel so good. \n I need a bathroom now!! \n -Tom just had the biggest bowel movement of his life, he would be lucky if he didn't pass a bone or two with that one- \n -Tom has died and is now lacking one or two necessary bones- \n --Transmission End--");
					pane.getChildren().remove(button18);
								pane.getChildren().add(button19);
								button19.setLayoutX(25);
								button19.setLayoutY(310);
				});
				
				button19.setOnAction((event) -> {
						ta.setText("What is that ticking noise I must find it. \n It's almost coming from inside this strange tree. \n I found it! it's weirdly shaped and has actual shapes instead of clock hands on it. \n It's also kind of slow for a clock and one of the shapes keeps disappearing and reappearing but never in the same spot. \n What could this possibly be used for?? \n I will try to send you an image of the thing but the image might be very simplistic because of the distance. \n To Be Continued!");
						pane.getChildren().remove(button19);
									pane.getChildren().add(button20);
									button20.setLayoutX(25);
									button20.setLayoutY(310);
					});
				
				button2_9.setOnAction((event) -> {
					ta.setText("I mean come on! it's just a ticking noise, maybe it's just in my head because of the strange atmosphere. \n Yes I think it was just in my head. Im going to move on. \n Ooohh maybe there is an ancient temple here with secret passage ways! I cant wait! \n To Be Continued!");
					pane.getChildren().remove(button2_9);
					pane.getChildren().add(button2_10);
					button2_10.setLayoutX(100);
					button2_10.setLayoutY(310);
				});
			
			
			
			
			SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
//			
			// Create to buttons
			Button btDecrease = new Button("-");
			Button btIncrease = new Button("+");
			
			// Create an register the handlers
			btDecrease.setOnAction(e -> {
				if (trianglePane.getOrder() > 0)
					trianglePane.setOrder(trianglePane.getOrder() - 1);
			});
			
			btIncrease.setOnAction(
				e -> trianglePane.setOrder(trianglePane.getOrder() + 1));
			
			// Pane to hold label, text field, and a button
			HBox hBox = new HBox(10);
			hBox.getChildren().addAll(btDecrease, btIncrease);
//			hBox.setAlignment(Pos.CENTER);
//			
//			BorderPane borderPane = new BorderPane();
//			borderPane.setCenter(trianglePane);
//			borderPane.setBottom(hBox);
//			
//			// Create a scene and place it in the stage
//			Scene scene = new Scene(borderPane, 200, 210);
//			primaryStage.setTitle("Exercise_18_19"); // Set the stage title
//			primaryStage.setScene(scene); // Place the scene in the stage
//			primaryStage.show(); // Display the stage
			
			scene.widthProperty().addListener(ov -> trianglePane.paint());
			scene.heightProperty().addListener(ov -> trianglePane.paint());
		}	
	public static void main(String[] args) {
			Application.launch(args);
			//			JFrame frame = new JFrame("Triangle GUI");
			//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//				frame.setSize(500, 500);
			//				frame.add(new TriangleGUI());
			//				frame.setVisible(true);
		}
}
//	
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			int[] xPoints = { 50, 100, 150 };
//			int[] yPoints = { 150, 50, 150 };
//			g.setColor(Color.RED);
//			g.fillPolygon(xPoints, yPoints, 3);
//				
//			xPoints = new int[] { 200, 250, 300 };
//			yPoints = new int[] { 150, 50, 150 };
//			g.setColor(Color.BLUE);
//			g.fillPolygon(xPoints, yPoints, 3);
//				
//			xPoints = new int[] { 350, 400, 450 };
//			yPoints = new int[] { 150, 50, 150 };
//			g.setColor(Color.GREEN);
//			g.fillPolygon(xPoints, yPoints, 3);
//				
//			xPoints = new int[] { 100, 200, 300 };
//			yPoints = new int[] { 300, 200, 300 };
//			g.setColor(Color.ORANGE);
//			g.fillPolygon(xPoints, yPoints, 3);
//				
//			xPoints = new int[] { 150, 250, 350 };
//			yPoints = new int[] { 400, 300, 400 };
//			g.setColor(Color.MAGENTA);
//			g.fillPolygon(xPoints, yPoints, 3);
				
//			pane.getChildren().remove(button12);
//						pane.getChildren().add(button13);
//						button13.setLayoutX(25);
//						button13.setLayoutY(310);

		/** Pane for displaying triangles */
		class SierpinskiTrianglePane extends Pane {
			private int order = 0;
			
			/** Set a new order */
			public void setOrder(int order) {
				this.order = order;
				paint();
			}
			
			/** Return the order */
			public int getOrder() {
				return order;
			}
			
			SierpinskiTrianglePane() {
			}
			
			protected void paint() {
				// Select three points in proportion to the pane size
//				Point2D p1 = new Point2D(getWidth() / 2, 10);
//				Point2D p2 = new Point2D(10, getHeight() - 10);
//				Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);
				
//				Polygon triangle = new Polygon();
//				ObservableList<Double> list = triangle.getPoints();
				
				//add points to the triangle
//				list.add(0,50.0);
//				list.add(1, 100.0);
//				list.add(2, 150.0);
//				
//				this.getChildren().clear(); // Clear the pane before redisplay
//				this.getChildren().add(triangle);
				//displayTriangles(order, p1, p2, p3);
				
				
			}
			
//			private void displayTriangles(int order, Point2D p1,
//					Point2D p2, Point2D p3) {
//				if (order == 0) {
//					// Draw a triangle to connect three points
//					Polygon triangle = new Polygon();
//					triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(),
//						p2.getY(), p3.getX(), p3.getY());
//					triangle.setStroke(Color.BLACK);
//					triangle.setFill(Color.WHITE);
//					
//					this.getChildren().add(triangle);
//				}
//				else {
//					//Get the midpoint on each edge in the triangle
//					Point2D p12= p1.midpoint(p2);
//					Point2D p23= p2.midpoint(p3);
//					Point2D p31= p3.midpoint(p1);
//					
//					// Recursively display three triangles
//					displayTriangles(order - 1, p1, p12, p31);
//					displayTriangles(order - 1, p12, p2, p23);
//					displayTriangles(order - 1, p31, p23, p3);
//				}
//			}
		}
	

//					
//								
//								
//								
//								
//								
//								
//					
//					
//					
//					}
//					
//					
//					
//						else {  System.out.println("Ok, good bye.");
//							System.out.println("--Transmission ended--");
//						
//					
//						}
//				
//				
//				
//				
//				
//				
//		
//	
//						
//		
//		
//		
			//}

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	
	/**Default construct*/
	protected GeometricObject() {
	}
	
	/**Construct a geometric object*/
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	/**Getter method for color*/
	public String getColor() {
		return color;
	}
	
	/**Setter method for color*/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**Getter method for filled. Since filled is boolean,
			so, the get method name is isFilled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**Setter method for filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**Abstract method findArea*/
	public abstract double getArea();
	
	/**Abstract method getPerimeter*/
	public abstract double getPerimeter();
	
	public abstract String howToColor();
}

class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSideOne() {
		return this.side1;
	}
	
	public double getSideTwo() {
		return this.side2;
	}
	
	public double getSideThree() {
		return this.side3;
	}
	
	public double getArea() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return Math.sqrt(perimeter * (
				(perimeter - this.side1) * 
				(perimeter - this.side2) * 
				(perimeter - this.side3)));
		
		
	}
	
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	public String howToColor() {
		return "Color all three sides";
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 +
				" side3 = " + this.side3;
	}
}
	
	