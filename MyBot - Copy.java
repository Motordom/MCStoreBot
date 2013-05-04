import org.jibble.pircbot.*;

public class MyBot extends PircBot {

  public MyBot() {
    this.setName("MTRDbot");
  }

	public void onPrivateMessage(String sender, String login, String hostname, String message) {
	
	// Declare variables
		String thing = "";
		String bay = "";
		int baynum = 0;
		String side = "";
		int entry = 0;
		String type = "";
		int id = 0;
		int data = 0;
		String pm = "";
		
	
		
	// Make sure it's one of us - don't spam randoms
		if (sender.contains("WizardCM") || sender.contains("Motordom"))  {
			
			// Items/Blocks - in order of ID
				if (message.contains("?help")) {
					pm = "Help";
				}
				else if ((message.contains("?stone")) || (message.contains("?1"))) {
					thing = "Stone";
					bay = "L"; baynum = 1;
					side = "L"; entry = 1;
					type = "Block"; id = 1;
					pm = "Storage";
				}
				else if ((message.contains("?grass")) || (message.contains("?2"))) {
					thing = "Grass";
					bay = "L"; baynum = 3;
					side = "R"; entry = 7;
					type = "Block"; id = 2;
					pm = "Storage";
				}
				else if ((message.contains("?dirt")) || (message.contains("?3"))) {
					thing = "Dirt";
					bay = "R"; baynum = 1;
					side = "L"; entry = 2;
					type = "Block"; id = 3;
					pm = "Storage";
				}
				else if ((message.contains("?cobble")) || (message.contains("?4"))) {
					thing = "Cobblestone";
					bay = "L"; baynum = 1;
					side = "L"; entry = 2;
					type = "Block"; id = 4;
					pm = "Storage";
				}
				else if ((message.contains("?oakplank")) || (message.contains("?5"))) {
					thing = "Oak Wood Planks";
					bay = "R"; baynum = 1;
					side = "L"; entry = 1;
					type = "Block"; id = 5; data = 0;
					pm = "Storage";
				}
				else if ((message.contains("?spruceplank")) || (message.contains("?5.1"))) {
					thing = "Spruce Wood Planks";
					bay = "R"; baynum = 1;
					side = "L"; entry = 2;
					type = "Block"; id = 5; data = 1;
					pm = "Storage";
				}
				else if ((message.contains("?birchplank")) || (message.contains("?5.2"))) {
					thing = "Birch Wood Planks";
					bay = "R"; baynum = 1;
					side = "L"; entry = 3;
					type = "Block"; id = 5; data = 2;
					pm = "Storage";
				}
				else if ((message.contains("?jungleplank")) || (message.contains("?5.3"))) {
					thing = "Jungle Wood Planks";
					bay = "R"; baynum = 1;
					side = "L"; entry = 4;
					type = "Block"; id = 5; data = 3;
					pm = "Storage";
				}
				else if ((message.contains("?oaksapling")) || (message.contains("?6"))) {
					thing = "Oak Sapling";
					bay = "L"; baynum = 5;
					side = "L"; entry = 1;
					type = "Item"; id = 6; data = 0;
					pm = "Storage";
				}
				else if ((message.contains("?sprucesapling")) || (message.contains("?6.1"))) {
					thing = "Spruce Sapling";
					bay = "L"; baynum = 5;
					side = "L"; entry = 2;
					type = "Item"; id = 6; data = 1;
					pm = "Storage";
				}
				else if ((message.contains("?birchsapling")) || (message.contains("?6.2"))) {
					thing = "Spruce Sapling";
					bay = "L"; baynum = 5;
					side = "R"; entry = 1;
					type = "Item"; id = 6; data = 2;
					pm = "Storage";
				}
				else if ((message.contains("?junglesapling")) || (message.contains("?6.3"))) {
					thing = "Jungle Sapling";
					bay = "L"; baynum = 5;
					side = "R"; entry = 2;
					type = "Item"; id = 6; data = 3;
					pm = "Storage";
				}
    		else if (message.contains("?cmds")) {
					pm = "Commands";
				}
    		else if ((message.contains("?7")) || (message.contains("?8")) || (message.contains("?8")) || (message.contains("?9")) || (message.contains("?10")) || (message.contains("?11"))) {
					pm = "None";
				}
    		else if (message.contains("?depart")) {
					pm = "Depart";
				}
  			else if (message.contains("?exit")) {
					pm = "Exit";
				}
				
			
		// Respond via Private Message
			if (pm == "Storage") {
				sendNotice(sender, ((char) 3) + "13" + type + " " + ((char) 2) + thing + " [ID " + id + ((data == 0) ? "" : ":" + data) + "]" + ((char) 15) + ((char) 3) + "13" + " is in " + ((char) 29) + "Bay " + bay + baynum + "." + side + entry);
			}
			else if (pm == "Help") {
				sendNotice(sender, ((char) 3) +  "13" + "NAMEbot is a Minecraft helper bot coded by" + ((char) 3) + "04" + " @MotordomT & @WizardCM " + ((char) 3) + "13" + "in Java using PircBOT, primarily designed for finging items in the Motordom-WizardCM Storage Centre.");
			}
			else if (pm == "Commands") {
				sendNotice(sender, "?stone ?grass ?dirt ?cobble ?oakplank ?spruceplank ?birchplank ?jungleplank ?help ?depart ?exit");
			}
			else if (pm == "None") {
				sendNotice(sender, "Not a valid obtainable item/block.");
			}
			else if (pm == "Depart") {
				sendNotice(sender, "Departing channel. To return, use ?return in a private message (non-functional yet)");
				partChannel("#cloudbot", "departing");
			}
			else if (pm == "Exit") {
				sendNotice(sender, "Shutting down NAMEBot.");
				System.exit(0); 
			} */
		}
	}
}


/*
Add function to turn bot on/off
Convert if to switch/case
Finish list of data values & id's
Add more internal documentation
Add permission denial message
Think of name for bot
Add TFS?
Work out if you can do contains grass, 2
Config file?????????????????????
*/