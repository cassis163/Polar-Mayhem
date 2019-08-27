import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextHelper {
    public static String readln() throws IOException {
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void showWelcome() {
        println(" ***  WELCOME at the  ***");
        println("   *  three PENGUINS  *");
        println("   *  and a POLARBEAR *");
        println("   *      ZOO         *");
        println("");
        println(" This week, YOU will be the ZOO caretaker");
    }

    public static void showInstructions() {
        println("You must feed the animals to keep up the zoo.");
        println("Use 'new day' to advance to the next day");
        println("Use 'feed penguin' to throw a fish to the penguins");
        println("Take care that all penguins are fed each day");
        println("Oh, and dont forget the polar bear.");
    }

    public static void showWinScreen() {
        println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        println(":::::::::::::::::::::::::::::::::::::::://::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        println(":::::::::::::::::::::::::::::::::::::::yNmmo:::::::::::::/::::::::::::::::::::::::::::::::::::::::::");
        println("::::::::::::::::::::::::::::::::::::::yMMNMyoso::::::::+mmdo::::::::::::::::::::::::::::::::::::::::");
        println(":::::::::::odmh/::::::::::::::::::::/dMMMMdy++/:::::::sNMNNs+oo/::::::::::::::::::::::::::::::::::::");
        println("::::::::++/yNMMmo///:::::::::::::::oNMMMMd.o::::::::omMMMMhs+oo/::::::::::::::::::::::::::::::::::::");
        println(":::::::/osddmdNMMNNNmhs::::::::::::NMMMMMy -+::::::yMMMMMo-o::::::::::::::::::::::::::::::::::::::::");
        println("+/////:::/+/+:-yNMMNs:::::::::::::oMMMMMMMy:/y+:::+NMMMMM/`+/:::::::::::::::::::::::::::::::::::::::");
        println("/oyhy+:::::+s`  :mMMNy:::::::::::-sMMMMMm+/:-yo:::hMMMMMNm:-o-::::::::::::::::::::::::::::::::::::::");
        println("+//::-----om.    :NMMMo-----------yMMMMMN:  /+---:mMMMMM/---+---------------------------------------");
        println("----------+s.    `hMMMy----------:dMMMMMN- :o:---+MMMMMM: `o:---------------------------------------");
        println("-----------/+     oMMMy-::/+++osydNMNNMNo:sy+///sNMMMMNs.:+/----------------------------------------");
        println("------------/+-`./dMMMmhys+//::-//:---:o++osossdNmdhdmmysho+:---------------------------------------");
        println("-------------:yhhNNho+o/``               ``    ....``..--:/osso+:-----------------------------------");
        println("-----------:shyys+-`                                        `.:/oso+/:------------------------------");
        println("---------:sh+.```                                                `-+ossssooo++++sy+::---------------");
        println("--------/ho.`                                                          ```../ooo/-::++/+/:----------");
        println("-----:+/:-`                WELL DONE!                                      `ho::.   .+`.:oso+:------");
        println("----/s:`                                                                    ./++.    `    `.:/++----");
        println("----s./`             ``                                                      `             `  +mdo--");
        println("--.od/+             `````                                                   ``                -ysd:-");
        println("...omh:             `````                                                    `             -:::/+h:.");
        println("....:ss `            ``./`               -                                          `.-::::oossys:..");
        println("...../m-``            ``./.              /-`                        ```` ````...////+oo+///:::-.....");
        println(".....-sm/.`        .`    ./`             ./:                     //++sysss+::+sss//-................");
        println(".......mms-``      ``    `:-`             `s/`              `o-`/Ny+://:-...........................");
        println("......+mo+y+.``       ``-+s+-             `/o.             -ss./m+..................................");
        println("....-+s:..-sy+.``    ```./hd-```         `-hmh`            -h/-+:...................................");
        println("..:+o-....-+hMmy-`    ```.:ds/:-......:++sys+m-`            -do.....................................");
        println(":ho-.....-sMmdsoho.    ```.yMNNmdhhoo+/:.....ss:.`           .yo....................................");
        println("/d-......omy:...-ys.    ```yh:::--...........-/sys/.`         `+y+-.................................");
        println(" sh-.....-:+:` ``oy.`    `.hs.......```````      .sdo-`         .sd:           `````````````...`````");
        println(" `ho---..-ysh`   /h.`    `.+o/```                 /d+yo:``        -yy+++:`                          ");
        println("  .oyyyhyyNNo    /m-.``      .//+s/`             /d+..:oso/.```     -+:-/sy/                        ");
        println(".......-:::.``...+N+::..````  `:o:m+`......`````sy-......:yds/-.```    `/s:y-``````````````````     ");
        println("``````````````````/o++//+/////+ss+/.````````````:yysysssyysyyhosyo+++///+ms+-......```````````````  ");
    }

    public static void showNoPenguinToHunt() {
        println("There is no penguin left to hunt for the polar bear. You better be careful!");
    }

    public static void showNoPenguinFed() {
        println("The zoo caretaker ate the fish himself.");
    }

    public static void showBye() {
        println("Bye ...");
    }

    public static void showInvalidCommand(String cmd) {
        println(String.format("The Zoo caretaker does not understand '%s'.", cmd));
    }

    public static void showStatus(int penguinsAlive) {
        String statusMessage = "";

        switch (penguinsAlive) {
            case 0:
                statusMessage = "Just a lonely dead? polar bear."; break;
            case 1:
                statusMessage = "One penguin and a polar bear."; break;
            case 2:
                statusMessage = "Two penguins and a polar bear."; break;
            case 3:
                statusMessage = "Three penguins and a polar bear."; break;
        }

        println(statusMessage);
    }
}
